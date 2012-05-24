package workspace.contextMenu;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

import tree.HaxeTree;
import tree.utils.TreeUtils;
import workspace.commands.RenameCommand;
import workspace.editor.HxFilesEditor;
import workspace.refactoring.HaxeRenameProcessor;

public class VisibilityTester extends PropertyTester 
{
    
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) 
    {
        HxFilesEditor fragment= (HxFilesEditor)receiver;
        if ("canRefactor".equals(property)) 
        {
            HaxeTree node = fragment.getCurrentNode();
            return testCanRefactor(node);
        }
        return false;
    }
    
    private boolean testCanRefactor(HaxeTree node)
    {
        if (!TreeUtils.isNodeValidForUsageAnalysis(node))
        {
            node = TreeUtils.getValidNodeForUsageAnalysis(node);
        }
        if (node == null)
        {
            return false;
        }
        HaxeRenameProcessor pr = RenameCommand.getAppropriateProcessor(node, "");
        if (pr == null)
        {
            return false;
        }
        RefactoringStatus status;
        try
        {
            status = pr.checkInitialConditions(new NullProgressMonitor());
        }
        catch (OperationCanceledException | CoreException e)
        {
            return false;
        }
        
        return status.isOK();
    }
}
