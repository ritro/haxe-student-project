package workspace;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

public class ProjectVisitor implements IResourceVisitor
{
    private String extention = "";
    private List<IFile> buildFileList;
    
    public List<IFile> getBuildFileList()
    {
        return buildFileList;
    }
    
    public ProjectVisitor(String extention)
    {
        buildFileList = new ArrayList<IFile>();
        this.extention = extention;
    }

    @Override
    public boolean visit(IResource resource) throws CoreException
    {
        switch (resource.getType())
        {
            case 1:
                if (extention.equals(resource.getFileExtension()))
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
