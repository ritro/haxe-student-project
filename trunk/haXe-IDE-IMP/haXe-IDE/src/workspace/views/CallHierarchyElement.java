package workspace.views;

import java.util.ArrayList;
import java.util.List;

import haxe.imp.parser.antlr.main.HaxeParser.filepath_return;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.treeModelBuilder.HaxeLabelProvider;

public class CallHierarchyElement extends Object
{
    private HaxeTree node = null;
    private String filePackage = null;
    private CallHierarchyElement parent = null;
    private List<CallHierarchyElement> children = null;
    
    public CallHierarchyElement(final HaxeTree realNode,final String pack)
    {
        node = realNode;
        filePackage = pack;
        children = new ArrayList<CallHierarchyElement>();
    }
    
    public String getPack()
    { 
        return filePackage;
    }
    
    public HaxeTree getNode()
    {
        return node;
    }
    
    public void add(CallHierarchyElement child)
    {
        children.add(child);
        child.setParent(this);
    }

    public Object[] getChildren()
    {
        return children.toArray();
    }
    
    public void setParent(CallHierarchyElement parent)
    {
        this.parent = parent;
    }

    public Object getParent()
    {
        return parent;
    }
    
    public void clearAllChildren()
    {
        children = new ArrayList<CallHierarchyElement>();
    }
}
