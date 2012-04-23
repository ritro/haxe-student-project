package workspace.elements;

import imp.parser.antlr.tree.HaxeTree;

import java.util.HashMap;

import tree.utils.HaxeTreeLinker;

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
        HaxeTreeLinker linker = new HaxeTreeLinker(this);
        for (HaxeFile file : fileList.values())
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