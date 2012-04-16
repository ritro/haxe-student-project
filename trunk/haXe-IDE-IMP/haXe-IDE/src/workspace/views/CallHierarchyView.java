package workspace.views;

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.ui.IContextMenuConstants;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import workspace.Activator;
import workspace.HashMapForLists;
import workspace.WorkspaceUtils;
import workspace.editor.HxFilesEditor;
import workspace.elements.HaxeFile;
import workspace.elements.HaxeProject;

public class CallHierarchyView extends HierarchyView
{
    public static final String VIEW_ID 				= Activator.kPluginID + ".view.callHierarchy";
    public static final String GROUP_MAIN 			= "MENU_MAIN";
    public static final String GROUP_SEARCH_SCOPE 	= "MENU_SEARCH_SCOPE";
    
    private CallHierarchyLabelProvider labelProvider;

    public CallHierarchyView() 
    {
        super();
    }

    /// View Part implementations
    
    @Override
    public void createPartControl(Composite parent)
    {
    	super.createPartControl(parent);
    	
        treeViewer.setContentProvider(new CallHierarchyCotentProvider());
        labelProvider = new CallHierarchyLabelProvider();
        treeViewer.setLabelProvider(labelProvider);
    }    
    
    public void init(final HaxeTree root, HashMapForLists<HaxeTree> list)
    {
        invisibleRoot.clearAllChildren();
        
        NodeCallHierarchyElement visibleRoot = new NodeCallHierarchyElement(root, "");
        FolderCallHierarchyElement callsTo = new FolderCallHierarchyElement("Calls To");
        FolderCallHierarchyElement callsFrom = new FolderCallHierarchyElement("Calls From");
        
        invisibleRoot.add(visibleRoot);
        text.setText(treeViewer.toString());
        
        visibleRoot.add(callsTo);
        visibleRoot.add(callsFrom);
    
        if (list == null)
        {
            list = new HashMapForLists<HaxeTree>();
        }
        for (String pack : list.keySet())
        {
            for (HaxeTree node : list.get(pack))
            {
                callsTo.add(new NodeCallHierarchyElement(node, pack));
            }
        }
        treeViewer.refresh(invisibleRoot);
    }
    
    protected void hookListeners()
    {
        treeViewer.addDoubleClickListener(new IDoubleClickListener() 
        {            
            /**
            * Double click listener which jumps to the method in the source code.
            * @param event
            */
            @Override
           public void doubleClick(DoubleClickEvent event) 
           {
              jumpToSelection(event.getSelection());
           }
        });
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
    
    private void jumpToLocation(final String pack, final HaxeTree node)
    {
        // TODO we can change current project but view will be the same, so fix that later
        HaxeProject proj = Activator.getInstance().getCurrentHaxeProject();
        HaxeFile file = proj.getFile(pack);
        if (file == null)
        {
            return;
        }
        HaxeTree ast = file.getAst();
        IFile realFile = file.getRealFile();
        try
        {
            IEditorPart editor = WorkspaceUtils.openFileInEditor(realFile);
            if (!(editor instanceof HxFilesEditor))
            {
                return;
            }
            HxFilesEditor hxEditor = (HxFilesEditor)editor;
            hxEditor.selectAndReveal(node.getMostLeftPosition(), node.getLength());
        }
        catch (PartInitException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void jumpToSelection(ISelection selection) 
    {
        if (selection == null || !(selection instanceof IStructuredSelection))
        {
            return;
        }
        try 
        {
            Object structuredSelection = ((IStructuredSelection) selection).getFirstElement();
            
            if (!((ICallHierarchyElement)structuredSelection).isClickable())
            {
                return;
            }

            NodeCallHierarchyElement methodWrapper = (NodeCallHierarchyElement) structuredSelection;
            HaxeTree node = methodWrapper.getNode();
            String pack = methodWrapper.getPackage();

            if (node != null) 
            {
                jumpToLocation(pack, node);
            } 
            //else {
            //    jumpToMethod(methodWrapper.getMethod());
            //}
        } 
        catch (Exception e) 
        {
            Activator.logger.error(
                    "CallHierarchyView.jumpToSelection exception: ", e.getMessage());
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
