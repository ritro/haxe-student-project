package workspace.contextMenu;

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

import workspace.HashMapForLists;
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

    protected HashMapForLists<HaxeTree> getUsagesList()
    {
        if (part == null)
        {
            return null;
        }
        return ((HxFilesEditor)part).getUsagesList();
    }
}
