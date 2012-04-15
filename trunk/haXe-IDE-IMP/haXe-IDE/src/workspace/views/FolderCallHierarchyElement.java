package workspace.views;

public class FolderCallHierarchyElement extends CallHierarchyElement
{
    private String name = "";
    
    public FolderCallHierarchyElement(final String name) 
    {
        super();
        
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
