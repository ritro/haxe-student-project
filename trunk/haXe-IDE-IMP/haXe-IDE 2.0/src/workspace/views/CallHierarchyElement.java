package workspace.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;

public abstract class CallHierarchyElement extends Object implements ICallHierarchyElement
{
    protected ICallHierarchyElement parent           = null;
    protected List<ICallHierarchyElement> children   = null;
    protected IFile file                             = null;
    
    public CallHierarchyElement(final IFile file)
    {
        this.file = file;
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
    
    public IFile getFile()
    {
        return file;
    }
    
    public void clearAllChildren()
    {
        children = new ArrayList<ICallHierarchyElement>();
    }
}
