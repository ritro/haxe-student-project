package workspace.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;

import workspace.Activator;

public class ActiveEditorManager implements IPartListener2
{
    IEditorPart currentEditor = null;
    ISelectionChangedListener listener = null;

    @Override
    public void partActivated(final IWorkbenchPartReference partRef)
    {
        IWorkbenchPart wpart = partRef.getPart(false);
        IWorkbenchPage page = wpart.getSite().getPage();
        IEditorPart part = page.getActiveEditor();
        IEditorInput input = part.getEditorInput();
        if (!(input instanceof IFileEditorInput))
        {
            return;
        }
        IFile file = ((IFileEditorInput)input).getFile();
        Activator.getInstance().setCurrentProject(file);
    }

    @Override
    public void partBroughtToTop(IWorkbenchPartReference partRef)
    {
        
    }

    @Override
    public void partClosed(IWorkbenchPartReference partRef)
    {
        
    }

    @Override
    public void partDeactivated(IWorkbenchPartReference partRef)
    {
        
    }

    @Override
    public void partOpened(IWorkbenchPartReference partRef)
    {
    }

    @Override
    public void partHidden(IWorkbenchPartReference partRef)
    {
        
    }

    @Override
    public void partVisible(IWorkbenchPartReference partRef)
    {
        
    }

    @Override
    public void partInputChanged(IWorkbenchPartReference partRef)
    {
        
    }
}
