package workspace.elements;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

import tree.HaxeTree;

public class CodeFile
{
    public static final String EXTENTION = "hx";
    public static final String EXTENTION_WITH_DOT = "." + EXTENTION;
    
    private IFile rfile = null;
    private HaxeTree ast = null;
    private String fpackage = null;
    
    public CodeFile(final IFile file, final HaxeTree astForFile)
    {
        rfile = file;
        ast = astForFile;
        
        String nameWithExt = file.getName();
        String name = nameWithExt.substring(0, nameWithExt.length() - 3);
        
        fpackage = ast != null ? ast.getPackage() : "";
        fpackage = fpackage == null || fpackage.isEmpty() ? name : fpackage + "." + name;
    }
    
    /**
     * This constructor for test purposes only.
     * @param pack - package to file
     * @param astForFile - file ast
     */
    public CodeFile(final String pack, final HaxeTree astForFile)
    {
        fpackage = pack;
        ast = astForFile;
    }
    
    public HaxeTree getAst()
    {
        return ast;
    }
    
    public void setAst(final HaxeTree value)
    {
        ast = value;
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
