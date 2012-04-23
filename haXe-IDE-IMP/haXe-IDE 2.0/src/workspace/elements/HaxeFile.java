package workspace.elements;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

import tree.HaxeTree;

public class HaxeFile
{
    private IFile rfile = null;
    private HaxeTree ast = null;
    private String fpackage = null;
    
    public HaxeFile(final IFile file, final HaxeTree astForFile)
    {
        rfile = file;
        ast = astForFile;
        fpackage = ast != null ? ast.getPackage() : "";
    }
    
    /**
     * This constructor for test purposes only.
     * @param pack - package to file
     * @param astForFile - file ast
     */
    public HaxeFile(final String pack, final HaxeTree astForFile)
    {
        fpackage = pack;
        ast = astForFile;
    }
    
    public HaxeTree getAst()
    {
        return ast;
    }
    
    public String getPackage()
    {
        return fpackage;
    }
    
    public IPath getPath()
    {
        return rfile.getFullPath();
    }
    
    public IFile getRealFile()
    {
        return rfile;
    }
    
    /**
     * @return short file name with extention
     */
    public String getName()
    {
        return rfile.getName();
    }
}
