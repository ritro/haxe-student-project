package workspace.views;

public interface ICallHierarchyElement
{
    public String toString();
    
    public Object[] getChildren();
    
    public Object getParent();
    
    public void setParent(final ICallHierarchyElement parent);
    
    public void add(final ICallHierarchyElement child);
    
    public boolean isClickable();
}
