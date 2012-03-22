package workspace.editor;


import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.internal.PageEventAction;

import workspace.Activator;

public class ActivePageController extends PageEventAction implements IEditorActionDelegate
{

    @SuppressWarnings("restriction")
    protected ActivePageController(String text, IWorkbenchWindow window) {
        super(text, window);
        // TODO Auto-generated constructor stub
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

    @Override
    public void setActiveEditor(IAction action, IEditorPart targetEditor)
    {
        // TODO Auto-generated method stub

    }

    public void pageActivated(IWorkbenchPage page) 
    {
        super.pageActivated(page);
        IEditorPart part = page.getActiveEditor();
        IEditorInput input = part.getEditorInput();
        if (!(input instanceof IFileEditorInput))
            return;
        IFile file = ((IFileEditorInput)input).getFile();
        Activator.getInstance().setCurrentProject(file);
    }
}
