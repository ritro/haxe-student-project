package workspace.views;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.treeModelBuilder.HaxeLabelProvider;

import org.eclipse.jdt.ui.IContextMenuConstants;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;


import antlr.CommonToken;

public class CallHierarchyView extends ViewPart implements ISelectionChangedListener
{
    public static final String VIEW_ID = "haXe-IDE.haXeCallHierarchyView";
    public static final String GROUP_MAIN = "MENU_MAIN";
    public static final String GROUP_SEARCH_SCOPE = "MENU_SEARCH_SCOPE";
    
    private TreeViewer treeViewer;
    private ListViewer listViewer;
    private CallHierarchyLabelProvider labelProvider;
    private CallHierarchyElement invisibleRoot = null;
    private Text text;

    public CallHierarchyView() 
    {
        super();
    }

    /// View Part implementations
    
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
        treeViewer.setContentProvider(new CallHierarchyCotentProvider());
        labelProvider = new CallHierarchyLabelProvider();
        treeViewer.setLabelProvider(labelProvider);
        
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
        //hookListeners();

        invisibleRoot = new CallHierarchyElement(null, "");
        treeViewer.setInput(invisibleRoot);
        treeViewer.setAutoExpandLevel(2);
    }

    @Override
    public void setFocus()
    {
        treeViewer.getControl().setFocus();
    }

    //--------------------- end of ViewPart implementations -----------------------
    
    
    public void init(HaxeTree root, HashMap<String, List<HaxeTree>> list)
    {
        invisibleRoot.clearAllChildren();
        CallHierarchyElement visibleRoot = new CallHierarchyElement(root, "");
        invisibleRoot.add(visibleRoot);
        text.setText(treeViewer.toString());        
        
        for (String pack : list.keySet())
        {
            for (HaxeTree node : list.get(pack))
            {
                visibleRoot.add(new CallHierarchyElement(node, pack));
            }
        }
        treeViewer.refresh(invisibleRoot);
    }
    
    /**
     *
     */
    private MenuManager createPopupMenu() {
        MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            
            public void menuAboutToShow(IMenuManager manager) {
                fillContextMenu(manager);
            }
        });
        
        return menuMgr;
    }    

    protected void fillContextMenu(IMenuManager manager) {
        manager.add(new GroupMarker(GROUP_MAIN));
        manager.add(new GroupMarker(GROUP_SEARCH_SCOPE));
/*
        mActions.setContext(new ActionContext(getSelection()));
        mActions.fillContextMenu(manager);
        mActions.setContext(null);
        
        mActions.setContext(new ActionContext(getSelection()));
        mSearchScopeActions.fillContextMenu(manager);
        mActions.setContext(null);*/

        manager.add(new GroupMarker(IContextMenuConstants.GROUP_ADDITIONS));
    }

    /** 
     * Double click listener which jumps to the method in the source code.
     * @param event
     */
    public void doubleClick(DoubleClickEvent event) 
    {
       jumpToSelection(event.getSelection());
    }
    
    public void jumpToSelection(ISelection selection) {
        if (selection == null || !(selection instanceof IStructuredSelection))
        {
            return;
        }
        /*try {
            Object structuredSelection = ((IStructuredSelection) selection).getFirstElement();

            if (structuredSelection instanceof MethodWrapper) {
                MethodWrapper methodWrapper = (MethodWrapper) structuredSelection;
                CallLocation firstCall = methodWrapper.getMethodCall().getFirstCallLocation();

                if (firstCall != null) {
                    jumpToLocation(firstCall);
                } else {
                    jumpToMethod(methodWrapper.getMethod());
                }
            } else if (structuredSelection instanceof CallLocation) {
                jumpToLocation((CallLocation) structuredSelection);
            }
        } catch (Exception e) {
            CallersPlugin.logError("Error handling double click", e);
        }*/
    }

    @Override
    public void selectionChanged(SelectionChangedEvent event)
    {
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

    /**
     * Opens a Java editor for an element (IJavaElement, IFile, IStorage...).
     * Currently the copied functionality is unable to open class files since this
     * would require interfacing with internal API.
     * 
     * @return the IEditorPart or null if wrong element type or opening failed
     
    public static IEditorPart openInEditor(Object inputElement, boolean activate) 
            throws JavaModelException, PartInitException {
        if (inputElement instanceof IJavaElement) {
            return JavaUI.openInEditor((IJavaElement)inputElement);
        } else {
            return null;
        }
    }*/

}