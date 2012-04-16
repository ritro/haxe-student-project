package workspace.contextMenu;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.tree.utils.ReferencesListBuilder;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.WorkspaceUtils;
import workspace.editor.HxFilesEditor;
import workspace.elements.HaxeProject;
import workspace.views.CallHierarchyView;

public class CallHierarchyAction extends HxEditorMenuAction
{
    CallHierarchyView view = null;
    
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
    
    private HashMapForLists<NodeLink> makeCallsList(final HaxeTree node)
    {
        ReferencesListBuilder builder = new ReferencesListBuilder();
        builder.visit(node);
        
        return builder.getResult();
    }

    @Override
    public void run(IAction action)
    {
        try
        {
            view = (CallHierarchyView) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage().showView(CallHierarchyView.ID);
            
            HaxeTree node = getCurrentNode();
            String fileName = Activator.getInstance().getCurrentFile().getName();
            HaxeProject proj = Activator.getInstance().getCurrentHaxeProject();
            
            if (!WorkspaceUtils.isNodeValidForCallAnalysis(node))
            {
                node = WorkspaceUtils.getValidNodeForCallAnalysis(node);
            }
            if (node != null)
            {
                view.init("", node, makeCallsList(node));
            }
        }
        catch (PartInitException e)
        {
            System.out.println("Couldn't open the view, id: " + CallHierarchyView.ID);
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
