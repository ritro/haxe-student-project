package imp.utils.outline;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.imp.editor.ModelTreeNode;
import org.eclipse.imp.services.ILabelProvider;
import org.eclipse.imp.utils.MarkerUtils;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import tree.HaxeTree;
import workspace.Activator;
import workspace.ImageProvider;
import workspace.elements.IHaxeResources;

public abstract class AbstractLabelProvider implements ILabelProvider 
{
    protected final Set<ILabelProviderListener> fListeners = new HashSet<ILabelProviderListener>();

    protected static ImageRegistry sImageRegistry = Activator.getInstance().getImageRegistry();


    // ---------- IBaseLabelProvider implementations ----------------

    public void addListener(final ILabelProviderListener listener) 
    {
        fListeners.add(listener);
    }

    public void dispose() 
    {
        for (ILabelProviderListener listener : fListeners)
        {
            removeListener(listener);
        }
        sImageRegistry = null;
    }

    public boolean isLabelProperty(final Object element, final String property) 
    {
        return false;
    }

    public void removeListener(final ILabelProviderListener listener) 
    {
        fListeners.remove(listener);
    }
    // ------------------------end------------------------------------
    
    public Image getImage(final Object element) 
    {
        if (element instanceof IFile) 
        {
            IFile file = (IFile) element;
            int sev = MarkerUtils.getMaxProblemMarkerSeverity(file,
                    IResource.DEPTH_ONE);

            switch (sev) 
            {
            case IMarker.SEVERITY_ERROR:
                return sImageRegistry.get(IHaxeResources.HAXE_FILE_ERROR);
            case IMarker.SEVERITY_WARNING:
                return sImageRegistry.get(IHaxeResources.HAXE_FILE_WARNING);
            default:
                return sImageRegistry.get(IHaxeResources.HAXE_FILE);
            }
        }
        HaxeTree n = (element instanceof ModelTreeNode) 
                ? (HaxeTree) ((ModelTreeNode) element).getASTNode()
                : (HaxeTree) element;
        return ImageProvider.getImageForTreeNode(n);
    }
}
