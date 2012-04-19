package workspace.views;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public abstract class HierarchyView extends ViewPart implements ISelectionChangedListener
{
	protected TreeViewer 			treeViewer 		= null;
    protected ICallHierarchyElement invisibleRoot 	= null;
	protected int					autoExpandLevel	= 3;
    protected Text 					text 			= null;

	protected abstract void hookListeners();
	
	protected abstract void initContentProvider();
	
	@Override
	public void createPartControl(Composite parent) 
	{
		GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        layout.verticalSpacing = 2;
        layout.marginWidth = 0;
        layout.marginHeight = 2;
        parent.setLayout(layout);

        /* Create a "label" to display information in. I'm
         * using a text field instead of a lable so you can
         * copy-paste out of it. */
        text = new Text(parent, SWT.READ_ONLY | SWT.SINGLE | SWT.BORDER);
        // layout the text field above the treeviewer
        GridData layoutData = new GridData();
        layoutData.grabExcessHorizontalSpace = true;
        layoutData.horizontalAlignment = GridData.FILL;
        text.setLayoutData(layoutData);
        
        // Create the tree viewer as a child of the composite parent
        treeViewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL);
        initContentProvider();
        treeViewer.setUseHashlookup(true);
        
        // layout the tree viewer below the text field
        layoutData = new GridData();
        layoutData.grabExcessHorizontalSpace = true;
        layoutData.grabExcessVerticalSpace = true;
        layoutData.horizontalAlignment = GridData.FILL;
        layoutData.verticalAlignment = GridData.FILL;
        treeViewer.getControl().setLayoutData(layoutData);
        
        // Create menu, toolbars, filters, sorters.
        //createMenus();
        //createToolbar();
        hookListeners();
        
        treeViewer.setInput(invisibleRoot);
        treeViewer.setAutoExpandLevel(autoExpandLevel);
	}

	@Override
	public void setFocus() 
	{
		treeViewer.getControl().setFocus();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (event.getSelection() instanceof IStructuredSelection) 
        {
            IStructuredSelection selection = (IStructuredSelection) event.getSelection();
            Object selectedElement = selection.getFirstElement();
            /*
            if (selectedElement instanceof MethodWrapper) 
            {
                MethodWrapper methodWrapper = (MethodWrapper) selectedElement;
                updateDetailsView(methodWrapper);
            } else {
                updateDetailsView(null);
            }*/
        }
	}

}
