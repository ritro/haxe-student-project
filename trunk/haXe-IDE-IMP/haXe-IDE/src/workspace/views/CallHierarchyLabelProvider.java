package workspace.views;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import haxe.imp.treeModelBuilder.HaxeLabelProvider;

public class CallHierarchyLabelProvider extends HaxeLabelProvider
{
    @Override
    public Image getImage(final Object object)
    {
        if (!(object instanceof CallHierarchyElement))
        {
            return null;
        }
        return 
                super.getImage(((CallHierarchyElement)object).getNode());
    }
    
    @Override
    public String getText(final Object object)
    {
        if (!(object instanceof CallHierarchyElement))
        {
            return null;
        }
        return 
                super.getText(((CallHierarchyElement)object).getNode()) + 
                " - " + 
                ((CallHierarchyElement)object).getPack();
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
