package workspace;

import haxe.imp.parser.antlr.main.HaxeLexer;
import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.HaxeTreeAdaptor;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class WorkspaceUtils
{
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
    
    public static String converPathToPackage(final String path)
    {
        int end = Math.max(path.length(), path.lastIndexOf('.'));
        String exceptExtention = path.substring(0, end);
        return exceptExtention.replace('/', '.');
    }
    
    public static HaxeTree parseFileContents(final InputStream contentStream) 
            throws RecognitionException, IOException
    {
        HaxeLexer lexer = new HaxeLexer(new ANTLRInputStream(contentStream));
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
    
    public static HaxeTree getNodeUnderCursor(
            final int offset,final int length, final HaxeTree currentAST)
    {
        if (currentAST == null)
        {
            return null;
        }
        HaxeTree result = null;
        for (HaxeTree child : currentAST.getChildren())
        {
            result = getNodeUnderCursor(offset, length, child);
            if (result != null)
            {
                return result;
            }
        }
        if (currentAST.getMostLeftPosition() <= offset &&
                currentAST.getMostRightPosition() >= offset + length)
        {
            HaxeTree parent = currentAST.getParent();
            if (parent != null 
                    && ( parent instanceof MethodCallNode || parent instanceof SliceNode))
            {
                return parent;
            }
            return currentAST;
        }
        return null;
    }
}
