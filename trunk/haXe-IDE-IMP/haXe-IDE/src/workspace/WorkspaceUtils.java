package workspace;

import haxe.imp.parser.antlr.main.HaxeLexer;
import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.HaxeTreeAdaptor;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.UnarExpressionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;

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
import org.eclipse.imp.preferences.PreferenceValueParserprs.IsNullable;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class WorkspaceUtils
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
    
    public static boolean isNodeValidForUsageAnalysis(final HaxeTree node)
    {
    	if (isNodeValidForCallAnalysis(node)
    			|| node instanceof ClassNode
    			|| node instanceof EnumNode
    			|| node instanceof VarDeclarationNode)
    	{
    		return true;
    	}
    	
    	return false;
    }
    
    public static HaxeTree getValidNodeForUsageAnalysis(final HaxeTree supposedNode)
    {
        return getValidNodeForUsageAnalysis(supposedNode, -1);
    }
    
    /**
     * Gets the node for which you can calculate usages from the node
     * the was under cursor for example.
     * @param offset - in most cases it is unneccassary but then you
     * want to take node from that side of equation (e.g.) there the cursor
     * is - then you should set offset
     */
    public static HaxeTree getValidNodeForUsageAnalysis(final HaxeTree supposedNode, final int offset)
    {
    	if (supposedNode == null || supposedNode instanceof ErrorNode 
    	        || supposedNode instanceof ConstantNode)
    	{
    		return null;
    	}
    	if (isNodeValidForUsageAnalysis(supposedNode))
    	{
    		return supposedNode;
    	}
    	if (supposedNode instanceof VarUsageNode)
    	{
    		HaxeTree node = ((VarUsageNode)supposedNode).getDeclarationNode();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	// TODO getValidNodeForUsageAnalysis - what to do with DotIdents?
    	if (supposedNode instanceof AssignOperationNode)
    	{
    	    AssignOperationNode assign = (AssignOperationNode)supposedNode;
    	    HaxeTree node = null;
    	    if (offset == -1 || 
    	            assign.getToken().getStartIndex() + assign.getToken().getText().length() > offset)
    	    {
    	        node = assign.getLeftOperand();
    	    }
    	    else
    	    {
    	        node = assign.getRightOperand();
    	    }
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof SliceNode)
    	{
    		HaxeTree node = ((SliceNode)supposedNode).getDeclarationNode();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof MethodCallNode)
    	{
    		HaxeTree node = ((MethodCallNode)supposedNode).getDeclarationNode();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof NewNode)
    	{
    		HaxeTree node = ((NewNode)supposedNode).getObjectWhichIsCreated();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof UnarExpressionNode)
    	{
    		HaxeTree node = ((UnarExpressionNode)supposedNode).getExpression();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof ReturnNode)
    	{
    		HaxeTree node = ((ReturnNode)supposedNode).getExpression();
    		if (node == null)
    		{
    			return getValidNodeForUsageAnalysis(node, offset);
    		}
    		// if not it will return the parent by default algorithm
    	}
    	return getValidNodeForUsageAnalysis(supposedNode.getParent(), offset);
    }
    
    /**
     * Checks if node is valid for making a call hierarchy.
     */
    public static boolean isNodeValidForCallAnalysis(final HaxeTree node)
    {
        if (node == null || !(node instanceof FunctionNode))
        {
            return false;
        }
    	
    	return true;
    }
    
    /**
     * Gets the most upper node valid for making a call hierarchy. If 
     * supposed node isn't the one it will check the parent of the 
     * supposed node.
     * @param supposedNode node we are now on (the cursor is in that node
     * or selection was in that node)
     * @return valid node for making call hierarchy
     */
    public static HaxeTree getValidNodeForCallAnalysis(final HaxeTree supposedNode)
    {
    	if (supposedNode == null || supposedNode instanceof ErrorNode)
    	{
    		return null;
    	}
    	if (isNodeValidForCallAnalysis(supposedNode))
    	{
    		return supposedNode;
    	}
    	if (supposedNode instanceof NewNode)
    	{
    		// TODO by our logic here we should return function - not the
    		// class or type
    		HaxeTree node = ((NewNode)supposedNode).getObjectWhichIsCreated();
    		return getValidNodeForCallAnalysis(node);
    	}
    	if (supposedNode instanceof MethodCallNode)
    	{
    		HaxeTree node = ((MethodCallNode)supposedNode).getDeclarationNode();
    		return getValidNodeForCallAnalysis(node);
    	}
    	return getValidNodeForCallAnalysis(supposedNode.getParent());
    }
    
    public static HaxeTree getNodeByOffset(
            final int offset,final int length, final HaxeTree currentAST)
    {
        if (currentAST == null)
        {
            return null;
        }
        HaxeTree result = null;
        for (HaxeTree child : currentAST.getChildren())
        {
            result = getNodeByOffset(offset, length, child);
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
