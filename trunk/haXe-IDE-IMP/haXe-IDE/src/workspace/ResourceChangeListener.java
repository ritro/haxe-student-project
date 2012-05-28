package workspace;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

import workspace.elements.HaxeProject;

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
        
        // TODO: pre delete - close all files from project that is deleted or file that is deleted
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
                ProjectManager manager = Activator.getProjectManager();
                HaxeProject project = null;
                switch (resource.getType())
                {
                    case IResource.FOLDER: return true;
                    case IResource.PROJECT:
                        project = new HaxeProject((IProject)resource);
                        manager.addProject(project);
                        break;
                    case IResource.FILE: 
                        String extention = resource.getFileExtension();
                        if ("hx".equalsIgnoreCase(extention))
                        {
                            project = 
                                    manager.getProject(resource.getProject().getName());
                            project.addFile((IFile)resource);
                        }
                        else if ("hxml".equalsIgnoreCase(extention))
                        {
                            project = 
                                    manager.getProject(resource.getProject().getName());
                            
                            //project.addBuildFile((IFile)resource);
                        }
                        break;
                    default: break;
                }
                return false;
            }
            
            if (delta.getKind() == IResourceDelta.REMOVED)
            {
                ProjectManager manager = Activator.getProjectManager();
                switch (resource.getType())
                {
                    case IResource.FOLDER: return true;
                    case IResource.PROJECT: 
                        manager.removeProject(resource.getName());
                        break;
                    case IResource.FILE: 
                        String extention = resource.getFileExtension();
                        if ("hx".equalsIgnoreCase(extention))
                        {
                            HaxeProject project = 
                                    manager.getProject(resource.getProject().getName());
                            project.removeFile((IFile)resource);
                        }
                        else if ("hxml".equalsIgnoreCase(extention))
                        {
                            
                        }
                        break;
                    default: break;
                }
                return false;
            }
            
            // then folders/files added or removed from inner folders
            // these folders will have Type 'changed' so we need to explore 
            // them not to miss addings or removings
            if (delta.getKind() == IResourceDelta.CHANGED)
            {
                return true;
            }
            
            return true;
         }
    };

}
