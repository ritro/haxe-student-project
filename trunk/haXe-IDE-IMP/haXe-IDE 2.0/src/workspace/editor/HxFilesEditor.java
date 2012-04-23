package workspace.editor;

import imp.utilsImplementations.HaxeTokenColorer;

import org.antlr.runtime.CommonToken;
import org.eclipse.core.resources.IFile;
import org.eclipse.imp.editor.UniversalEditor;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;

import tree.HaxeTree;
import tree.specific.VarUsageNode;
import tree.utils.ReferencesListBuilder;
import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.WorkspaceUtils;
import workspace.elements.HaxeFile;
import workspace.elements.HaxeProject;

public class HxFilesEditor extends UniversalEditor
{ 
	private HaxeTree                   currentNode     = null;
	private ReferencesListBuilder      usagesBuilder   = null;
	private HashMapForLists<NodeLink>  usagesList      = null;
	private IPartListener2             partListener    = null;
	
	public HxFilesEditor()
	{
		super();
		usagesBuilder = new ReferencesListBuilder();
		handleCursorPositionChanged();
	}
	
	public HashMapForLists<NodeLink> getUsagesList()
	{
	    return usagesList;
	}
	
	public HaxeTree getCurrentNode()
	{
	    return currentNode;
	}
	
	public void createPartControl(Composite parent)
	{
	    super.createPartControl(parent);
	    
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

        //adding a listener
        //partListener = new ActivePageController();
	    //page.addPartListener(partListener);
	}
    
    @Override
    public void dispose()
    {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        //page.removePartListener(partListener);
        
    	currentNode = null;
    	usagesBuilder = null;
    	usagesList = null;
    	
    	super.dispose();
    }
	
    @Override
    protected void handleCursorPositionChanged() 
    {
        super.handleCursorPositionChanged();
        
        updateCurrentNode();
        analyzeCurrentNodeUsages();
        
        if (WorkspaceUtils.isNodeValidForUsageAnalysis(currentNode)
                || currentNode instanceof VarUsageNode)
        {
            //highlightCurrentNodeUsagesInText();
        }
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
            return;
        }
        
        TextSelection selection = (TextSelection)getSelectionProvider().getSelection();
        int offset = selection.getOffset();
        HaxeTree nodeForUsagesList = currentNode;
        
        if (!WorkspaceUtils.isNodeValidForUsageAnalysis(currentNode))
        {
            nodeForUsagesList = WorkspaceUtils.getValidNodeForUsageAnalysis(currentNode, offset);
        }        
        
        if (nodeForUsagesList != null)
        {
            System.out.println("Node for usages: " + nodeForUsagesList.getText());
            usagesBuilder.visit(nodeForUsagesList);
            usagesList = usagesBuilder.getResult();
        }
    }
    
    private void highlightCurrentNodeUsagesInText()
    {        
        ISourceViewer view = getSourceViewer();
        IFile activeFile = Activator.getInstance().getCurrentFile();
        HaxeProject project = Activator.getInstance().getCurrentHaxeProject();
        HaxeFile currFile = project.getFile(activeFile);
        String currPack = currFile.getPackage();
        
        TextPresentation presentation = new TextPresentation();
        
        for (NodeLink info : usagesList.get(currPack))
        {
            HaxeTree node = info.getNode();
            int offset = node.getMostLeftPosition();
            int end = node.getMostRightPosition();

            Display display = Display.getDefault();
            StyleRange styleRange = new StyleRange(            
                    offset, end - offset + 1,
                    display.getSystemColor(SWT.COLOR_WHITE),
                    display.getSystemColor(SWT.COLOR_BLUE),
                    SWT.NORMAL);

            // Negative (possibly 0) length style ranges will cause an 
            // IllegalArgumentException in changeTextPresentation(..)
            if (styleRange.length > 0 ) 
            {
                presentation.addStyleRange(styleRange);
            }
        }
        if (!presentation.isEmpty() && view.isEditable())
        {
            view.changeTextPresentation(presentation, true);
        }
    }
    
    private void updateCurrentNode()
    {
        HaxeProject project = Activator.getInstance().getCurrentHaxeProject();
        if (project == null)
        {
        	currentNode = null;
        	return;
        }
        HaxeTree ast = project.getFileAST(Activator.getInstance().getCurrentFile());
        TextSelection selection = (TextSelection)getSelectionProvider().getSelection();
        if (ast == null || selection == null)
        {
        	currentNode = null;
            return;
        }
        int offset = selection.getOffset();
        int length = selection.getLength();
        currentNode = WorkspaceUtils.getNodeByOffset(offset, length, ast);
    }
}
