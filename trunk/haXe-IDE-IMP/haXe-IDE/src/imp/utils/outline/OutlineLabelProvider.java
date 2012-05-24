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

import org.eclipse.imp.editor.ModelTreeNode;

import tree.HaxeTree;
import tree.expression.Declaration;
import tree.expression.Usage;

/**
 * This class allows to get images for such workspace elements as
 * files (in normal, error and others conditions), different view items
 * and labels for them.
 * 
 * @author Anatoly Kondratyev
 * @author Savenko Maria
 */
public class OutlineLabelProvider extends AbstractLabelProvider
{
	public String getText(final Object element) 
	{
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
	    String label = AbstractLabelProvider.getLabelForTreeNode(n);
		
	    if (n instanceof Usage || n instanceof Declaration)
		{
		    // method calls and slices here too
		    String type = n.getHaxeType() != null 
		            ? n.getHaxeType().getShortTypeName()
                    : "null";
		    return label + ": " + type;
		}
		
		return label;
	}
}
