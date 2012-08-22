package workspace.editor;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import workspace.Activator;
import workspace.elements.BuildFile;
import workspace.elements.Utils;

public class BuildFileEditor extends MultiPageEditorPart implements IResourceChangeListener{

	/** The text editor used in page 0. */
	private TextEditor editor;
	private BuildFile buildFile;
	private BuildFileDesignerPage designer;

	public BuildFileEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}
	
	public BuildFile getBuildFile()
	{
	    return buildFile;
	}

	private void createTextPage() 
	{
		try {
			editor = new TextEditor();
			int index = addPage(editor, getEditorInput());
			setPageText(index, editor.getTitle());
		} catch (PartInitException e) {
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating nested text editor",
				null,
				e.getStatus());
		}
	}

	private void createDesignerPage() 
	{
		Composite composite = new Composite(getContainer(), SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		layout.numColumns = 2;
		int index = addPage(composite);
		setPageText(index, "Properties");

		designer = new BuildFileDesignerPage();
		designer.initialize(composite);
		convertTextToDesign();
	}
	
	protected void createPages() 
	{
		createTextPage();
		createDesignerPage();
	}
	
	private void convertTextToDesign()
	{
        String editorText =
            editor.getDocumentProvider().getDocument(editor.getEditorInput()).get();
        BuildFile newBuildFile = Utils.convertTextToBuildFile(editorText);
        designer.setTarget(newBuildFile.getTarget());
        designer.setSrcFolder(newBuildFile.getSourceFolder());
        designer.setOutputFolder(newBuildFile.getOutputFileWithPath());
        designer.setMainFileName(newBuildFile.getMainClass());
	}
	
	private void convertDesignToText()
	{
	    buildFile.setTarget(designer.getSelectedTarget());
	    buildFile.setSourceFolder(designer.getSrcFolder());
	    buildFile.setOutputFileWithPath(designer.getOutputFolder());
	    buildFile.setMainClassWithPackage(designer.getMainFileName());
	    editor.getDocumentProvider().getDocument(editor.getEditorInput()).set(buildFile.getContent());
	}

	protected void pageChange(int newPageIndex) 
	{
		super.pageChange(newPageIndex);
		if (newPageIndex == 0) 
		{
		    convertDesignToText();
		}
		else 
		{
			convertTextToDesign();
        }
	}

	public void dispose() 
	{
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	public void doSave(IProgressMonitor monitor) 
	{
		getEditor(0).doSave(monitor);
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}
	
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException 
	{
		if (!(editorInput instanceof IFileEditorInput))
		{
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		}
		super.init(site, editorInput);
		IFileEditorInput fileInput = (IFileEditorInput)editorInput;
		if (Activator.getProjectManager().getCurrentHaxeProject() != null)
		{
		    buildFile = Activator.getProjectManager().getCurrentHaxeProject().findBuildFile(
		        fileInput.getFile().getLocation().toOSString());
		}		
	}

	public boolean isSaveAsAllowed() 
	{
		return true;
	}
	
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}
	}
}
