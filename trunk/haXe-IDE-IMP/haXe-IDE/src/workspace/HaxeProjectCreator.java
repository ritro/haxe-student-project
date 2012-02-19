package workspace;

import haxe.imp.builders.HaxeNature;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import workspace.elements.HaxeProject;
import workspace.elements.BuildFile.Targets;

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
    
    public static IFile createBuildFile(HaxeProject project, String fileName)
            throws NullPointerException, CoreException
    {      
        String content = 
                createDefaultHxmlContent(project.getName(), project.getFullPath().toString());
        return createBuildFile(project, fileName, content);
    }   
    
    public static IFile createBuildFile(
            HaxeProject project, 
            String fileName,
            String resultName,
            String srcFolder, 
            String outFolder, 
            Targets target, 
            String mainFileNameWithPath)
            throws NullPointerException, CoreException
    {
        String content = createHxmlContent(
                resultName,
                srcFolder,
                outFolder,
                target,
                mainFileNameWithPath);
        
        return createBuildFile(project, fileName, content);
    }
    
    public static IFile createBuildFile(HaxeProject project, String fileName, String initialContent)
            throws NullPointerException, CoreException
    {    
        if (fileName == null || fileName.trim().isEmpty())
        {
            throw new NullPointerException("Build file name is invalid");
        }
        
        if (!fileName.endsWith(".hxml"))
        {
            fileName = fileName + ".hxml";
        }
    
        return project.createFile(null, fileName, initialContent, false);
    }
    
    private static String createDefaultHxmlContent(String projectName, String projectFullPath)
    {
        return createHxmlContent(
                projectName,
                WorkspaceUtils.getConcatenatedPath(projectFullPath, "src"),
                WorkspaceUtils.getConcatenatedPath(projectFullPath, "out"),
                Targets.FLASH_9,
                WorkspaceUtils.getConcatenatedPath(
                        projectFullPath, 
                        WorkspaceUtils.getConcatenatedPath("src",HaxeProject._defaultMainClass)));
    }
    
    private static String createHxmlContent(
            String resultName, 
            String srcFolderName,
            String outFolderName, 
            Targets target,
            String mainFileNameWithPath)
    {
        StringBuilder builder = new StringBuilder();
        
        if (!srcFolderName.isEmpty())
        {
            builder.append("-cp " + srcFolderName + "\n");
            builder.append("\n");
        }
        
        switch (target)
        {
            case JAVA_SCRIPT:
                builder.append("# JavaScript target\n");
                builder.append(String.format(
                        "-js %s\n", 
                        WorkspaceUtils.getConcatenatedPath(outFolderName, resultName + ".js")));
                builder.append("\n");
                break;
            case FLASH_9:
                builder.append("# SWF 9 target\n");
                builder.append(String.format(
                        "-swf9 %s\n", 
                        WorkspaceUtils.getConcatenatedPath(outFolderName, resultName + ".swf")));
                builder.append("\n");
                break;
            case ACTION_SCRIPT:
                builder.append("# ActionScript3 target\n");
                builder.append(String.format("-as3 %s\n", outFolderName));
                builder.append("\n");
                break;
            case NEKO_VM:
                builder.append("# Neko target\n");
                builder.append(String.format(
                        "-neko %s\n", 
                        WorkspaceUtils.getConcatenatedPath(outFolderName, resultName + ".n")));
                builder.append("\n");
                break;
            case C_PLUS_PLUS:
                builder.append("# C++ target\n");
                builder.append(String.format("-cpp %s\n", outFolderName));
                builder.append("\n");
                break;
            default:
                builder.append("# PHP target\n");
                builder.append(String.format("-php %s\n", outFolderName));
                builder.append("\n");
                break;
        }

        builder.append("-main " + mainFileNameWithPath + "\n");//package.subpackage.ClassName

        return builder.toString();
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
