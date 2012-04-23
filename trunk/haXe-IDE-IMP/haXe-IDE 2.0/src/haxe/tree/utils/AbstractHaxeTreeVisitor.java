package haxe.tree.utils;

import imp.parser.antlr.main.HaxeParser;
import imp.parser.antlr.tree.HaxeTree;
import imp.parser.antlr.tree.specific.ArrayNode;
import imp.parser.antlr.tree.specific.AssignOperationNode;
import imp.parser.antlr.tree.specific.BinaryExpressionNode;
import imp.parser.antlr.tree.specific.BlockScopeNode;
import imp.parser.antlr.tree.specific.ClassNode;
import imp.parser.antlr.tree.specific.ConstantNode;
import imp.parser.antlr.tree.specific.ErrorNode;
import imp.parser.antlr.tree.specific.ForNode;
import imp.parser.antlr.tree.specific.FunctionNode;
import imp.parser.antlr.tree.specific.IfNode;
import imp.parser.antlr.tree.specific.MethodCallNode;
import imp.parser.antlr.tree.specific.NewNode;
import imp.parser.antlr.tree.specific.ReturnNode;
import imp.parser.antlr.tree.specific.SliceNode;
import imp.parser.antlr.tree.specific.UnarExpressionNode;
import imp.parser.antlr.tree.specific.VarDeclarationNode;
import imp.parser.antlr.tree.specific.VarUsageNode;
import imp.parser.antlr.tree.specific.WhileNode;

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
       else if (t instanceof ArrayNode)
       {
           visit((ArrayNode)t, data);
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
       else if (t instanceof ForNode)
       {
           visit((ForNode)t, data);
       }
       else if (t instanceof WhileNode)
       {
           visit((WhileNode)t, data);
       }
       else if (t instanceof ReturnNode)
       {
           visit((ReturnNode)t, data);
       }       
       else if (t instanceof VarDeclarationNode)
       {
           visit((VarDeclarationNode)t, data);
       }
       else if (t instanceof NewNode)
       {
           visit((NewNode)t, data);
       }
       else if (t instanceof MethodCallNode)
       {
           visit((MethodCallNode)t, data);
       }
       else if (t instanceof SliceNode)
       {
           visit((SliceNode)t, data);
       }
       else if (t instanceof VarUsageNode)
       {
           visit((VarUsageNode)t, data);
       }
       else if (t instanceof UnarExpressionNode)
       {
           visit((UnarExpressionNode)t, data);
       }
       else
       {
           visitUnknown(t, data);
       }
   }
   
   public void visitAllChildren(final HaxeTree t, Object data)
   {
       if (t == null)
       {
           return;
       }
       for (HaxeTree child : t.getChildren()) 
       {
           visit(child, data);
       }
   }
   
   protected abstract void visitHighLevel(final HaxeTree node, Object data);
   protected abstract void visit(final ClassNode node, Object data);
   protected abstract void visit(final FunctionNode node, Object data);
   protected abstract void visit(final VarDeclarationNode node, Object data);
   protected abstract void visit(final NewNode node, Object data);
   protected abstract void visit(final MethodCallNode node, Object data);
   protected abstract void visit(final SliceNode node, Object data);
   protected abstract void visit(final VarUsageNode node, Object data);
   protected abstract void visit(final AssignOperationNode node, Object data);
   protected abstract void visit(final ArrayNode node, Object data);
   protected abstract void visit(final ConstantNode node, Object data);
   protected abstract void visit(final ReturnNode node, Object data);
   protected abstract void visit(final BinaryExpressionNode node, Object data);
   protected abstract void visit(final UnarExpressionNode node, Object data);
   protected abstract void visit(final BlockScopeNode node, Object data);
   protected abstract void visit(final ErrorNode node, Object data);
   protected abstract void visit(final IfNode node, Object data);
   protected abstract void visit(final ForNode node, Object data);
   protected abstract void visit(final WhileNode node, Object data);
   
   protected abstract void visitUnknown(final HaxeTree node, Object data);
}
