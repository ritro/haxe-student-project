package workspace.contextMenu;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

import workspace.Activator;
import workspace.WorkspaceUtils;
import workspace.elements.HaxeProject;
import workspace.refactoring.HaxeRenameProcessor;
import workspace.refactoring.HaxeVariableRenameProcessor;

public class RenameAction extends HxEditorMenuAction
{
    @Override
    public void setActiveEditor(IAction action, IEditorPart targetEditor)
    {
        super.setActiveEditor(action, targetEditor);
        updateCurrentProject();
    }
    
    private void updateCurrentProject()
    {
        if (part == null)
        {
            // we get here as soon as tEditor loads withou preopened file
            return;
        }
        IEditorInput input = part.getEditorInput();
        if (!(input instanceof IFileEditorInput))
        {
            return;
        }
        IFile file = ((IFileEditorInput)input).getFile();
        Activator.getInstance().setCurrentProject(file);
    }
    
    private HaxeRenameProcessor getAppropriateProcessor(final HaxeTree node)
    {
        String newName = "SomeNewName";
        HaxeProject project = Activator.getInstance().getCurrentHaxeProject();
        
        if (node instanceof VarDeclarationNode)
        {
            return new HaxeVariableRenameProcessor(
                    (VarDeclarationNode)node,
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
            Activator.logger.error("CallHierarchyAction.run: {}", e.getMessage());
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
