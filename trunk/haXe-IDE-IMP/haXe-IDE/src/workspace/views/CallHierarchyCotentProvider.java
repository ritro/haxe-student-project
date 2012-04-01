package workspace.views;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

public class CallHierarchyCotentProvider implements ITreeContentProvider
{
    private static Object[] EMPTY_ARRAY = new Object[0];
    private TreeViewer viewer;
    private CallHierarchyElement model = null;
    
    public void dispose() {}

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
    {
        this.viewer = (TreeViewer)viewer;
        if (newInput instanceof CallHierarchyElement)
        {
            model = (CallHierarchyElement) newInput;
        }
    }

    @Override
    public Object[] getElements(Object inputElement)
    {
        return getChildren(inputElement);
    }

    @Override
    public Object[] getChildren(Object parentElement)
    {
        if(parentElement instanceof CallHierarchyElement) {
            CallHierarchyElement box = (CallHierarchyElement)parentElement;
            return box.getChildren();
        }
        return EMPTY_ARRAY;
    }

    @Override
    public Object getParent(Object element)
    {
        if(element instanceof CallHierarchyElement) 
        {
            return ((CallHierarchyElement)element).getParent();
        }
        return null;
    }

    @Override
    public boolean hasChildren(Object element)
    {
        return getChildren(element).length > 0;
    }
}
