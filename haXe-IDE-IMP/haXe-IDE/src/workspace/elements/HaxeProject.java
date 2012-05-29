package workspace.elements;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

import tree.HaxeTree;
import workspace.ProjectVisitor;
import workspace.WorkspaceUtils;

public class HaxeProject extends AbstractHaxeProject
{    
    private IProject baseProject;
    private List<BuildFile> buildFiles = null;

    public HaxeProject(final IProject project)
    {
        super();

        buildFiles = new ArrayList<BuildFile>();
        baseProject = project;
        analyzeProjectStructure();
    }
    
    public String getName()
    {
        return baseProject.getName();
    }
    
    public void removeFile(final IFile file)
    {
        if (fileList == null)
        {
            return;
        }
        String fName = file.getName().substring(
                0, 
                file.getName().length() - file.getFileExtension().length() - 1);
        for (String name : fileList.keySet())
        {
            if (name.endsWith(fName))
            {
                CodeFile hfile = fileList.get(name);
                if (hfile != null && hfile.getPath().equals(file.getFullPath()))
                {
                    fileList.remove(name);
                    return;
                }
            }
        }
    }
    
    public void addFile(final IFile file)
    {
        if (!file.getFileExtension().equals(CodeFile.EXTENTION))
        {
            return;
        }
        HaxeTree ast = null;
        try
        {
            ast = WorkspaceUtils.parseFileContents(file.getContents());
        }
        catch (RecognitionException | IOException | CoreException e)
        {
            System.out.println("HaxeProject.addFile: Parsefile failed");
            e.printStackTrace();
        }
        CodeFile hFile = new CodeFile(file, ast);
        addFile(hFile);
    }
    
    public void addFile(final CodeFile file)
    {
        String pack = file.getPackage();

        addFile(pack, file);
    }
    
    public CodeFile getFile(final IFile file)
    {
        if (fileList == null)
        {
            return null;
        }
        String fName = file.getName().substring(
                0, 
                file.getName().length() - file.getFileExtension().length() - 1);
        for (String name : fileList.keySet())
        {
            if (name.endsWith(fName))
            {
                CodeFile hfile = fileList.get(name);
                if (hfile != null && hfile.getPath().equals(file.getFullPath()))
                {
                    return hfile;
                }
            }
        }
        return null;
    }
    
    public HaxeTree getFileAST(final IFile file)
    {
        CodeFile hfile = getFile(file);
        if (hfile != null)
        {
            return hfile.getAst();
        }
        
        return null;
    }
    
    public List<BuildFile> getBuildFiles()
    {
        return buildFiles;
    }
    
    public void addBuildFile(final IFile file)
    {
        if (!file.getFileExtension().equals(BuildFile.EXTENTION))
        {
            return;
        }
        BuildFile bFile = new BuildFile(file);

        addBuildFile(bFile);
    }
    
    public void addBuildFile(final BuildFile file)
    {
        buildFiles.add(file);
    }
    
    public void setBuildFiles(final List<BuildFile> files)
    {
        buildFiles = files;
    }
 
    public IFile getRealFile(final String name)
    {
        return baseProject.getFile(name);
    }
    
    public IPath getFullPath()
    {
        return baseProject.getFullPath();
    }
    
    public boolean isOpen()
    {
        return baseProject.isOpen();
    }
    
    public IFile createFile(final String fileName) 
            throws CoreException
    {
        return createFile(null, fileName, null, true);
    }
    
    public IFile createFile(
            final String path, final String fileName, final String fileContents) 
            throws CoreException
    {
        return createFile(path, fileName, fileContents, true);
    }
    
    public IFile createFile(
            String path, final String fileName, final String fileContents, final boolean ifOpen) 
            throws CoreException
    {
        if (path == null)
        {
            path = "";
        }
        
        return createFile(WorkspaceUtils.getConcatenatedPath(path, fileName), fileContents, ifOpen);
    }
    
    public IFile createFile(final String pathWithName, String fileContents, final boolean ifOpen) 
            throws CoreException
    {
        if (fileContents == null)
        {
            fileContents = "";
            if (pathWithName.endsWith(CodeFile.EXTENTION_WITH_DOT))
            {
                // TODO fix class name and maybe move this code to CodeFile
                fileContents = "class A { \n\r}";
            }
        }
        
        InputStream stream = new ByteArrayInputStream((fileContents).getBytes());
        
        IFile file = baseProject.getFile(pathWithName);
        file.create(stream, true, null);
        
        if (ifOpen)
        {
            WorkspaceUtils.openFileInEditor(file);
        }
        
        return file;        
    }
    
    public void createFolders(final String[] paths) throws CoreException
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
    
    protected void analyzeProjectStructure()
    {
        findBuildFiles();
        fillFileList();
        linkAll();
    }

    @Override
    protected void fillFileList()
    {
        if (!isOpen())
        {
            return;
        }
        
        ProjectVisitor visitor = new ProjectVisitor(CodeFile.EXTENTION);
        try
        {
            for (IResource r : baseProject.members())
            {
                visitor.visit(r);
            }
            
            List<IFile> ff = visitor.getBuildFileList();
            for (IFile f : ff)
            {
                System.out.println(
                        "HaxeProject.fillFileList: Parsing file begin: " + 
                        f.getLocation().toOSString());
                addFile(f);
            }
        }
        catch (CoreException e)
        {
            System.out.println("HaxeProject.fillFileList: failed");
            e.printStackTrace();
        }
    }
    
    private void findBuildFiles()
    {
        if (!isOpen())
        {
            return;
        }
        
        ProjectVisitor visitor = new ProjectVisitor(BuildFile.EXTENTION);
        try
        {
            for (IResource r : baseProject.members())
            {
                visitor.visit(r);
            }
            
            List<IFile> ff = visitor.getBuildFileList();
            for (IFile f : ff)
            {
                IPath path = f.getRawLocation().makeAbsolute();
                BuildFile b = new BuildFile(path.toFile());
                addBuildFile(b);
            }
        }
        catch (CoreException e)
        {
            e.printStackTrace();
        }
    }
    
}
