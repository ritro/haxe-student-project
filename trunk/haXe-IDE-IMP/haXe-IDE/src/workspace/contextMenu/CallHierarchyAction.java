package workspace.contextMenu;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

import tree.HaxeTree;
import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.WorkspaceUtils;
import workspace.views.CallHierarchyView;

public class CallHierarchyAction extends HxEditorMenuAction
{
    CallHierarchyView view = null;

    @Override
    public void run(IAction action)
    {
        try
        {
            view = (CallHierarchyView) WorkspaceUtils.showViewPart(CallHierarchyView.ID);
            
            HaxeTree node = getCurrentNode();
            HashMapForLists<NodeLink> list = getUsagesList();
            
            // list not null means that current node also not null
            if (list != null)
            {
                view.init(node, list);
            }
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
