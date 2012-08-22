package workspace.elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

import org.eclipse.core.resources.IFile;

import workspace.WorkspaceUtils;

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
    
    public static String DEFAULT_SRC_FOLDER_NAME = "src";
    public static String DEFAULT_OUT_FOLDER_NAME = "out";
    public static String DEFAULT_NAME = "build" + EXTENTION_WITH_DOT;
    public static String DEFAULT_MAIN_CLASS_PACK = "src.Main";
    public static String DEFAULT_OUT_FILE_PATH = "out\\Result";
    
    //relative paths
    private String srcFolderName = "";
    private String outputFileNameWithPath = "";
    private Targets target = Targets.FLASH_9;
    private String mainClassWithPackage = "";
    
    private boolean isValid = true;
    private String name = "";
    private Path pathToBuildFile = null;

    public BuildFile(
            String name, String srcFolder, String outFileName, Targets target, String mainFName)
    {
        setTarget(target);
        setSourceFolder(srcFolder);
        setOutputFileWithPath(outFileName);
        setMainClassWithPackage(mainFName);
        setNameWithPath(name);
    }
    
    public BuildFile(final IFile file)
    {
        String fileName = file.getName();
        name = fileName.substring(0, fileName.length() - EXTENTION_WITH_DOT.length());
        

        BuildFile pattern = Utils.convertTextToBuildFile(
                WorkspaceUtils.getFileContents(file));
        copyInfo(pattern);        
        //pathToBuildFile = WorkspaceUtils.getPath(WorkspaceUtils.getPath(file));
    }
    
    public BuildFile()
    {
        this(
                DEFAULT_NAME,
                DEFAULT_SRC_FOLDER_NAME,
                DEFAULT_OUT_FILE_PATH,
                Targets.FLASH_9,
                DEFAULT_MAIN_CLASS_PACK);      
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
        pathToBuildFile = WorkspaceUtils.getPath(path);

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
        
        BuildFile file = Utils.convertTextToBuildFile(fileContents);
        copyInfo(file);
    }
    
    public boolean isValid()
    {
        return isValid;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Targets getTarget()
    {
        return target;
    }
    
    public Path getPath()
    {
        return pathToBuildFile;
    }
    
    public String getSourceFolder()
    {
        return srcFolderName;
    }
    
    public String getOutputFileWithPath()
    {
        return outputFileNameWithPath;
    }
    
    public String getMainClass()
    {
        return mainClassWithPackage;
    }
    
    public void setNameWithPath(String newName)
    {
        if (!newName.endsWith(EXTENTION_WITH_DOT))
        {
            newName += EXTENTION_WITH_DOT;
            //name = newName.substring(0, newName.length() - EXTENTION_WITH_DOT.length());
        }
        File file = new File(newName);
        name = file.getName();
        pathToBuildFile = file.toPath();
    }
    
    public void setSourceFolder(String newName)
    {
        srcFolderName = newName;
    }
    
    public void setOutputFileWithPath(String newName)
    {
        outputFileNameWithPath = newName;
        updateOutputFileSuffix();
    }
    
    public void setTarget(Targets newTarget)
    {
        String suffix = Utils.getTargetsOutputFilesSuffix(target);
        if (outputFileNameWithPath.endsWith(suffix))
        {
            outputFileNameWithPath = outputFileNameWithPath.substring(
                    0, 
                    outputFileNameWithPath.length() - suffix.length());
        }
        target = newTarget;
        updateOutputFileSuffix();
    }
    
    public void setMainClassWithPackage(String newMainClass)
    {
        mainClassWithPackage = newMainClass;
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
                        "-js %s\n", outputFileNameWithPath));
                builder.append("\n");
                break;
            case FLASH_9:
                builder.append("# SWF 9 target\n");
                builder.append(String.format(
                        "-swf9 %s\n", outputFileNameWithPath));
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
                        "-neko %s\n", outputFileNameWithPath));
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

        builder.append("-main " + mainClassWithPackage + "\n");//package.subpackage.ClassName

        return builder.toString();
    }
    
    private void copyInfo(BuildFile pattern)
    {
        if (pattern == null)
        {
            isValid = false;
        }
        else
        {
            srcFolderName = pattern.getSourceFolder();
            outputFileNameWithPath = pattern.getOutputFileWithPath();
            target = pattern.getTarget();
            mainClassWithPackage = pattern.getMainClass();
        }
    }
    
    private void updateOutputFileSuffix()
    {
        String suffix = Utils.getTargetsOutputFilesSuffix(target);
        if (!outputFileNameWithPath.endsWith(suffix))
        {
            outputFileNameWithPath += suffix;
        }
    }
    
}
