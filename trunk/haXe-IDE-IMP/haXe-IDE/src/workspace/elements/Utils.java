package workspace.elements;

import workspace.elements.BuildFile.Targets;

public class Utils
{    
    public static BuildFile convertTextToBuildFile(final String content)
    {     
        String[] entry = content.split("[\\s]+");
        
        try
        {
            BuildFile buildFile = new BuildFile();
            for (int i=0; i<entry.length; i++)
            {            
                if (entry[i].equals("-cp"))
                {
                    i++;
                    buildFile.setSourceFolder(entry[i]);
                    continue;
                }
                Targets foundTarget = convertTargetFromPrefix(entry[i]);
                if (foundTarget != null)
                {
                    buildFile.setTarget(foundTarget);
                    i++;
                    buildFile.setOutputFileWithPath(entry[i]);
                    continue;
                }
                if (entry[i].equals("-main"))
                {
                    i++;
                    buildFile.setMainClassWithPackage(entry[i]);
                    continue;
                }
            }
            return buildFile;
        }
        catch (Exception e)
        {
            return null;
        }        
    }
    
    /**
     * Checks if prefix is a valid pointer to a build target.
     * @param str
     * @return Target, which prefix corresponds to or Null if 
     * prefix is invalid.
     */
    public static Targets convertTargetFromPrefix(final String prefix)
    {
        switch(prefix)
        {
            case "-js":
                return Targets.JAVA_SCRIPT;
            case "-swf9":
                return Targets.FLASH_9;
            case "-as3":
                return Targets.ACTION_SCRIPT;
            case "-neko":
                return Targets.NEKO_VM;
            case "-cpp":
                return Targets.C_PLUS_PLUS;
            case "-php":
                return Targets.PHP;
            default:
                return null;
        }
    }
    
    public static String getTargetsOutputFilesSuffix(final Targets target)
    {
        switch(target)
        {
            case JAVA_SCRIPT:
                return ".js";
            case FLASH_9:
                return ".swf";
            case NEKO_VM:
                return ".n";
            default:return "";
        }
    }
}
