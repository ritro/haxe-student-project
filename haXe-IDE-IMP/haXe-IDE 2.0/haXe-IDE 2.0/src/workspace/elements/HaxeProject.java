package workspace.elements;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.tree.utils.HaxeTreeLinker;

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

import workspace.HashMapForLists;
import workspace.ProjectVisitor;
import workspace.WorkspaceUtils;

public class HaxeProject
{    
    public static String _defaultExtention = ".hx";
    
    private IProject baseProject;
    private List<BuildFile> buildFiles = null;
    private HashMapForLists<HaxeFile> fileList = null;

    public HaxeProject(IProject project)
    {
        baseProject = project;
        buildFiles = new ArrayList<BuildFile>();
        fileList = new HashMapForLists<HaxeFile>();
        
        findBuildFiles();
        makeFileList();
        linkAll();
    }
    
    public String getName()
    {
        return baseProject.getName();
    }
    
    public void addToFileTree(HaxeFile file)
    {
        String name = file.getName();
        fileList.put(name, file);
    }
    
    /**
     * The Key is the name of the file with extention
     * but without path.
     * Value is files which have that name.
     * @return
     */
    public HashMapForLists<HaxeFile> getFiles()
    {
        return fileList;
    }
    
    public HaxeFile getFile(final IPath fullpath)
    {
        if (fileList == null)
        {
            return null;
        }
        for (List<HaxeFile> list : fileList.values())
        {
            for (HaxeFile file : list)
            {
                if (file.getPath().equals(fullpath))
                {
                    return file;
                }
            }
        }
        
        return null;
    }
    
    public HaxeFile getFile(final String name, final String nameWithPackage)
    {
        if (fileList == null)
        {
            return null;
        }
        List<HaxeFile> list = fileList.get(name);
        if (list == null)
        {
            return null;
        }
        for (HaxeFile file : list)
        {
            if (file.getPackage().equals(nameWithPackage))
            {
                return file;
            }
        }
        
        return null;
    }
    
    public HaxeFile getFile(final String nameWithPackage)
    {
        if (fileList == null)
        {
            return null;
        }
        for (List<HaxeFile> list : fileList.values())
        {
            for (HaxeFile file : list)
            {
                if (file.getPackage().equals(nameWithPackage))
                {
                    return file;
                }
            }
        }
        
        return null;
    }
    
    public HaxeTree getFileAST(final String name, final String nameWithPackage)
    {        
        HaxeFile file = getFile(name, nameWithPackage);
        if (file != null)
        {
            return file.getAst();
        }
        return null;
    }
    
    public HaxeTree getFileAST(final IFile file)
    {
        if (fileList == null)
        {
            return null;
        }
        List<HaxeFile> list = fileList.get(file.getName());
        if (list == null)
        {
            return null;
        }
        HaxeFile foundFile = getFile(file.getFullPath());
        if (foundFile != null)
        {
            return foundFile.getAst();
        }
        
        return null;
    }
    
    public List<BuildFile> getBuildFiles()
    {
        return buildFiles;
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
    
    public boolean contains(final String nameWithPackage)
    {
        return fileList.containsKey(nameWithPackage);
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
    
    private void findBuildFiles()
    {
        if (!isOpen())
        {
            return;
        }
        
        ProjectVisitor visitor = new ProjectVisitor(BuildFile._defaultBuildFileExtention);
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
    
    private void makeFileList()
    {
        if (!isOpen())
        {
            return;
        }
        
        ProjectVisitor visitor = new ProjectVisitor("hx");
        try
        {
            for (IResource r : baseProject.members())
            {
                visitor.visit(r);
            }
            
            List<IFile> ff = visitor.getBuildFileList();
            for (IFile f : ff)
            {
                HaxeTree ast = makeAST(f);                
                HaxeFile file = new HaxeFile(f, ast);
                
                addToFileTree(file);
            }
        }
        catch (CoreException e)
        {
            e.printStackTrace();
        }
    }
    
    private HaxeTree makeAST(final IFile file)
    {
        try
        {
            System.out.println("Parsing file begin: " + file.getLocation().toOSString());
            HaxeTree ast = WorkspaceUtils.parseFileContents(file.getContents());
            return ast;
        }
        catch (RecognitionException | IOException | CoreException e)
        {                
            System.out.println("Parsefile failed: " + file.getLocation().toOSString());
        }
        return null;
    }
    
    private void linkAll()
    {
        HaxeTreeLinker linker = new HaxeTreeLinker(this);
        for (List<HaxeFile> fileLists : fileList.values())
        {
            for (HaxeFile file : fileLists)
            {
                HaxeTree ast = file.getAst();
                if (ast == null)
                {
                    continue;
                }
                linker.visit(ast);                
            }
        }
    }
}