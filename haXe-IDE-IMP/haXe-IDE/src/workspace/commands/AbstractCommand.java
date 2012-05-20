package workspace.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.Workbench;

import tree.HaxeTree;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.editor.HxFilesEditor;

public abstract class AbstractCommand extends AbstractHandler
{
    protected HxFilesEditor getEditorPart()
    {
        IEditorPart  editorPart = 
                Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

        return (HxFilesEditor)editorPart;
    }
    
    protected HaxeTree getCurrentNode()
    {
        return getEditorPart().getCurrentNode();
    }

    protected HashMapForLists<NodeLink> getUsagesList()
    {
        HxFilesEditor editor = getEditorPart();
        if (editor == null)
        {
            return null;
        }
        return editor.getUsagesList();
    }

}
