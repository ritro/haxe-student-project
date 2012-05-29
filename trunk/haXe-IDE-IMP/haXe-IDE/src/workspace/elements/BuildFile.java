package workspace.elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

import org.eclipse.core.resources.IFile;

public class BuildFile
{
    public static final String EXTENTION = "hxml";
    public static final String EXTENTION_WITH_DOT = "." + EXTENTION;
    
    public enum Targets 
    {
        FLASH_9, 
        C_PLUS_PLUS, 
        JAVA_SCRIPT,
        ACTION_SCRIPT,
        NEKO_VM,
        PHP
    };
    
    public static String _defaultSourceFolderName = "src";
    public static String _defaultOutputFolderName = "out";
    public static String _defaultName = "build" + EXTENTION_WITH_DOT;
    public static String _defaultMainFileName = "src\\Main";
    public static String _defaultResultFileName = "out\\Result";
    
    //relative paths
    private String srcFolderName = "";
    private String outputFileNameWithPath = "";
    private Targets target = null;
    private String mainFileNameWithPath = "";
    
    private boolean isValid = true;
    private String name = "";
    private Path pathToBuildFileWithName = null;

    public BuildFile(
            String name, String srcFolder, String outFileName, Targets target, String mainFName)
    {
        this.name = name;
        srcFolderName = srcFolder;
        outputFileNameWithPath = outFileName;
        this.target = target;
        mainFileNameWithPath = mainFName;
        
        if (!name.endsWith(EXTENTION_WITH_DOT))
        {
            name += EXTENTION_WITH_DOT;
        }
        
        pathToBuildFileWithName = (new File(name)).toPath();
    }
    
    public BuildFile(final IFile file)
    {
        String fileName = file.getName();
        name = fileName.substring(0, fileName.length() - EXTENTION_WITH_DOT.length());
        
        // TODO we should somewhat get this info from file
        //srcFolderName = srcFolder;
        //outputFileNameWithPath = outFileName;
        //this.target = target;
        //mainFileNameWithPath = mainFName;
        
        pathToBuildFileWithName = file.getFullPath().toFile().toPath();
    }
    
    public BuildFile()
    {
        this(
                _defaultName,
                _defaultSourceFolderName,
                _defaultResultFileName,
                Targets.FLASH_9,
                _defaultMainFileName);      
    }
    
    public BuildFile(File path)
    {
        FileReader st = null;
        try
        {
            st = new FileReader(path);
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
            isValid = false;
            return;
        }
        name = path.getName();
        pathToBuildFileWithName = path.toPath();

        BufferedReader br = new BufferedReader(st);
        String fileContents = "";
        
        String strLine;
        try
        {
            while ((strLine = br.readLine()) != null)
            {
                if (strLine.startsWith("#"))
                {
                    continue;
                }
                fileContents += " " + strLine;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            isValid = false;
            return;
        }
        
        parseContent(fileContents);
    }
    
    /**
     * Checks if prefix is a valid pointer to a build target.
     * @param str
     * @return Target, which prefix corresponds to or Null if 
     * prefix is invalid.
     */
    public static Targets getTarget(String prefix)
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
    
    public boolean isValid()
    {
        return isValid;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Path getPathWithName()
    {
        return pathToBuildFileWithName;
    }
    
    public String getSourceFolder()
    {
        return srcFolderName;
    }
    
    public String getOutputFileWithPath()
    {
        return outputFileNameWithPath;
    }
    
    public IFile getMainFile()
    {
        return (IFile) new File(mainFileNameWithPath + CodeFile.EXTENTION_WITH_DOT);
    }
    
    public String getContent()
    {
        StringBuilder builder = new StringBuilder();
        
        if (!srcFolderName.isEmpty())
        {
            builder.append("-cp " + srcFolderName + "\n");
            builder.append("\n");
        }
        
        switch (target)
        {
            case JAVA_SCRIPT:
                builder.append("# JavaScript target\n");
                builder.append(String.format(
                        "-js %s\n", outputFileNameWithPath + ".js"));
                builder.append("\n");
                break;
            case FLASH_9:
                builder.append("# SWF 9 target\n");
                builder.append(String.format(
                        "-swf9 %s\n", outputFileNameWithPath + ".swf"));
                //WorkspaceUtils.getConcatenatedPath(outFolderName, resultName + ".swf")
                builder.append("\n");
                break;
            case ACTION_SCRIPT:
                builder.append("# ActionScript3 target\n");
                builder.append(String.format(
                        "-as3 %s\n", outputFileNameWithPath));
                builder.append("\n");
                break;
            case NEKO_VM:
                builder.append("# Neko target\n");
                builder.append(String.format(
                        "-neko %s\n", outputFileNameWithPath + ".n"));
                builder.append("\n");
                break;
            case C_PLUS_PLUS:
                builder.append("# C++ target\n");
                builder.append(String.format(
                        "-cpp %s\n", outputFileNameWithPath));
                builder.append("\n");
                break;
            default:
                builder.append("# PHP target\n");
                builder.append(String.format(
                        "-php %s\n", outputFileNameWithPath));
                builder.append("\n");
                break;
        }

        builder.append("-main " + mainFileNameWithPath + "\n");//package.subpackage.ClassName

        return builder.toString();
    }
    
    private void parseContent(String content)
    {        
        String[] entry = content.split("[\\s]+");
        
        try
        {
            for (int i=0; i<entry.length; i++)
            {            
                if (entry[i].equals("-cp"))
                {
                    i++;
                    srcFolderName = entry[i];
                    continue;
                }
                Targets foundTarget = getTarget(entry[i]);
                if (foundTarget != null)
                {
                    target = foundTarget;
                    i++;
                    outputFileNameWithPath = entry[i];
                    continue;
                }
                if (entry[i].equals("-main"))
                {
                    i++;
                    mainFileNameWithPath = entry[i];
                    continue;
                }
            }
        }
        catch (Exception e)
        {
            isValid = false;
        }
    }
}
