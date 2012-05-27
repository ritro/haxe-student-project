package workspace;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

import workspace.elements.HaxeFile;
import workspace.elements.HaxeLibProject;
import workspace.elements.HaxeProject;

public class ProjectManager
{
    private HaxeFile                       activeFile      = null;
    private HashMap<String, HaxeProject>   projects        = null;
    private HaxeLibProject                 libraries       = null;
    private HaxeProject                    currentProject  = null;
    
    public ProjectManager()
    {
        projects = new HashMap<String, HaxeProject>();
    }
    
    public void updateProjects()
    {
        updateLibProject();
        findProjectsInWorkspace();
    }
    
    public void setCurrentHaxeProject(String project)
    {
        currentProject = getProject(project);
    }
    
    public HaxeProject getCurrentHaxeProject()
    {
        return currentProject;
    }

    
    public HaxeFile getCurrentFile()
    {
        return activeFile;
    }
    
    public void setCurrentProject(final IFile file)
    {
        currentProject = null;
        activeFile = null;
        if (file != null)
        {
            currentProject = projects.get(file.getProject().getName());     
            activeFile = currentProject.getFile(file);
        }
    }
    
    public void setCurrentProject(HaxeProject proj)
    {
        currentProject = proj; 
    }
    
    public void removeProject(final String name)
    {
        projects.remove(name);
    }
    
    public HaxeProject getProject(String name)
    {
        return projects.get(name);
    }
    
    public HashMap<String, HaxeProject> getProjects()
    {
        return projects;
    }
    
    public HaxeLibProject getHaxeLib()
    {
        return libraries;
    }
    
    /**
     * Adds Haxe Project to a list of all projects in current
     * workspace.
     * @param project - instance of Haxe project.
     */
    public void addProject(HaxeProject project)
    {
        projects.put(project.getName(), project);
    }

    private void findProjectsInWorkspace()
    {
        for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects())
        {
            HaxeProject pr = new HaxeProject(p);
            projects.put(p.getName(), pr);
        }
    }
    
    private void updateLibProject()
    {
        libraries = new HaxeLibProject();
        libraries.linkLib();
    }
}
