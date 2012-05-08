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
package imp.utils;


import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IReferenceResolver;

import tree.HaxeTree;
import tree.specific.ArrayNode;
import tree.specific.Assignment;
import tree.specific.BinaryExpression;
import tree.specific.BlockScope;
import tree.specific.Constant;
import tree.specific.ErrorNode;
import tree.specific.For;
import tree.specific.Function;
import tree.specific.IfNode;
import tree.specific.MethodCall;
import tree.specific.Return;
import tree.specific.SliceNode;
import tree.specific.Declaration;
import tree.specific.Usage;
import tree.specific.While;
import tree.specific.type.ClassNode;

/**
 * Class for resolving referances to other languages
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeReferenceResolver implements IReferenceResolver {

	public HaxeReferenceResolver() {
	}

	/**
	 * Get the text associated with the given node for use in a link from (or
	 * to) that node.
	 * 
	 * @param node
	 *            the node
	 * @return the link text
	 */
	public String getLinkText(final Object node) {
		if (((HaxeTree)node).getText()!=null)
			return ((HaxeTree)node).getText();

		return node.toString();
	}

	/**
	 * Get the target for the given source node in the AST produced by the given
	 * Parse Controller.
	 * 
	 * @param node
	 *            the node
	 * @param controller
	 *            the controller
	 * @return the link target
	 */
	public Object getLinkTarget(final Object node, final IParseController controller) {
		// START_HERE
		// TODO Replace the following with an implementation suitable for your
		// language and reference types

	    if (node instanceof MethodCall)
        {
	        return visit((MethodCall)node);
        }
	    else if (node instanceof SliceNode)
	    {
	        return visit((SliceNode)node);
	    }
	    else if (node instanceof Usage)
	    {
	        return visit((Usage)node);
	    }
	    
		return null;
	}
	
   private Object visit(final MethodCall node)
   {
       return node.getDeclarationNode();
   }
   
   private Object visit(final SliceNode node)
   {
       return node.getDeclarationNode();
   }
   
   private Object visit(final Usage node)
   {
       return node.getDeclarationNode();
   }
}