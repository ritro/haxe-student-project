package workspace;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import workspace.elements.BuildFile;
import workspace.elements.CodeFile;
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
        
        IResource res = event.getResource();
        
        // TODO: close all files from project that is deleted 
        // or file that is deleted
        if (event.getType() == IResourceChangeEvent.PRE_DELETE)
        {
            try
            {
                closeAllRelatedFiles(res);
            }
            catch (CoreException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            
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
            e.printStackTrace();
        }
    }
    
    private void closeAllRelatedFiles(final IResource resource) throws CoreException
    {        
        if (resource instanceof IFolder)
        {
            IFolder folder = (IFolder)resource;
            for (IResource child : folder.members())
            {
                closeAllRelatedFiles(child);
            }
            return;
        }
        
        if (resource instanceof IProject)
        {
            ((IProject)resource).close(new NullProgressMonitor());
        }
        else if (resource instanceof IFile)
        {
            IFile file = ((IFile)resource);
            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            IWorkbenchPage page = window.getActivePage();
            IEditorPart editor = page.findEditor(new FileEditorInput(file));
            
            if (editor != null) 
            {
               page.activate(editor);
               page.closeEditor(editor, false);
            }
        }
    }
    
    
    private class ResourceDeltaVisitor implements IResourceDeltaVisitor 
    {        
        /**
         * @param resource which is added
         * @return true if resource children should be visited, false overwise
         */
        private boolean processAddAction(final IResource resource)
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
                    if (CodeFile.EXTENTION.equalsIgnoreCase(extention))
                    {
                        project = 
                                manager.getProject(resource.getProject().getName());
                        project.addFile((IFile)resource);
                    }
                    else if (BuildFile.EXTENTION.equalsIgnoreCase(extention))
                    {
                        project = 
                                manager.getProject(resource.getProject().getName());
                        
                        // TODO the process of parsing build file
                        // wasn't added so this is disabled
                        //project.addBuildFile((IFile)resource);
                    }
                    break;
                default: break;
            }                
            return false;
        }
        
        /**
         * @param resource which is deleted
         * @return true if resource children should be visited, false overwise
         */
        private boolean processRemoveAction(final IResource resource)
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
                    if (CodeFile.EXTENTION.equalsIgnoreCase(extention))
                    {
                        HaxeProject project = 
                                manager.getProject(resource.getProject().getName());
                        project.removeFile((IFile)resource);
                    }
                    else if (BuildFile.EXTENTION.equalsIgnoreCase(extention))
                    {
                        
                    }
                    break;
                default: break;
            }
            return false;
        }
        
        public boolean visit(IResourceDelta delta) 
        {
            if (delta == null)
            { 
                return false;
            }
            
            IResource resource = delta.getResource();
            int changeType = delta.getKind();
            
            if (changeType == IResourceDelta.ADDED)
            {
                return processAddAction(resource);
            }
            
            if (changeType == IResourceDelta.REMOVED)
            {
                return processRemoveAction(resource);
            }
            
            // then folders/files added or removed from inner folders
            // these folders will have Type 'changed' so we need to explore 
            // them not to miss addings or removings
            if (changeType == IResourceDelta.CHANGED)
            {
                return true;
            }
            
            return true;
         }
    };

}
