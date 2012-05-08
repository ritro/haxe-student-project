package workspace.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;

import tree.HaxeTree;

public class CallHierarchyNodeElement extends CallHierarchyElement
{
    private HaxeTree node           = null;
    private String filePackage      = "";
    private List<CallHierarchyElement> links    = null;
    
    public CallHierarchyNodeElement(
            final IFile file, final HaxeTree realNode, final String pack)
    {
        super(file);
        
        node = realNode;
        if (pack != null)
        {
            filePackage = pack;
        }
        links = new ArrayList<CallHierarchyElement>();
    }
    
    public String getPackage()
    { 
        return filePackage;
    }
    
    public HaxeTree getNode()
    {
        return node;
    }
    
    public void addLink(final CallHierarchyElement link)
    {
        links.add(link);
    }
    
    public List<CallHierarchyElement> getLinks()
    {
        return links;
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
