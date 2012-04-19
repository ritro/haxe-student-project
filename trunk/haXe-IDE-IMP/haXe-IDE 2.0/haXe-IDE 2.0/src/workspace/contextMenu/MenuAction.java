package workspace.contextMenu;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

public abstract class MenuAction implements IEditorActionDelegate
{
    protected IEditorPart part = null;

    @Override
    public abstract void run(IAction action);

    @Override
    public abstract void selectionChanged(IAction action, ISelection selection);

    @Override
    public void setActiveEditor(IAction action, IEditorPart targetEditor)
    {
        part = targetEditor;
    }

}
