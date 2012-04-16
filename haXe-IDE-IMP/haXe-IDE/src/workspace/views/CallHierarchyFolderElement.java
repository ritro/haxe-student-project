package workspace.views;

public class CallHierarchyFolderElement extends CallHierarchyElement
{
    private String name = "";
    
    public CallHierarchyFolderElement(final String name) 
    {
        super(null);
        
        if (name != null)
        {
            this.name = name;
        }
    }

    public String toString()
    {
        return name;
    }

    public boolean isClickable()
    {
        return false;
    }
}
