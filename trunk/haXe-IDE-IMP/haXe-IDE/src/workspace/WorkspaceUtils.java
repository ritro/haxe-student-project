package workspace;

import imp.parser.antlr.HaxeLexer;
import imp.parser.antlr.HaxeParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import tree.HaxeTree;
import tree.HaxeTreeAdaptor;
import workspace.editor.HxFilesEditor;

public abstract class WorkspaceUtils
{
    private static final int BOM_MAX_LENGTH = 3;
    private static final Map<Charset, int[]> BOM_CHARSET;
    static {
        Map<Charset, int[]> aMap = new HashMap<Charset, int[]>();
        aMap.put(Charset.forName("UTF-16BE"), new int[] {0xFE, 0xFF});
        aMap.put(Charset.forName("UTF-16LE"), new int[] {0xFF, 0xFE});
        aMap.put(Charset.forName("UTF-8"),    new int[] {0xEF, 0xBB, 0xBF});
        BOM_CHARSET = Collections.unmodifiableMap(aMap);
    }

    // Additional BOMs - add as needed
    //          {0x00, 0x00, 0xFE, 0xFF},
    //          {0xFF, 0xFE, 0x00, 0x00},
    //          {0x2B, 0x2F, 0x76, 0x38},
    //          {0x2B, 0x2F, 0x76, 0x39},
    //          {0x2B, 0x2F, 0x76, 0x2B},
    //          {0x2B, 0x2F, 0x76, 0x2F},
    //          {0xDD, 0x73, 0x66, 0x73},
    //          {0x0E, 0xFE, 0xFF},
    //          {0xFB, 0xEE, 0x28},

    public static IViewPart showViewPart(final String id)
    {
        IViewPart part = null;
        try
        {
            part = PlatformUI.getWorkbench().
                getActiveWorkbenchWindow().getActivePage().showView(id);
        }
        catch (PartInitException e)
        {
            System.out.println("Couldn't open the view, id: " + id);
            Activator.logger.error(
                    "WorkspaceUtils.showViewPart PartInitException for view with id ", 
                    id);
        }
        return part;
    }
    
    public static void jumpToLocation(final IFile file, final HaxeTree node)
    {
        if (node == null)
        {
            return;
        }
        jumpToLocation(file, node.getIdentifierOffset(), node.getIdentifierLength());
    }
    
    public static void jumpToLocation(final IFile file, final int offset, final int length)
    {
        if (file == null)
        {
            return;
        }
        try
        {
            IEditorPart editor = WorkspaceUtils.openFileInEditor(file);
            if (!(editor instanceof HxFilesEditor))
            {
                return;
            }
            HxFilesEditor hxEditor = (HxFilesEditor)editor;
            hxEditor.selectAndReveal(offset, length);
        }
        catch (Exception e)
        {
            String message = "WorkspaceUtils.jumpToLocation: " + e.getLocalizedMessage();
            Activator.logger.error(message);
        }
    }
    
    public static void createFolder(final IFolder folder) throws CoreException 
    {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolder((IFolder) parent);
        }
        if (!folder.exists()) {
            folder.create(false, true, null);
        }
    }
    
    public static String getConcatenatedPath(final String parentPath, final String childPath) 
    {
        if (parentPath.isEmpty())
        {
            return childPath;
        }
        
        return (new File(parentPath, childPath)).getPath();
    }
    
    /**
     * Paths with files without '.hx' extention will return null.
     */
    public static String getHaxeFileNameFromPath(final String path)
    {
        if (!path.endsWith(".hx"))
        {
            return null;
        }
        String pathWithoutExtention = path.substring(0, path.length() - 3);
        int lastDotIndex = pathWithoutExtention.lastIndexOf('.');
        if (lastDotIndex == -1)
        {
            lastDotIndex = 0;
        }
        String filename = pathWithoutExtention.substring(lastDotIndex);
        return filename;
    }
    
    public static String converPathToPackage(final String path)
    {
        int end = Math.max(path.length(), path.lastIndexOf('.'));
        String exceptExtention = path.substring(0, end);
        return exceptExtention.replace('/', '.');
    }
    
    public static HaxeTree parseFileContents(final InputStream contentStream) 
            throws RecognitionException, IOException
    {
        PushbackInputStream stream = new PushbackInputStream(contentStream, BOM_MAX_LENGTH);
        Charset encoding = getEncoding(stream);
        if (encoding != null)
        {
            HaxeLexer lexer = 
                    new HaxeLexer(new ANTLRInputStream(contentStream, encoding.toString())); 
            return parseFileContents(lexer);           
        }
        HaxeLexer lexer = new HaxeLexer(new ANTLRInputStream(stream)); 
        return parseFileContents(lexer);
    }
    
    public static HaxeTree parseFileContents(final String contents) 
            throws RecognitionException
    {
        HaxeLexer lexer = new HaxeLexer(new ANTLRStringStream(contents));
        return parseFileContents(lexer);
    }
    
    public static HaxeTree parseFileContents(final CommonTokenStream tokenStream) 
            throws RecognitionException
    {
        HaxeParser parser = new HaxeParser(tokenStream);
        parser.setTreeAdaptor(new HaxeTreeAdaptor());
        HaxeParser.module_return parserResult = parser.module();
        return (HaxeTree) parserResult.getTree();
    }
    
    private static HaxeTree parseFileContents(final HaxeLexer lexer) 
            throws RecognitionException
    {
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        return parseFileContents(tokenStream);
    }
    
    /**
     * Now it returns encoding name only if it one of the follows:
     * UTF-8, UTF-16BE, UTF-16LE. In the last case it leave BOM
     * bytes read - so the next read operation on that stream should
     * begin from next byte.
     * @return Encording name
     * @throws IOException
     */
    public static Charset getEncoding(PushbackInputStream stream) throws IOException
    {
        final int buffer[] = new int[BOM_MAX_LENGTH];
        Charset encoding = null;
        for(int i = 0; i < BOM_MAX_LENGTH; i++) 
        {
            int r = stream.read();
            if(r == -1)
              break;
            else
              buffer[i] = r;
        }
        
        // Detect if BOM is present
        int bomLength = 0;
        for(Charset charset : BOM_CHARSET.keySet()) 
        {
          final int[] bom = BOM_CHARSET.get(charset);
          if(compareArrays(bom, buffer)) 
          {
            bomLength = bom.length;
            encoding = charset;
          }
        }

        // Push back bytes read that were not part of BOM
        for (int index = buffer.length - 1; index >= bomLength; index--) {
          if (buffer[index] != -1)
            stream.unread(buffer[index]);
        }
        
        return encoding;
    }
    
    /**
     * Simply compaires two arrays byte by byte.
     * @return true if equal.
     */
    private static boolean compareArrays(int[] bom, int[] bytes) 
    {
        for (int index = 0; index < bom.length; index++) 
        {
            if (bom[index] != bytes[index])
              return false;
          }
          return true;
    }
    
    public static IEditorPart openFileInEditor(final IFile file) throws PartInitException
    {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IEditorDescriptor desc = PlatformUI.getWorkbench().
                getEditorRegistry().getDefaultEditor(file.getName());
        IEditorPart editor = page.openEditor(new FileEditorInput(file), desc.getId());
        return editor;
    }
}
