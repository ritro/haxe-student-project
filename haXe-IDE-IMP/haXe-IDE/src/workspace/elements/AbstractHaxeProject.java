package workspace.elements;

import java.util.HashMap;

import tree.HaxeTree;
import tree.specific.Module;
import tree.utils.Linker;

public abstract class AbstractHaxeProject
{
    protected HashMap<String, HaxeFile> fileList = null;

    public AbstractHaxeProject()
    {
        fileList = new HashMap<String, HaxeFile>();
    }
    
    public void addFile(final String pack, final HaxeFile file)
    {
        fileList.put(pack, file);
    }
    
    public HashMap<String, HaxeFile> getFiles()
    {
        return fileList;
    }
    
    /**
     * Use this notation: a.b.YouFileName
     */
    public HaxeFile getFile(final String pack)
    {
        return fileList.get(pack);
    }
    
    protected abstract void fillFileList();
    
    protected void linkAll()
    {
        Linker linker = new Linker(this);
        for (HaxeFile file : fileList.values())
        {
            HaxeTree ast = file.getAst();
            if (ast == null)
            {
                continue;
            }
            linker.visit(ast);
            // for libs packed into jars
            ((Module)ast).setFullPackage(file.getPackage());
        }
    }
}
