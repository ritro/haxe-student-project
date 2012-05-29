package workspace;

import imp.builders.HaxeNature;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import workspace.elements.BuildFile;
import workspace.elements.HaxeProject;

public class HaxeProjectCreator
{
    /**
     * For this marvelous project we need to:
     * - create the default Eclipse project
     * - add the custom project nature
     * - create the folder structure
     * throws NullPointerException if projectName is null
     *
     * @param projectName - name for future project
     * @param location - custom location or null for default location
     * @return
     */
    public static HaxeProject createProject(String projectName, URI location) {
        //due to some bug we can't use Asserts here 0_0        
        if (projectName == null || projectName.trim().isEmpty())
        {
            throw new NullPointerException();
        }

        IProject baseProject = createBaseProject(projectName, location);
        HaxeProject project = new HaxeProject(baseProject);
        try {
            addNature(baseProject);
        } catch (CoreException e) {
            e.printStackTrace();
            baseProject = null;
        }

        return project;
    }

    /**
     * Just do the basics: create a basic project.
     *
     * @param location
     * @param projectName
     */
    private static IProject createBaseProject(String projectName, URI location) {
        // it is acceptable to use the ResourcesPlugin class
        IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

        if (!newProject.exists()) {
            URI projectLocation = location;
            IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
            if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
                projectLocation = null;
            }

            desc.setLocationURI(projectLocation);
            try {
                newProject.create(desc, null);
                if (!newProject.isOpen()) {
                    newProject.open(null);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }

        return newProject;
    }
    
    public static IFile createBuildFile(HaxeProject project, String fileName, String initialContent)
            throws NullPointerException, CoreException
    {    
        if (fileName == null || fileName.trim().isEmpty())
        {
            throw new NullPointerException("Build file name is invalid");
        }
        
        if (!fileName.endsWith(BuildFile.EXTENTION_WITH_DOT))
        {
            fileName = fileName + BuildFile.EXTENTION_WITH_DOT;
        }
    
        return project.createFile(null, fileName, initialContent, false);
    }
    
    private static void addNature(IProject project) throws CoreException {
        if (!project.hasNature(HaxeNature.k_natureID)) {
            IProjectDescription description = project.getDescription();
            String[] prevNatures = description.getNatureIds();
            String[] newNatures = new String[prevNatures.length + 1];
            System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
            newNatures[prevNatures.length] = HaxeNature.k_natureID;
            description.setNatureIds(newNatures);

            IProgressMonitor monitor = null;
            project.setDescription(description, monitor);
        }
    }

}
