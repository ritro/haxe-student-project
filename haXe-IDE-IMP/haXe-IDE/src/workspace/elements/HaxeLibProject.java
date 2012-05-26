package workspace.elements;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.antlr.runtime.RecognitionException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;

import tree.HaxeTree;
import workspace.Activator;
import workspace.WorkspaceUtils;

public class HaxeLibProject extends AbstractHaxeProject
{
    private static final String _defaultPath = "haxeLib/";
    private IPath libPath = null;
    
    public HaxeLibProject(final String libraryPath)
    {
        super();
        
        libPath = new Path( libraryPath);
        analyzeProjectStructure();
    }
    
    public HaxeLibProject()
    {
        super();

        URL url = Thread.currentThread().getContextClassLoader().getResource(_defaultPath);
        try
        {
            url = FileLocator.toFileURL(url);
            libPath = new Path(url.getPath());
        }
        catch (IOException e)
        {
            Activator.logger.error("HaxeLibProject lib path not found.");
        }
        analyzeProjectStructure();
    }
    
    public void linkLib()
    {
        linkAll();
    }
    
    protected void analyzeProjectStructure()
    {
        fillFileList();
    }
    
    protected void fillFileList()
    {
        Logger logger = Activator.logger;
        
        try
        {
            File folder = libPath.toFile();
            
            for (File file : folder.listFiles())
            {
                if (file.isDirectory())
                {
                    continue;
                }
                String filePath = file.getPath().toString();
                InputStream in = new FileInputStream(file);
                
                HaxeTree ast = WorkspaceUtils.parseFileContents(in);
                in.close();
                
                if (ast == null)
                {
                    logger.info("Activator.parseLibs Could not parse lib file: ", filePath);
                    continue;
                }
                
                String filename = WorkspaceUtils.getHaxeFileNameFromPath(file.getName());
                if (filename == null)
                {
                    logger.info("Activator.parseLibs Something is not right with filename");
                    continue;
                }
                // 1. Try get package from file itself
                // for file File.hx it will look like a.b
                String pack = ast.getPackage();
                // 2. add to package a file name a.b.File
                pack = pack == null || pack.isEmpty()
                        ? filename
                        : pack + "." + filename; 
                // 3. add to libs
                HaxeFile hFile = new HaxeFile(pack, ast);
                addFile(pack, hFile);
            }
        }
        catch (RecognitionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /*
    protected void fillFileList()
    {
        Bundle bundle = Platform.getBundle(Activator.kPluginID);
        URL url = FileLocator.find(bundle, new Path(libPath), null);
        Logger logger = Activator.logger;
        
        try 
        {
            url = FileLocator.resolve(url);
            JarFile jarFile = new JarFile(new File(url.getFile()));
        
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) 
            {
                JarEntry entry = entries.nextElement();
                String filePath = entry.getName();
                if (!filePath.endsWith(".hx"))
                {
                    continue;
                }
    
                InputStream in = jarFile.getInputStream(entry);
                
                HaxeTree ast = WorkspaceUtils.parseFileContents(in);
                in.close();
                
                if (ast == null)
                {
                    logger.info("Activator.parseLibs Could not parse lib file: ", filePath);
                    continue;
                }
                
                String filename = WorkspaceUtils.getHaxeFileNameFromPath(filePath);
                if (filename == null)
                {
                    logger.info("Activator.parseLibs Something is not right with filename");
                    continue;
                }
                // 1. Try get package from file itself
                // for file File.hx it will look like a.b
                String pack = ast.getPackage();
                // 2. add to package a file name a.b.File
                pack = pack == null || pack.isEmpty()
                        ? filename
                        : pack + "." + filename; 
                // 3. add to libs
                HaxeFile hFile = new HaxeFile(pack, ast);
                addFile(pack, hFile);
            } 
            jarFile.close();
        }
        catch (IOException | RecognitionException e)
        {
            String message = "Exception while parsing libs: " + e.toString();
            System.out.printf(message);
            System.out.println();
            Activator.logger.error(message);
        }
    }*/
}
