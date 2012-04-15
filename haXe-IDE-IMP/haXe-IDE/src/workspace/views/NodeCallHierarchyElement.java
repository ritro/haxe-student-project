package workspace.views;

import haxe.imp.parser.antlr.tree.HaxeTree;

public class NodeCallHierarchyElement extends CallHierarchyElement
{
    private HaxeTree node       = null;
    private String filePackage  = "";
    
    public NodeCallHierarchyElement(final HaxeTree realNode, final String pack)
    {
        super();
        
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
