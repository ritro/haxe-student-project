package workspace.views;


import org.eclipse.core.resources.IFile;

import tree.HaxeTree;


public class CallHierarchyNodeElement extends CallHierarchyElement
{
    private HaxeTree node       = null;
    private String filePackage  = "";
    
    public CallHierarchyNodeElement(final IFile file, final HaxeTree realNode, final String pack)
    {
        super(file);
        
        node = realNode;
        if (pack != null)
        {
            filePackage = pack;
        }
    }
    
    public String getPackage()
    { 
        return filePackage;
    }
    
    public HaxeTree getNode()
    {
        return node;
    }
    
    public String toString()
    {
        if ( node == null )
        {
            return "<empty element>";
        }
        return node.getText() + " - " + filePackage;
    }    

    public boolean isClickable()
    {
        return node != null;
    }
}
