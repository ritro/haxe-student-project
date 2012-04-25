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

import imp.parser.antlr.HaxeParser;

import org.eclipse.imp.preferences.PreferenceValueParser.AbstractVisitor;
import org.eclipse.imp.services.base.TreeModelBuilderBase;

import tree.HaxeTree;
import tree.specific.BlockScopeNode;
import tree.specific.FunctionNode;
import tree.specific.DeclarationNode;
import tree.specific.type.ClassNode;
import tree.specific.type.EnumNode;

/**
 * The Class HaxeTreeModelBuilder.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeTreeModelBuilder extends TreeModelBuilderBase {

    private HaxeModelVisitor visitor = null;
    
	@Override
	public void visitTree(final Object root) {
		if (root == null) {
			return;
		}
		HaxeTree rootNode = (HaxeTree) root;
		visitor = new HaxeModelVisitor();

		accept(rootNode);
	}
	
	private void accept(HaxeTree node)
    {
        try {
            if (node instanceof FunctionNode) 
            {
                accept((FunctionNode)node);
            } 
            else if (node instanceof ClassNode) 
            {
                accept((ClassNode)node);
            } 
            else if (node instanceof DeclarationNode)
            {
                accept((DeclarationNode)node);
            } 
            else if (node instanceof EnumNode)
            {
                accept((EnumNode)node);
            }
            else if (node.token != null && node.token.getType() == HaxeParser.MODULE) 
            {
                for (HaxeTree child : node.getChildren()) 
                {
                    accept(child);
                }
            }
        } catch (NullPointerException nullPointerException) {
            System.out
                    .println("Exception caught from invocation of language-specific tree model builder implementation");
            nullPointerException.printStackTrace();
        }
    }
    
    private void accept(FunctionNode node)
    {
        visitor.visit(node);
        visitor.endVisit(node);
    }
    
    private void accept(ClassNode node)
    {
        visitor.visit(node);
        BlockScopeNode blockScope = node.getBlockScope();
        if (blockScope != null) 
        {
            for (HaxeTree child : blockScope.getChildren()) 
            {
                accept(child);
            }
        }
        visitor.endVisit(node);
    }   
    
    private void accept(EnumNode node)
    {
        visitor.visit(node);
        BlockScopeNode blockScope = node.getBlockScope();
        if (blockScope != null)
        {
            for (HaxeTree child : blockScope.getChildren()) 
            {
                accept(child);
            }
        }
        visitor.endVisit(node);
    }
    
    private void accept(DeclarationNode node)
    {
        visitor.visit(node);
        visitor.endVisit(node);
    }

	/**
	 * The Class HaxeModelVisitor.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public class HaxeModelVisitor extends AbstractVisitor {

		@Override
		public void unimplementedVisitor(final String s) {
			System.out.println("unemplementedVisitor \n" + s);
		}


		public boolean visit(final Object n) {
			//pushSubItem(n);//???why not this
			HaxeTreeModelBuilder.this.pushSubItem(n);
			return true;
		}

		public boolean visit(final HaxeTree node,
				final boolean doCreateSubItem) {
			if (doCreateSubItem) {
				HaxeTreeModelBuilder.this.createSubItem(node);
			} else {
				HaxeTreeModelBuilder.this.pushSubItem(node);
			}
			return true;
		}

		public void endVisit(final Object n) {
			//popSubItem();//???why not this
			HaxeTreeModelBuilder.this.popSubItem();
		}
	}
}
