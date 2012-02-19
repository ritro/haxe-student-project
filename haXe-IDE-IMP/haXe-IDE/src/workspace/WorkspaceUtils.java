package workspace;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

public class WorkspaceUtils
{
    public static void createFolder(IFolder folder) throws CoreException 
    {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolder((IFolder) parent);
        }
        if (!folder.exists()) {
            folder.create(false, true, null);
        }
    }
    
    public static String getConcatenatedPath(String parentPath, String childPath) 
    {
        if (parentPath.isEmpty())
        {
            return childPath;
        }
        
        return (new File(parentPath, childPath)).getPath();
    }
}
