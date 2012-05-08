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
package imp.utils.outline;

import imp.parser.antlr.HaxeLexer;

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

import tree.HaxeTree;
import tree.specific.BlockScope;
import tree.specific.Function;
import tree.specific.Declaration;
import tree.specific.Usage;
import tree.specific.type.ClassNode;
import tree.specific.type.EnumNode;
import workspace.Activator;
import workspace.HaxeElementImageProvider;
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
		return HaxeElementImageProvider.getImageForTreeNode(n);
	}

	public String getText(final Object element) {
		HaxeTree n = (element instanceof ModelTreeNode) ? (HaxeTree) ((ModelTreeNode) element)
				.getASTNode()
				: (HaxeTree) element;

		return getLabelForHaxeTreeNode(n);
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
			if (n.getChildCount() > 0 && !(n.getChild(0) instanceof Declaration))
			{
				enumReturn += n.getChild(0).getText();
			}
			return enumReturn;
		} 
	    else if (n instanceof BlockScope) 
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
		else if (n instanceof Function) 
		{
			Function hdr = (Function) n;
			return hdr.getFullNameWithParameters();
		} 
		else if (n instanceof Declaration) 
		{
			Declaration varDeclaration = (Declaration) n;
			return varDeclaration.getNameWithType();
		}
		else if (n instanceof Usage)
		{
		    // method calls and slices here too
		    String type = n.getHaxeType() != null 
		            ? n.getHaxeType().getShortTypeName()
                    : "null";
		    return n.getText() + ": " + type;
		}
		
		return "<??unknown??>" + n.getText();
	}
}
