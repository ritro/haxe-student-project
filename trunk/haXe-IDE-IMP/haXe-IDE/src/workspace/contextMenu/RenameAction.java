package workspace.contextMenu;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ltk.core.refactoring.Change;

import tree.HaxeTree;
import tree.specific.DeclarationNode;
import workspace.Activator;
import workspace.WorkspaceUtils;
import workspace.elements.HaxeProject;
import workspace.refactoring.HaxeRenameProcessor;
import workspace.refactoring.HaxeVariableRenameProcessor;

public class RenameAction extends HxEditorMenuAction
{    
    private String showNewNameDialog()
    {
        JFrame frame = new JFrame();
        Object[] possibilities = null;
        return (String)JOptionPane.showInputDialog(
                            frame,
                            "Enter new name:\n",
                            "New name",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            possibilities,
                            "newName");

        
    }
    
    private HaxeRenameProcessor getAppropriateProcessor(final HaxeTree node)
    {
        String newName = showNewNameDialog();
        //If a string was returned, say so.
        if (newName == null || newName.length() == 0) 
        {
            return null;
        }
        HaxeProject project = Activator.getInstance().getCurrentHaxeProject();
        
        if (node instanceof DeclarationNode)
        {
            return new HaxeVariableRenameProcessor(
                    (DeclarationNode)node,
                    newName, 
                    project);
        }
        return null;
    }

    @Override
    public void run(IAction action)
    {
        try
        {
            HaxeTree node = getCurrentNode();
            if (!WorkspaceUtils.isNodeValidForUsageAnalysis(node))
            {
                node = WorkspaceUtils.getValidNodeForUsageAnalysis(node);
            }
            if (node == null)
            {
                return;
            }
            HaxeRenameProcessor processor = getAppropriateProcessor(node);
            Change change = processor.createChange(null);
            change.perform(new NullProgressMonitor());
        }
        catch (ClassCastException  e)
        {
            System.out.println(e.getMessage());
            Activator.logger.error("RenameAction.run: {}", e.getMessage());
        }
        catch (CoreException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection)
    {
        // Auto-generated method stub        
    }
}
