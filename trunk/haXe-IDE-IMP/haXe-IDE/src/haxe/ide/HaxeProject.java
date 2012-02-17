package haxe.ide;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

public class HaxeProject
{    
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
    
    public IFile getBuildFile()
    {
        return buildFile;
    }
    
    public void setBuildFile(IFile file)
    {
        buildFile = file;
    }
}
