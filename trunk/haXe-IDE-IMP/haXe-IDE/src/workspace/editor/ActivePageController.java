package workspace.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.PageEventAction;

import workspace.Activator;

public class ActivePageController implements IPartListener2
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void partClosed(IWorkbenchPartReference partRef)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void partDeactivated(IWorkbenchPartReference partRef)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void partOpened(IWorkbenchPartReference partRef)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void partHidden(IWorkbenchPartReference partRef)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void partVisible(IWorkbenchPartReference partRef)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void partInputChanged(IWorkbenchPartReference partRef)
    {
        // TODO Auto-generated method stub
        
    }
}
