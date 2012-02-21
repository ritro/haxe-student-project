package workspace;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

import workspace.elements.BuildFile;

public class ProjectVisitor implements IResourceVisitor
{
    List<IFile> buildFileList;
    
    public List<IFile> getBuildFileList()
    {
        return buildFileList;
    }
    
    public ProjectVisitor()
    {
        buildFileList = new ArrayList<IFile>();
    }

    @Override
    public boolean visit(IResource resource) throws CoreException
    {
        switch (resource.getType())
        {
            case 1:
                if (resource.getName().endsWith(".hxml"))
                {
                    buildFileList.add((IFile)resource);
                }
                return true;
            case 2:
                for (IResource r: ((Folder)resource).members())
                {
                    visit(r);
                }
                break;
            default:
                break;
        }
        return true;
    }
}
