package workspace.contextMenu;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Preferences.IPropertyChangeListener;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import workspace.Activator;
import workspace.WorkspaceUtils;
import workspace.elements.HaxeProject;

import haxe.imp.parser.HaxeParseController;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.tree.utils.CallHierarchyBuilder;
import haxe.tree.utils.HaxeTreeLinker;

public class CallHierarchyAction implements IEditorActionDelegate
{
    private IEditorPart part = null;

    @Override
    public void setActiveEditor(IAction action, IEditorPart targetEditor)
    {
        // TODO Auto-generated method stub
        part = targetEditor;
        updateCurrentProject();
    }
    
    private void updateCurrentProject()
    {
        IEditorInput input = part.getEditorInput();
        if (!(input instanceof IFileEditorInput))
        {
            return;
        }
        IFile file = ((IFileEditorInput)input).getFile();
        Activator.getInstance().setCurrentProject(file);
    }

    @Override
    public void run(IAction action)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection)
    {
        // TODO Auto-generated method stub
        
    }
}
