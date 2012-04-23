package workspace.contextMenu;

import imp.parser.antlr.tree.HaxeTree;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.editor.HxFilesEditor;

public abstract class HxEditorMenuAction extends MenuAction
{

    @Override
    public abstract void run(IAction action);

    @Override
    public abstract void selectionChanged(IAction action, ISelection selection);
    
    protected HaxeTree getCurrentNode()
    {
        if (part == null)
        {
            return null;
        }
        return ((HxFilesEditor)part).getCurrentNode();
    }

    protected HashMapForLists<NodeLink> getUsagesList()
    {
        if (part == null)
        {
            return null;
        }
        return ((HxFilesEditor)part).getUsagesList();
    }
}
