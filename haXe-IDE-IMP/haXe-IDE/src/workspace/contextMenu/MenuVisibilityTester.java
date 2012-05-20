package workspace.contextMenu;

import org.eclipse.core.expressions.PropertyTester;

import tree.HaxeTree;
import workspace.WorkspaceUtils;
import workspace.commands.RenameCommand;
import workspace.editor.HxFilesEditor;
import workspace.refactoring.HaxeRenameProcessor;

public class MenuVisibilityTester extends PropertyTester 
{
    
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) 
    {
        HxFilesEditor fragment= (HxFilesEditor)receiver;
        if ("canRefactor".equals(property)) 
        {
            HaxeTree node = fragment.getCurrentNode();
            if (!WorkspaceUtils.isNodeValidForUsageAnalysis(node))
            {
                node = WorkspaceUtils.getValidNodeForUsageAnalysis(node);
            }
            if (node == null)
            {
                return false;
            }
            HaxeRenameProcessor pr = RenameCommand.getAppropriateProcessor(node, "");
            return pr != null;
        }
        return false;
    }
}
