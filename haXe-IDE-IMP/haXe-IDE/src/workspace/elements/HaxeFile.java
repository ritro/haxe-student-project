package workspace.elements;

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

public class HaxeFile
{
    private IPath path = null;
    private HaxeTree ast = null;
    private String fpackage = null;
    private String name = null;
    
    public HaxeFile(final IFile file, final HaxeTree astForFile)
    {
        path = file.getFullPath();
        name = file.getName();
        ast = astForFile;
        fpackage = ast.getPackage();
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
        return path;
    }
    
    public String getName()
    {
        return name;
    }
}
