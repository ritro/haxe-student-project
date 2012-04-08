package workspace.elements;


import haxe.imp.parser.HaxeParseController;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.tree.utils.HaxeTreeLinker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.RecognitionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.builder.BuilderUtils;
import org.eclipse.imp.model.ModelFactory;
import org.eclipse.imp.model.ModelFactory.ModelException;
import org.eclipse.imp.parser.IMessageHandler;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import workspace.ProjectVisitor;
import workspace.WorkspaceUtils;

public class HaxeProject
{    
    public static String _defaultExtention = ".hx";
    
    private IProject baseProject;
    private List<BuildFile> buildFiles = null;
    private HashMap<String, List<HaxeFile>> fileList = null;

    public HaxeProject(IProject project)
    {
        baseProject = project;
        buildFiles = new ArrayList<BuildFile>();
        fileList = new HashMap<String, List<HaxeFile>>();
        
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
        List<HaxeFile> list = fileList.get(name);
        if (list == null)
        {
            list = new ArrayList<HaxeFile>();
        }
        list.add(file);
        fileList.put(name, list);
    }
    
    public HashMap<String, List<HaxeFile>> getFiles()
    {
        return fileList;
    }
    
    public HaxeFile getFile(IPath fullpath)
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
    
    public HaxeFile getFile(String name, String nameWithPackage)
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
    
    public HaxeFile getFile(String nameWithPackage)
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
    
    public HaxeTree getFileAST(String name, String nameWithPackage)
    {        
        HaxeFile file = getFile(name, nameWithPackage);
        if (file != null)
        {
            return file.getAst();
        }
        return null;
    }
    
    public HaxeTree getFileAST(IFile file)
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
    
    public void addBuildFile(BuildFile file)
    {
        buildFiles.add(file);
    }
    
    public void setBuildFiles(List<BuildFile> files)
    {
        buildFiles = files;
    }
 
    public IFile getRealFile(String name)
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
    
    public boolean contains(String nameWithPackage)
    {
        return fileList.containsKey(nameWithPackage);
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
        
        return createFile(WorkspaceUtils.getConcatenatedPath(path, fileName), fileContents, ifOpen);
    }
    
    public IFile createFile(String pathWithName, String fileContents, boolean ifOpen) 
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
    
    private HaxeTree makeAST(IFile file)
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
