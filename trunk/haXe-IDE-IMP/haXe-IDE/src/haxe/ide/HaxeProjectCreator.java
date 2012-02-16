package haxe.ide;

import haxe.imp.builders.HaxeNature;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

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
    public static IProject createProject(String projectName, URI location) {
        //due to some bug we can't use Asserts here 0_0        
        if (projectName == null || projectName.trim().isEmpty())
        {
            throw new NullPointerException();
        }

        IProject project = createBaseProject(projectName, location);
        try {
            addNature(project);

            //here the initial structure for project should be
            String[] paths = { "src/" };
            addToProjectStructure(project, paths);
            //TODO: generate and add build.hxml file
            //TODO: find haxe compiler and attach it or inform user about not found
        } catch (CoreException e) {
            e.printStackTrace();
            project = null;
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
    
    /*
    public IHaxeBuildFile createBuildFile(String fileName, String initialContent)
            throws CoreException 
    {    
        if (!HaxeElementValidator.validateBuildFileName(fileName).isOK()) 
        {
            throw new CoreException(new Status(
                            IStatus.ERROR, EclihxCore.PLUGIN_ID,
                            "Build file name is invalid"));
        }               
    
        InputStream stream = new ByteArrayInputStream((initialContent).getBytes());
                        
        IFile buildFile = fProject.getFile(fileName);
        buildFile.create(stream, true, monitor);
        
        HaxeBuildFile haxeBuildFile = new HaxeBuildFile(this, buildFile);                                       
        return haxeBuildFile;
    }*/
    
    private static String getConcatenatedPath(String parentPath, String childPath) 
    {
        return (new File(parentPath, childPath)).getPath();
    }
    
    private static String createDefaultHxmlContent(String projectName, 
            String outFolderName, String srcFolderName) 
    {    
        StringBuilder builder = new StringBuilder();
        
        builder.append("-cp " + srcFolderName + "\n");
        builder.append("\n");
        
        builder.append("# Uncomment the desirable target\n");
        
        builder.append("# JavaScript target\n");
        builder.append(String.format("# -js %s\n", getConcatenatedPath(outFolderName, projectName + ".js")));
        builder.append("\n");
    
        builder.append("# SWF 9 target\n");
        builder.append(String.format("# -swf9 %s\n", getConcatenatedPath(outFolderName, projectName + ".swf")));
        builder.append("\n");
        
        builder.append("# ActionScript3 target\n");
        builder.append(String.format("# -as3 %s\n", outFolderName));
        builder.append("\n");
    
        builder.append("# Neko target\n");
        builder.append(String.format("# -neko %s\n", getConcatenatedPath(outFolderName, projectName + ".n")));
        builder.append("\n");
        
        builder.append("# PHP target\n");
        builder.append(String.format("# -php %s\n", outFolderName));
        builder.append("\n");
        
        builder.append("# C++ target\n");
        builder.append(String.format("# -cpp %s\n", outFolderName));
        builder.append("\n");
                        
        builder.append("# Uncomment and place your main class with package\n");
        builder.append("# -main package.subpackage.ClassName\n");               
        
        return builder.toString();
    }

    private static void createFolder(IFolder folder) throws CoreException {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolder((IFolder) parent);
        }
        if (!folder.exists()) {
            folder.create(false, true, null);
        }
    }

    /**
     * Create a folder structure with a parent root, overlay, and a few child
     * folders.
     *
     * @param newProject
     * @param paths
     * @throws CoreException
     */
    private static void addToProjectStructure(IProject newProject, String[] paths) throws CoreException {
        for (String path : paths) {
            IFolder etcFolders = newProject.getFolder(path);
            createFolder(etcFolders);
        }
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
