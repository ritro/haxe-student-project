package workspace.views;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class CallHierarchyCotentProvider implements ITreeContentProvider
{
    private static Object[] EMPTY_ARRAY = new Object[0];
    private Viewer viewer;
    private ICallHierarchyElement model = null;
    
    public void dispose() {}

    @Override
    public void inputChanged(
            final Viewer viewer, final Object oldInput, final Object newInput)
    {
        this.viewer = viewer;
        if (newInput instanceof ICallHierarchyElement)
        {
            model = (ICallHierarchyElement) newInput;
        }
    }

    @Override
    public Object[] getElements(final Object inputElement)
    {
        return getChildren(inputElement);
    }

    @Override
    public Object[] getChildren(final Object parentElement)
    {
        if(parentElement instanceof ICallHierarchyElement) {
            ICallHierarchyElement box = (ICallHierarchyElement)parentElement;
            return box.getChildren();
        }
        return EMPTY_ARRAY;
    }

    @Override
    public Object getParent(final Object element)
    {
        if(element instanceof ICallHierarchyElement) 
        {
            return ((ICallHierarchyElement)element).getParent();
        }
        return null;
    }

    @Override
    public boolean hasChildren(final Object element)
    {
        return getChildren(element).length > 0;
    }
}
