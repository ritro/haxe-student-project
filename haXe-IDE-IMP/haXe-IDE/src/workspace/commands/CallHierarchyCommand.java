package workspace.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import tree.HaxeTree;
import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.WorkspaceUtils;
import workspace.views.CallHierarchyView;

public class CallHierarchyCommand extends AbstractCommand
{
    CallHierarchyView view = null;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException
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
        return null;
    }

}
