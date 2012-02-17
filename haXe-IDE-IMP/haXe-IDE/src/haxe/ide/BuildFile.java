package haxe.ide;

import org.eclipse.core.resources.IFile;

public class BuildFile
{
    public static String _defaultSourceFolderName = "src";
    public static String _defaultOutputFolderName = "out";
    public static String _defaultName = "build.hxml";
    
    private String srcFolderName = "";
    private String outFolderName = "";
    private String name = "";
    
    public BuildFile(String srcFName, String outFName, String bFName)
    {
        srcFolderName = srcFName;
        outFolderName = outFName;
        name = bFName;        
    }
    
    public BuildFile()
    {
        srcFolderName = _defaultSourceFolderName;
        outFolderName = _defaultOutputFolderName;
        name = _defaultName;        
    }
    
    public String getName()
    {
        return name;
    }
}
