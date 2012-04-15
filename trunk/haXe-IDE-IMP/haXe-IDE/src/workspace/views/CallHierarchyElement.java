package workspace.views;

import java.util.ArrayList;
import java.util.List;

public abstract class CallHierarchyElement extends Object implements ICallHierarchyElement
{
    protected ICallHierarchyElement parent           = null;
    protected List<ICallHierarchyElement> children   = null;
    
    public CallHierarchyElement()
    {
        children = new ArrayList<ICallHierarchyElement>();
    }
    
    public void add(final ICallHierarchyElement child)
    {
        children.add(child);
        child.setParent(this);
    }

    public Object[] getChildren()
    {
        return children.toArray();
    }
    
    public void setParent(final ICallHierarchyElement parent)
    {
        this.parent = parent;
    }

    public Object getParent()
    {
        return parent;
    }
    
    public void clearAllChildren()
    {
        children = new ArrayList<ICallHierarchyElement>();
    }
}
