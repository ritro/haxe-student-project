package workspace.views;

import imp.utils.outline.AbstractLabelProvider;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class CallHierarchyLabelProvider extends AbstractLabelProvider
{
    @Override
    public Image getImage(final Object object)
    {
        if (!(object instanceof ICallHierarchyElement))
        {
            return null;
        }
        if (object instanceof CallHierarchyFolderElement)
        {
        	return null; 
        }
        return super.getImage(((CallHierarchyNodeElement)object).getNode());
    }
    
    @Override
    public String getText(final Object object)
    {
        if (!(object instanceof ICallHierarchyElement))
        {
            return null;
        }
        if (object instanceof CallHierarchyNodeElement)
        {
            CallHierarchyNodeElement element = (CallHierarchyNodeElement)object;
            String label = AbstractLabelProvider.getLabelForTreeNode(element.getNode());
            return  label + 
                    " - " + 
                    element.getPackage();
        }
        return ((ICallHierarchyElement)object).toString();
    }

    @Override
    public void addListener(ILabelProviderListener listener)
    {
        super.addListener(listener);
    }

    @Override
    public void dispose()
    {
        super.dispose();
    }

    @Override
    public boolean isLabelProperty(Object element, String property)
    {
        return super.isLabelProperty(element, property);
    }

    @Override
    public void removeListener(ILabelProviderListener listener)
    {
        super.removeListener(listener);
    }
}
