package workspace.contextMenu;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

import workspace.Activator;

public class CallHierarchyAction implements IEditorActionDelegate
{
    private IEditorPart part = null;

    @Override
    public void setActiveEditor(IAction action, IEditorPart targetEditor)
    {
        part = targetEditor;
        updateCurrentProject();
    }
    
    private void updateCurrentProject()
    {
        IEditorInput input = part.getEditorInput();
        if (!(input instanceof IFileEditorInput))
        {
            return;
        }
        IFile file = ((IFileEditorInput)input).getFile();
        Activator.getInstance().setCurrentProject(file);
    }

    @Override
    public void run(IAction action)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection)
    {
        // TODO Auto-generated method stub
        
    }
}
