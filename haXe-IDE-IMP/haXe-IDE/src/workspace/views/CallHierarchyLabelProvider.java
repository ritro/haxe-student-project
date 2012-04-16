package workspace.views;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import haxe.imp.treeModelBuilder.HaxeLabelProvider;

public class CallHierarchyLabelProvider extends HaxeLabelProvider
{
    @Override
    public Image getImage(final Object object)
    {
        if (!(object instanceof ICallHierarchyElement))
        {
            return null;
        }
        if (object instanceof FolderCallHierarchyElement)
        {
        	return null; 
        }
        return super.getImage(((NodeCallHierarchyElement)object).getNode());
    }
    
    @Override
    public String getText(final Object object)
    {
        if (!(object instanceof ICallHierarchyElement))
        {
            return null;
        }
        if (object instanceof NodeCallHierarchyElement)
        {
            NodeCallHierarchyElement element = (NodeCallHierarchyElement)object;
            return  super.getText(element.getNode()) + 
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
