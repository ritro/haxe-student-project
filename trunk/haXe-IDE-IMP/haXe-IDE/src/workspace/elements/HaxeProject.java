package workspace.elements;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import workspace.WorkspaceUtils;

public class HaxeProject
{    
    public static String _defaultMainClass = "main";
    public static String _defaultExtention = ".hx";
    
    private IProject baseProject;
    private IFile buildFile = null;

    public HaxeProject(IProject project)
    {
        baseProject = project;
    }
    
    public String getName()
    {
        return baseProject.getName();
    }
    
    public IFile getFile(String name)
    {
        return baseProject.getFile(name);
    }
    
    public IPath getFullPath()
    {
        return baseProject.getFullPath();
    }
    
    public IFile getBuildFile()
    {
        return buildFile;
    }
    
    public IFile createFile(String fileName) 
            throws CoreException
    {
        return createFile(null, fileName, null, true);
    }
    
    public IFile createFile(String path, String fileName, String fileContents) 
            throws CoreException
    {
        return createFile(path, fileName, fileContents, true);
    }
    
    public IFile createFile(String path, String fileName, String fileContents, boolean ifOpen) 
            throws CoreException
    {
        if (path == null)
        {
            path = "";
        }
        
        if (fileContents == null)
        {
            fileContents = "";
        }
        
        InputStream stream = new ByteArrayInputStream((fileContents).getBytes());
        
        IFile file = baseProject.getFile(WorkspaceUtils.getConcatenatedPath(path, fileName));
        file.create(stream, true, null);
        
        if (ifOpen)
        {
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            IEditorDescriptor desc = PlatformUI.getWorkbench().
                    getEditorRegistry().getDefaultEditor(file.getName());
            page.openEditor(new FileEditorInput(file), desc.getId());
        }
        
        return file;
    }
    
    public void createFolders(String[] paths) throws CoreException
    {
        for (String path : paths) 
        {
            if (path.isEmpty())
            {
                continue;
            }
            IFolder etcFolders = baseProject.getFolder(path);
            WorkspaceUtils.createFolder(etcFolders);
        }
    }
    
    public void setBuildFile(IFile file)
    {
        buildFile = file;
    }
}
