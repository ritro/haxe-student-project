/*******************************************************************************
 * Copyright (c) 2009 Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU General Public License, version 2
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Contributors:
 *    Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 *******************************************************************************/
package imp.treeModelBuilder;

import haxe.imp.parser.antlr.main.HaxeLexer;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;

import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.Token;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.imp.editor.ModelTreeNode;
import org.eclipse.imp.services.ILabelProvider;
import org.eclipse.imp.utils.MarkerUtils;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import workspace.Activator;
import workspace.elements.IHaxeResources;

/**
 * This class allows to get images for such workspace elements as
 * files (in normal, error and others conditions), different view items
 * and labels for them.
 * 
 * @author Anatoly Kondratyev
 * @author Savenko Maria
 */
public class HaxeLabelProvider implements ILabelProvider 
{

	private final Set<ILabelProviderListener> fListeners = new HashSet<ILabelProviderListener>();

	private static ImageRegistry sImageRegistry = 
	        Activator.getInstance().getImageRegistry();


    // ---------- IBaseLabelProvider implementations ----------------

    public void addListener(final ILabelProviderListener listener) 
    {
        this.fListeners.add(listener);
    }

    public void dispose() {}

    public boolean isLabelProperty(final Object element, final String property) 
    {
        return false;
    }

    public void removeListener(final ILabelProviderListener listener) 
    {
        this.fListeners.remove(listener);
    }
    // ------------------------end------------------------------------
    
	public Image getImage(final Object element) 
	{
		if (element instanceof IFile) 
		{
			IFile file = (IFile) element;
			int sev = MarkerUtils.getMaxProblemMarkerSeverity(file,
					IResource.DEPTH_ONE);

			switch (sev) 
			{
			case IMarker.SEVERITY_ERROR:
				return sImageRegistry.get(IHaxeResources.HAXE_FILE_ERROR);
			case IMarker.SEVERITY_WARNING:
				return sImageRegistry.get(IHaxeResources.HAXE_FILE_WARNING);
			default:
				return sImageRegistry.get(IHaxeResources.HAXE_FILE);
			}
		}
		HaxeTree n = (element instanceof ModelTreeNode) 
		        ? (HaxeTree) ((ModelTreeNode) element).getASTNode()
				: (HaxeTree) element;
		return getImageForHaxeTreeNode(n);
	}

	public String getText(final Object element) {
		HaxeTree n = (element instanceof ModelTreeNode) ? (HaxeTree) ((ModelTreeNode) element)
				.getASTNode()
				: (HaxeTree) element;

		return getLabelForHaxeTreeNode(n);
	}

	/**
	 * Gets the image for HaxeTree element in correspond to it's
	 * type.
	 * @param n - some haxeTree node to get image for
	 * @return image for passed node
	 */
	private static Image getImageForHaxeTreeNode(final HaxeTree n) 
	{
	    if (n instanceof FunctionNode)
	    {
	        sImageRegistry.get(IHaxeResources.FUNCTION_SMALL_PICTO);
	    }
	    
		return sImageRegistry.get(IHaxeResources.HAXE_DEFAULT_OUTLINE_ITEM);
	}

	/**
	 * Generating label for tree structure in correspond to passed node.
	 * ( outline, call hierarchy and the rest)
	 * 
	 * @param n - passed node
	 * @return the label for node in tree
	 */
	private static String getLabelForHaxeTreeNode(final HaxeTree n) 
	{
		// START_HERE
	    if (n == null)
	    {
	        return "<??unknown??>";
	    }
	    Token token = n.token;
	    if (token != null && token.getType() == HaxeLexer.MODULE) 
	    {
			return "Module";
		} 
	    else if (token != null && token.getType() == HaxeLexer.ENUM) 
	    {
			String enumReturn = "Enum ";
			if (n.getChildCount() > 0 && !(n.getChild(0) instanceof VarDeclarationNode))
			{
				enumReturn += n.getChild(0).getText();
			}
			return enumReturn;
		} 
	    else if (n instanceof BlockScopeNode) 
	    {
			return "Block";
		} 
	    else if (n instanceof EnumNode) 
	    {
			return "Enum "+ n.getText();
		} 
	    else /*if (n instanceof AssignOperationNode) {
			AssignOperationNode stmt = (AssignOperationNode) n;
			return stmt.getText() + "=";//;+ stmt.getText() ??????????
		} else*/ if (n instanceof ClassNode) {
			return ((ClassNode) n).getClassName();
		} 
		else if (n instanceof FunctionNode) 
		{
			FunctionNode hdr = (FunctionNode) n;
			return hdr.getFullNameWithParameters();
		} 
		else if (n instanceof VarDeclarationNode) 
		{
			VarDeclarationNode varDeclaration = (VarDeclarationNode) n;
			return varDeclaration.getNameWithType();
		}
		else if (n instanceof VarUsageNode)
		{
		    VarUsageNode node = (VarUsageNode)n;
		    return node.getText() + ": " + node.getHaxeType().getShortTypeName();
		}
		
		return "<??unknown??>" + n.getText();
	}
}
