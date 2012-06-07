package workspace.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.Workbench;

import tree.HaxeTree;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.editor.CodeFilesEditor;

public abstract class AbstractCommand extends AbstractHandler
{
    protected CodeFilesEditor getEditorPart()
    {
        IEditorPart  editorPart = 
                Workbench.getInstance().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

        return (CodeFilesEditor)editorPart;
    }
    
    protected HaxeTree getCurrentNode()
    {
        return getEditorPart().getCurrentNode();
    }

    protected HashMapForLists<NodeLink> getUsagesList()
    {
        CodeFilesEditor editor = getEditorPart();
        if (editor == null)
        {
            return null;
        }
        return editor.getUsagesList();
    }
}
