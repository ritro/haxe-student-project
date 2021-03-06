package workspace.commands;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;

import tree.Function;
import tree.HaxeTree;
import tree.expression.Declaration;
import tree.utils.TreeUtils;
import workspace.Activator;
import workspace.elements.HaxeProject;
import workspace.refactoring.FunctionRenameProcessor;
import workspace.refactoring.HaxeRenameProcessor;
import workspace.refactoring.VariableRenameProcessor;

public class RenameCommand extends AbstractCommand
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

    public static HaxeRenameProcessor getAppropriateProcessor(final HaxeTree node, String newName)
    {
        HaxeProject project = Activator.getProjectManager().getCurrentHaxeProject();
        
        if (node instanceof Declaration)
        {
            return new VariableRenameProcessor(
                    (Declaration)node,
                    newName, 
                    project);
        }
        if (node instanceof Function)
        {
            return new FunctionRenameProcessor(
                    (Function)node, 
                    newName, 
                    project);
        }
        return null;
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        try
        {
            HaxeTree node = getCurrentNode();
            if (!TreeUtils.isNodeValidForUsageAnalysis(node))
            {
                node = TreeUtils.getValidNodeForUsageAnalysis(node);
            }
            if (node == null)
            {
                return null;
            }
            String newName = showNewNameDialog();
            //If a string was returned, say so.
            if (newName == null || newName.length() == 0) 
            {
                return null;
            }
            HaxeRenameProcessor processor = getAppropriateProcessor(node, newName);
            Change change = processor.createChange(null);
            IProgressMonitor monitor = new NullProgressMonitor();
            if (processor.checkFinalConditions(monitor, null).isOK())
            {
                change.perform(monitor);                
            }
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
        return null;
    }

}
