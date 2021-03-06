package workspace.editor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclipse.core.resources.IFile;
import org.eclipse.imp.editor.UniversalEditor;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import tree.HaxeTree;
import tree.expression.Usage;
import tree.utils.TreeUtils;
import tree.utils.ReferencesListBuilder;
import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.elements.CodeFile;
import workspace.elements.HaxeProject;

public class CodeFilesEditor extends UniversalEditor
{ 
    private CodeFile                   currentFile     = null;
	private HaxeTree                   currentNode     = null;
	private ReferencesListBuilder      usagesBuilder   = null;
	private HashMapForLists<NodeLink>  usagesList      = null;
	private IPartListener2             partListener    = null;
	private TextSelection              currentSelection= null;

    private ExecutorService            executor        = null;
    private Future                     future          = null;
	
	public CodeFilesEditor()
	{
		super();executor = Executors.newSingleThreadExecutor();
		usagesBuilder = new ReferencesListBuilder();
		handleCursorPositionChanged();
		
		setPartProperty("readOnly", "false");
	}
	
	public HashMapForLists<NodeLink> getUsagesList()
	{
	    // Unchecked done-wait procedure
	    if (!future.isDone())
	    {
	        try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                return null;
            }
	    }
	    return usagesList;
	}
	
	public HaxeTree getCurrentNode()
	{
	    return currentNode;
	}
	
	public CodeFile getCurrentFile()
	{
	    return currentFile;
	}
	
	public void createPartControl(Composite parent)
	{
	    super.createPartControl(parent);

        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        partListener = new ActiveEditorManager();
        window.getPartService().addPartListener(partListener);
	}
    
    @Override
    public void dispose()
    {
        if (partListener != null)
        {
            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            window.getPartService().removePartListener(partListener);
        }

        currentNode = null;
        usagesList = null;
    	usagesBuilder = null;
    	
    	super.dispose();
    }
	
    @Override
    protected void handleCursorPositionChanged() 
    {
        if (future != null)
        {
            future.cancel(true);
        }
        super.handleCursorPositionChanged();
        
        updateCurrentNode();
        currentSelection = (TextSelection)getSelectionProvider().getSelection();
        future = executor.submit(new Runnable() {
            
            @Override
            public void run()
            {
                analyzeCurrentNodeUsages();
            }
        });
        
        if (TreeUtils.isNodeValidForUsageAnalysis(currentNode)
                || currentNode instanceof Usage)
        {
            //highlightCurrentNodeUsagesInText();
        }
    }
    
    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException
    {
        super.init(site, input);
        
        if (input != null && input instanceof IFileEditorInput)
        {
            IFileEditorInput i = (IFileEditorInput)input;
            Activator.getProjectManager().setCurrentProject(i.getFile());
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
    
    private void updateCurrentFile(final CodeFile file)
    {
        currentFile = file;
        if (currentFile != null)
        {
            boolean readOnly = currentFile.getRealFile().isReadOnly();
            setPartProperty("readOnly", Boolean.toString(readOnly));
        }
    }
    
    private void analyzeCurrentNodeUsages()
    {
        usagesList = null;
        if (currentNode == null)
        {
            return;
        }
        
        HaxeTree nodeForUsagesList = currentNode;
        int offset = currentSelection.getOffset();
        
        if (!TreeUtils.isNodeValidForUsageAnalysis(currentNode))
        {
            nodeForUsagesList = TreeUtils.getValidNodeForUsageAnalysis(currentNode, offset);
        }        
        
        if (nodeForUsagesList != null)
        {
            System.out.println("Node for usages: " + nodeForUsagesList.getText());
            usagesBuilder.visit(nodeForUsagesList);
            usagesList = usagesBuilder.getResult();
        }
        notify();
    }
    
    private void highlightCurrentNodeUsagesInText()
    {        
        ISourceViewer view = getSourceViewer();
        CodeFile hFile = currentFile;
        IFile activeFile = hFile.getRealFile();
        HaxeProject project = Activator.getProjectManager().getCurrentHaxeProject();
        CodeFile currFile = project.getFile(activeFile);
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
        currentNode = null;
        HaxeProject project = Activator.getProjectManager().getCurrentHaxeProject();
        if (project == null)
        {
        	return;
        }
        updateCurrentFile(Activator.getProjectManager().getCurrentFile());
        if (currentFile == null)
        {
            return;
        }
        HaxeTree ast = currentFile.getAst();
        TextSelection selection = (TextSelection)getSelectionProvider().getSelection();
        if (ast == null || selection == null)
        {
            return;
        }
        int offset = selection.getOffset();
        int length = selection.getLength();
        currentNode = TreeUtils.getNodeByOffset(offset, length, ast);
    }
}
