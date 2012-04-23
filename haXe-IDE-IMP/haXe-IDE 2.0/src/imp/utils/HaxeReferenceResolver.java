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
import tree.specific.AssignOperationNode;
import tree.specific.BinaryExpressionNode;
import tree.specific.BlockScopeNode;
import tree.specific.ClassNode;
import tree.specific.ConstantNode;
import tree.specific.ErrorNode;
import tree.specific.ForNode;
import tree.specific.FunctionNode;
import tree.specific.IfNode;
import tree.specific.MethodCallNode;
import tree.specific.ReturnNode;
import tree.specific.SliceNode;
import tree.specific.VarDeclarationNode;
import tree.specific.VarUsageNode;
import tree.specific.WhileNode;

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

	    if (node instanceof MethodCallNode)
        {
	        return visit((MethodCallNode)node);
        }
	    else if (node instanceof SliceNode)
	    {
	        return visit((SliceNode)node);
	    }
	    else if (node instanceof VarUsageNode)
	    {
	        return visit((VarUsageNode)node);
	    }
	    
		return null;
	}
	
   private Object visit(final MethodCallNode node)
   {
       return node.getDeclarationNode();
   }
   
   private Object visit(final SliceNode node)
   {
       return node.getDeclarationNode();
   }
   
   private Object visit(final VarUsageNode node)
   {
       return node.getDeclarationNode();
   }
}
