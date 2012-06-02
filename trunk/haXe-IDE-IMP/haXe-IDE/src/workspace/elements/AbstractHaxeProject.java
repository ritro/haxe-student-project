package workspace.elements;

import java.util.HashMap;

import tree.HaxeTree;
import tree.Module;
import tree.utils.Linker;

public abstract class AbstractHaxeProject
{
    protected HashMap<String, CodeFile> fileList = null;

    public AbstractHaxeProject()
    {
        fileList = new HashMap<String, CodeFile>();
    }
    
    public void addFile(final String pack, final CodeFile file)
    {
        fileList.put(pack, file);
    }
    
    public HashMap<String, CodeFile> getFiles()
    {
        return fileList;
    }
    
    /**
     * Use this notation: a.b.YouFileName
     */
    public CodeFile getFile(final String pack)
    {
        return fileList.get(pack);
    }
    
    protected abstract void fillFileList();
    
    protected void linkAll()
    {
        Linker linker = new Linker(this);
        for (CodeFile file : fileList.values())
        {
            HaxeTree ast = file.getAst();
            if (ast == null)
            {
                continue;
            }
            // for libs packed into jars
            ((Module)ast).setFullPackage(file.getPackage());
            linker.visit(ast);
        }
    }
}
