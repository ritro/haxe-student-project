package workspace;

import imp.parser.antlr.tree.HaxeTree;

import org.eclipse.core.resources.IFile;


public class NodeLink
{
    private IFile file = null;
    private HaxeTree node = null;
    
    public NodeLink(final IFile file, final HaxeTree node)
    {
        this.file = file;
        this.node = node;
    }
    
    public IFile getFile()
    {
        return file;
    }
    
    public HaxeTree getNode()
    {
        return node;
    }
    
    public int getMostLeftPosition()
    {
        if (node == null)
        {
            return -1;
        }
        return node.getMostLeftPosition();
    }
    
    public int getMostRightPosition()
    {
        if (node == null)
        {
            return -1;
        }
        return node.getMostRightPosition();
    }
    
    public int tokenOffset()
    {
        if (node == null || node.getToken() == null)
        {
            return -1;
        }
        return node.getTokenStartIndex();
    }
    
    public int getLength()
    {
        if (node == null)
        {
            return -1;
        }
        return node.getLength();
    }
}
