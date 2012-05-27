package workspace;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

public class ResourceChangeListener implements IResourceChangeListener
{
    private ResourceDeltaVisitor deltaVisitor = null;
    
    public ResourceChangeListener()
    {
        deltaVisitor = new ResourceDeltaVisitor();
    }

    @Override
    public void resourceChanged(final IResourceChangeEvent event)
    {
        /*
        IResource res = event.getResource();
        
        if (event.getType() == IResourceChangeEvent.PRE_DELETE
                && res instanceof IProject)
        {
            Activator.getProjectManager().removeProject(res.getName());
        }*/
            
        IResourceDelta delta = event.getDelta();
        
        if (delta == null)
        {
            return;
        }
        
        try 
        {
            delta.accept(deltaVisitor);
        }
        catch (CoreException e) 
        {
            //open error dialog with syncExec or print to plugin log file
        }
    }
    
    
    private class ResourceDeltaVisitor implements IResourceDeltaVisitor 
    {
        public boolean visit(IResourceDelta delta) 
        {
            if (delta == null)
            { 
                return false;
            }
            
            IResource resource = delta.getResource();
            if (delta.getKind() == IResourceDelta.ADDED)
            {
                return true;
            }
            
            if (delta.getKind() == IResourceDelta.REMOVED)
            {
                switch (resource.getType())
                {
                    case IResource.FOLDER: return true;
                    case IResource.PROJECT: 
                        Activator.getProjectManager().removeProject(resource.getName());
                        break;
                    case IResource.FILE: 
                        if ("hx".equalsIgnoreCase(resource.getFileExtension()))
                        {
                            
                        }
                        break;
                    default: break;
                }
                return false;
            }
            
            return true;
         }
    };

}
