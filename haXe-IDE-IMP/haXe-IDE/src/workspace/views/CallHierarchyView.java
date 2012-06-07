package workspace.views;

import java.util.HashMap;
import java.util.List;

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
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import tree.Function;
import tree.HaxeTree;
import tree.utils.TreeUtils;
import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.WorkspaceUtils;
import workspace.editor.CodeFilesEditor;
import workspace.elements.CodeFile;

public class CallHierarchyView extends HierarchyView
{
    public static final String ID    				= Activator.kPluginID + ".view.callHierarchy";
    public static final String GROUP_MAIN 			= "MENU_MAIN";
    public static final String GROUP_SEARCH_SCOPE 	= "MENU_SEARCH_SCOPE";
    
    private CallHierarchyLabelProvider labelProvider;
    private TableViewer table;

    public CallHierarchyView() 
    {
        super();
        
        invisibleRoot = new CallHierarchyFolderElement("");
        labelProvider = new CallHierarchyLabelProvider();
    }
    
    @Override
    protected void createLayout(Composite parent)
    {
        super.createLayout(parent);
        
        table = new TableViewer(
                parent, SWT.MULTI | SWT.H_SCROLL| SWT.V_SCROLL);
        GridData layoutData = new GridData();
        layoutData.grabExcessHorizontalSpace = true;
        layoutData.grabExcessVerticalSpace = true;
        layoutData.horizontalAlignment = GridData.FILL;
        layoutData.verticalAlignment = GridData.FILL;
        table.getControl().setLayoutData(layoutData);
        
        table.setContentProvider(new CallHierarchyCotentProvider());
        treeViewer.setLabelProvider(labelProvider);
    }
    
    @Override
    protected void initContentProvider()
    {
        treeViewer.setContentProvider(new CallHierarchyCotentProvider());
        treeViewer.setLabelProvider(labelProvider);
    }
    
    public void init(final HaxeTree root, final HashMapForLists<NodeLink> list)
    {
        invisibleRoot.clearAllChildren();
        CodeFile hFile = Activator.getProjectManager().getCurrentFile();
        
        CallHierarchyNodeElement visibleRoot = 
                new CallHierarchyNodeElement(hFile.getRealFile(), root, hFile.getPackage());
        CallHierarchyFolderElement callsTo = new CallHierarchyFolderElement("Calls To");
        CallHierarchyFolderElement callsFrom = new CallHierarchyFolderElement("Calls From");
        
        invisibleRoot.add(visibleRoot);
        text.setText(treeViewer.toString());
        
        //visibleRoot.add(callsTo);
        //visibleRoot.add(callsFrom);

        for (String pack : list.keySet())
        {
            HashMap<String, CallHierarchyNodeElement> funList = new HashMap<String, CallHierarchyNodeElement>();
            for (NodeLink info : list.get(pack))
            {
                CallHierarchyElement element = 
                        new CallHierarchyNodeElement(info.getFile(), info.getNode(), pack);
                Function function = TreeUtils.getParentFunction(info.getNode());
                if (function != null)
                {
                String key = pack+function.getText();
                CallHierarchyNodeElement funEl = funList.get(key);
                if (funEl == null)
                {
                    funEl = new CallHierarchyNodeElement(info.getFile(), function, pack);
                }
                funEl.addLink(element);
                funList.put(key, funEl);
                }
                else
                {
                    visibleRoot.add(element);
                }
            }
            ICallHierarchyElement[] ar = funList.values().toArray(new ICallHierarchyElement[0]);
            visibleRoot.add(ar);
        }
        treeViewer.refresh(invisibleRoot);
    }
    
    class DoubleClickListener implements IDoubleClickListener
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
        
    }
    
    protected void hookListeners()
    {
        DoubleClickListener listener = new DoubleClickListener();
        treeViewer.addDoubleClickListener(listener);
        table.addDoubleClickListener(listener);
        
        treeViewer.addSelectionChangedListener(new ISelectionChangedListener() 
        {    
            @Override
            public void selectionChanged(SelectionChangedEvent event)
            {
                updateTable(event.getSelection());
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
    
    private void updateTable(final ISelection selection)
    {
        table.setInput(null);
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
            List<CallHierarchyElement> links = methodWrapper.getLinks();

            if (links != null) 
            {
                for (CallHierarchyElement child : links)
                {
                    table.add(child);
                }
            }
        } 
        catch (Exception e) 
        {
            Activator.logger.error(
                    "CallHierarchyView.updateTable exception: ", e.getMessage());
        }
    }
    
    public void jumpToSelection(final ISelection selection) 
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
                WorkspaceUtils.jumpToLocation(methodWrapper.getFile(), node);
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
