package haxe.tree.utils;

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;

public abstract class AbstractHaxeTreeVisitor
{
    public void visit(final HaxeTree t)
    {
        visit(t, null);
    }

   public void visit(final HaxeTree t, Object data) 
   {
       if (t == null) 
       {
           return;
       }

       if (t.getText().equals("MODULE"))
       {
           visitHighLevel(t, data);
       }
       else if (t instanceof AssignOperationNode)
       {
           visit((AssignOperationNode)t, data);
       }
       else if (t instanceof BinaryExpressionNode)
       {
           visit((BinaryExpressionNode)t, data);
       }
       else if (t instanceof BlockScopeNode)
       {
           visit((BlockScopeNode)t, data);
       }
       else if (t instanceof ClassNode)
       {
           visit((ClassNode)t, data);
       }
       else if (t instanceof ConstantNode)
       {
           visit((ConstantNode)t, data);
       }
       else if (t instanceof ErrorNode)
       {
           visit((ErrorNode)t, data);
       }
       else if (t instanceof FunctionNode)
       {
           visit((FunctionNode)t, data);
       }
       else if (t instanceof IfNode)
       {
           visit((IfNode)t, data);
       }
       else if (t instanceof ReturnNode)
       {
           visit((ReturnNode)t, data);
       }       
       else if (t instanceof VarDeclarationNode)
       {
           visit((VarDeclarationNode)t, data);
       }
       else if (t instanceof VarUsageNode)
       {
           visit((VarUsageNode)t, data);
       }
       else if (t.getType() == HaxeParser.RBRACE)
       {
           //right braces were added separately as IMP
           //wasn't counting them as meaningful chars
       } 
       else
       {
           visitUnknown(t, data);
       }
   }
   
   public void visitAllChildren(final HaxeTree t, Object data)
   {
       for (HaxeTree child : t.getChildren()) 
       {
           visit(child, data);
       }
   }
   
   protected abstract void visitHighLevel(final HaxeTree node, Object data);
   protected abstract void visit(final ClassNode node, Object data);
   protected abstract void visit(final FunctionNode node, Object data);
   protected abstract void visit(final VarDeclarationNode node, Object data);
   protected abstract void visit(final VarUsageNode node, Object data);
   protected abstract void visit(final AssignOperationNode node, Object data);
   protected abstract void visit(final ConstantNode node, Object data);
   protected abstract void visit(final ReturnNode node, Object data);
   protected abstract void visit(final BinaryExpressionNode node, Object data);
   protected abstract void visit(final BlockScopeNode node, Object data);
   protected abstract void visit(final ErrorNode node, Object data);
   protected abstract void visit(final IfNode node, Object data);
   
   protected abstract void visitUnknown(final HaxeTree node, Object data);
}
