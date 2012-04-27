package workspace.views;


import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.ui.IContextMenuConstants;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

import tree.HaxeTree;
import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.WorkspaceUtils;
import workspace.editor.HxFilesEditor;

public class CallHierarchyView extends HierarchyView
{
    public static final String ID    				= Activator.kPluginID + ".view.callHierarchy";
    public static final String GROUP_MAIN 			= "MENU_MAIN";
    public static final String GROUP_SEARCH_SCOPE 	= "MENU_SEARCH_SCOPE";
    
    private CallHierarchyLabelProvider labelProvider;

    public CallHierarchyView() 
    {
        super();
        
        invisibleRoot = new CallHierarchyFolderElement("");
        labelProvider = new CallHierarchyLabelProvider();
    }
    
    @Override
    protected void initContentProvider()
    {
        treeViewer.setContentProvider(new CallHierarchyCotentProvider());
        treeViewer.setLabelProvider(labelProvider);
    }
    
    public void init(final String pack, final HaxeTree root, HashMapForLists<NodeLink> list)
    {
        invisibleRoot.clearAllChildren();
        IFile file = Activator.getInstance().getCurrentFile().getRealFile();
        
        CallHierarchyNodeElement visibleRoot = new CallHierarchyNodeElement(file, root, pack);
        CallHierarchyFolderElement callsTo = new CallHierarchyFolderElement("Calls To");
        CallHierarchyFolderElement callsFrom = new CallHierarchyFolderElement("Calls From");
        
        invisibleRoot.add(visibleRoot);
        text.setText(treeViewer.toString());
        
        visibleRoot.add(callsTo);
        visibleRoot.add(callsFrom);
    
        if (list == null)
        {
            list = new HashMapForLists<NodeLink>();
        }
        for (String cpack : list.keySet())
        {
            for (NodeLink info : list.get(cpack))
            {
                callsTo.add(new CallHierarchyNodeElement(info.getFile(), info.getNode(), cpack));
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
    
    private void jumpToLocation(final IFile file, final HaxeTree node)
    {
        if (file == null)
        {
            return;
        }
        try
        {
            IEditorPart editor = WorkspaceUtils.openFileInEditor(file);
            if (!(editor instanceof HxFilesEditor))
            {
                return;
            }
            HxFilesEditor hxEditor = (HxFilesEditor)editor;
            hxEditor.selectAndReveal(node.getMostLeftPosition(), node.getLength());
        }
        catch (Exception e)
        {
            String message = "CallHierarchyView.jumpToLocation: " + e.getLocalizedMessage();
            Activator.logger.error(message);
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

            CallHierarchyNodeElement methodWrapper = (CallHierarchyNodeElement) structuredSelection;
            HaxeTree node = methodWrapper.getNode();

            if (node != null) 
            {
                jumpToLocation(methodWrapper.getFile(), node);
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

}
