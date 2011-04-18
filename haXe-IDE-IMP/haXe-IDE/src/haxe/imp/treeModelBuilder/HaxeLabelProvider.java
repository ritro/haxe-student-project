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
package haxe.imp.treeModelBuilder;

import haxe.imp.parser.antlr.main.HaxeLexer;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.ScopeFunDeclNode;
import haxe.imp.parser.antlr.tree.specific.ScopeVarDeclNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;
import haxe_ide.Activator;
import haxe_ide.IHaxeResources;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.imp.editor.ModelTreeNode;
import org.eclipse.imp.services.ILabelProvider;
import org.eclipse.imp.utils.MarkerUtils;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

// TODO: Auto-generated Javadoc
/**
 * The Class HaxeLabelProvider.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeLabelProvider implements ILabelProvider {

	/** The listeners. */
	private final Set<ILabelProviderListener> fListeners = new HashSet<ILabelProviderListener>();

	/** The s image registry. */
	private static ImageRegistry sImageRegistry = Activator.getInstance()
			.getImageRegistry();

	/** The DEFAUL t_ image. */
	private static Image DEFAULT_IMAGE = sImageRegistry
			.get(IHaxeResources.HAXE_DEFAULT_IMAGE);

	/** The FIL e_ image. */
	private static Image FILE_IMAGE = sImageRegistry
			.get(IHaxeResources.HAXE_FILE);

	/** The FIL e_ wit h_ warnin g_ image. */
	private static Image FILE_WITH_WARNING_IMAGE = sImageRegistry
			.get(IHaxeResources.HAXE_FILE_WARNING);

	/** The FIL e_ wit h_ erro r_ image. */
	private static Image FILE_WITH_ERROR_IMAGE = sImageRegistry
			.get(IHaxeResources.HAXE_FILE_ERROR);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(final Object element) {
		if (element instanceof IFile) {
			// TODO: rewrite to provide more appropriate images
			IFile file = (IFile) element;
			int sev = MarkerUtils.getMaxProblemMarkerSeverity(file,
					IResource.DEPTH_ONE);

			switch (sev) {
			case IMarker.SEVERITY_ERROR:
				return FILE_WITH_ERROR_IMAGE;
			case IMarker.SEVERITY_WARNING:
				return FILE_WITH_WARNING_IMAGE;
			default:
				return FILE_IMAGE;
			}
		}
		HaxeTree n = (element instanceof ModelTreeNode) ? (HaxeTree) ((ModelTreeNode) element)
				.getASTNode()
				: (HaxeTree) element;
		return getImageFor(n);
	}

	/**
	 * Gets the image for.
	 * 
	 * @param n
	 *            the n
	 * @return the image for
	 */
	public static Image getImageFor(final HaxeTree n) {
		return DEFAULT_IMAGE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(final Object element) {
		HaxeTree n = (element instanceof ModelTreeNode) ? (HaxeTree) ((ModelTreeNode) element)
				.getASTNode()
				: (HaxeTree) element;

		return getLabelFor(n);
	}

	/**
	 * Generating label for outline tree in correspond to passed node.
	 * 
	 * @param n
	 *            passed node
	 * @return the label for node in outline tree
	 */
	public static String getLabelFor(final HaxeTree n) {
		// START_HERE
		if (n.token.getType() == HaxeLexer.MODULE) {
			return "Module";
		} else if (n.token.getType() == HaxeLexer.ENUM) {
			String enumReturn = "Enum ";
			if (n.getChildCount() > 0) {
				if (!(n.getChild(0) instanceof VarDeclaration)) {
					enumReturn += n.getChild(0).getText();
				}
			}
			return enumReturn;
		} else if (n instanceof BlockScopeNode) {
			return "Block";
		} else if (n instanceof EnumNode) {
			return "Enum "+ n.getText();
		} else /*if (n instanceof AssignOperationNode) {
			AssignOperationNode stmt = (AssignOperationNode) n;
			return stmt.getText() + "=";//;+ stmt.getText() ??????????
		} else*/ if (n instanceof ClassNode) {
			return "Class " + ((ClassNode) n).getClassName();
		} else /*if (n instanceof FunctionNode) {
			FunctionNode hdr = (FunctionNode) n;
			return hdr.getFullNameWithParameters();
		} else if (n instanceof VarDeclaration) {
			VarDeclaration varDeclaration = (VarDeclaration) n;
			return varDeclaration.getNameWithType();
		}else*/ if (n instanceof ScopeFunDeclNode) {
			return ((ScopeFunDeclNode)n).getNameWithType();
		} else if (n instanceof ScopeVarDeclNode) {
			return ((ScopeVarDeclNode)n).getNameWithType();
		}
		return "<??no label yet??>";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.
	 * jface.viewers.ILabelProviderListener)
	 */
	public void addListener(final ILabelProviderListener listener) {
		this.fListeners.add(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	public void dispose() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang
	 * .Object, java.lang.String)
	 */
	public boolean isLabelProperty(final Object element, final String property) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse
	 * .jface.viewers.ILabelProviderListener)
	 */
	public void removeListener(final ILabelProviderListener listener) {
		this.fListeners.remove(listener);
	}
}
