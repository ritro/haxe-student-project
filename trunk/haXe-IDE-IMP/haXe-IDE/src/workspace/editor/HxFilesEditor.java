package workspace.editor;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.tree.utils.CallHierarchyBuilder;
import haxe.tree.utils.HaxeTreePrinter;

import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.editor.UniversalEditor;
import org.eclipse.jface.text.TextSelection;

import workspace.Activator;
import workspace.WorkspaceUtils;
import workspace.elements.HaxeProject;

public class HxFilesEditor extends UniversalEditor
{    
    public HxFilesEditor()
    {
        super();
    }
    
    @Override
    protected void handleCursorPositionChanged() 
    {
        super.handleCursorPositionChanged();
        makeCallHierarchyAnalisys();
    }
    
    private void makeCallHierarchyAnalisys()
    {
        HaxeProject project = Activator.getInstance().getCurrentHaxeProject();
        if (project == null)
        {
            return;
        }
        HaxeTree node = getNodeToLookAt(project);
        if (node == null || !(node instanceof VarUsageNode))
        {
            return;
        }
        /*        
        try
        {
            ast = WorkspaceUtils.parseFileContents(file.getContents());
        }
        catch (RecognitionException | IOException | CoreException e)
        {
            // Auto-generated catch block
            e.printStackTrace();
            return;
        }
        HaxeTreeLinker linker = new HaxeTreeLinker();
        linker.visit(ast);*/
        
        CallHierarchyBuilder callFinder = new CallHierarchyBuilder();
        callFinder.visit(node);
        HashMap<String, List<HaxeTree>> result = callFinder.getResult();
        for (List<HaxeTree> value : result.values())
        {
            HaxeTreePrinter printer = new HaxeTreePrinter();
            printer.printArray(value);
        }
        Activator.getInstance().callH = result;
        Activator.getInstance().currNode = node;     
    }
    
    private HaxeTree getNodeToLookAt(HaxeProject project)
    {
        IPath path = getParseController().getPath();
        /*
        IPath fullPath = file.getFullPath();
        IPath relPath = fullPath.makeRelativeTo(project.getFullPath());
        String name = relPath.removeFileExtension().toString();*/
        String fPackage = WorkspaceUtils.converPathToPackage(path.removeFileExtension().toOSString());
        HaxeTree ast = project.getFileAST(fPackage);
        TextSelection selection = (TextSelection)getSelectionProvider().getSelection();
        return WorkspaceUtils.getNodeUnderCursor(selection.getOffset(), selection.getLength(), ast);
    }
}
