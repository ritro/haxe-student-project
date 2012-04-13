package workspace.editor;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.tree.utils.CallHierarchyBuilder;
import haxe.tree.utils.HaxeTreePrinter;

import java.util.HashMap;
import java.util.List;

import org.eclipse.imp.editor.UniversalEditor;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;

import workspace.Activator;
import workspace.HashMapForLists;
import workspace.WorkspaceUtils;
import workspace.elements.HaxeProject;

public class HxFilesEditor extends UniversalEditor
{ 
	private HaxeTree currentNode = null;
	private CallHierarchyBuilder usagesBuilder = null;
	
	public HxFilesEditor()
	{
		super();
		usagesBuilder = new CallHierarchyBuilder();
		handleCursorPositionChanged();
	}
    
    @Override
    public void dispose()
    {
    	super.dispose();
    }
	
    @Override
    protected void handleCursorPositionChanged() 
    {
        super.handleCursorPositionChanged();
        
        updateCurrentNode();
        analyzeCurrentNodeUsages();
    }
    
/*
    @Override
    public IDocumentProvider getDocumentProvider() 
    {
        IEditorInput input = getEditorInput();
        if (input instanceof IURIEditorInput) 
        {
            IURIEditorInput uriEditorInput = (IURIEditorInput) input;
            URI uri= uriEditorInput.getURI();
            String path= uri.getPath();
            if (path.contains(".jar:") || path.contains(".zip:")) 
            {
                super.getDocumentProvider();
            }
        }
        if(input instanceof IFileEditorInput)
        {
            try
            {
                InputStream stream = ((FileEditorInput)input).getFile().getContents();
            
                Charset encording = 
                        WorkspaceUtils.getEncoding(new PushbackInputStream(stream));
                if (encording == null)
                {
                    fEncodingSupport = new DefaultEncodingSupport();
                }
            }
            catch (IOException | CoreException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            FileEditorInput in = new FileEditorInput(((FileEditorInput)input).getFile());
            return new documentProvider();
        } 
        return super.getDocumentProvider();
    }*/
    
    private void analyzeCurrentNodeUsages()
    {
        if (currentNode == null)
        {
            //Activator.logger.info("HxFilesEditor.makeCallHierarchyAnalisys failed - node not found.");
            return;
        }
        // TODO remove later:
        if (!(currentNode instanceof VarUsageNode))
        {
            return;
        }
        
        usagesBuilder.visit(currentNode);
        HashMapForLists<HaxeTree> result = usagesBuilder.getResult();
        Activator.getInstance().callH = result;
        Activator.getInstance().currNode = currentNode;
    }
    
    private void updateCurrentNode()
    {
        HaxeProject project = Activator.getInstance().getCurrentHaxeProject();
        if (project == null)
        {
        	currentNode = null;
        	return;
        }
        HaxeTree ast = project.getFileAST(Activator.getInstance().activeFile);
        if (ast == null)
        {
        	currentNode = null;
            return;
        }
        TextSelection selection = (TextSelection)getSelectionProvider().getSelection();
        int offset = selection.getOffset();
        int length = selection.getLength();
        currentNode = WorkspaceUtils.getNodeByOffset(offset, length, ast);
    }
}
