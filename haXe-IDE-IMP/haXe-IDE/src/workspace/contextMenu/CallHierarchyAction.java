package workspace.contextMenu;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import workspace.Activator;
import workspace.views.CallHierarchyView;

public class CallHierarchyAction extends MenuAction
{
    @Override
    public void setActiveEditor(IAction action, IEditorPart targetEditor)
    {
        super.setActiveEditor(action, targetEditor);
        updateCurrentProject();
    }
    
    private void updateCurrentProject()
    {
        if (part == null)
        {
            // we get here as soon as tEditor loads withou preopened file
            return;
        }
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
        try
        {
            CallHierarchyView view = 
                    (CallHierarchyView) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage().showView(CallHierarchyView.VIEW_ID);
            view.init(Activator.getInstance().currNode, Activator.getInstance().callH);
        }
        catch (PartInitException e)
        {
            System.out.println("Couldn't open the view, id: " + CallHierarchyView.VIEW_ID);
            Activator.logger.error("CallHierarchyAction.run: {}", e.getMessage());
        }
        catch (ClassCastException  e)
        {
            System.out.println(e.getMessage());
            Activator.logger.error("CallHierarchyAction.run: {}", e.getMessage());
        }
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection)
    {
        // Auto-generated method stub        
    }
}
