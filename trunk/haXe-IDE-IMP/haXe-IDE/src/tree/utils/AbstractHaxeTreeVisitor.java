package tree.utils;

import tree.HaxeTree;
import tree.expression.ArrayNode;
import tree.expression.Assignment;
import tree.expression.BinaryExpression;
import tree.expression.Constant;
import tree.expression.Declaration;
import tree.expression.MethodCall;
import tree.expression.NewNode;
import tree.expression.SliceNode;
import tree.expression.UnarExpression;
import tree.expression.Usage;
import tree.specific.ErrorNode;
import tree.specific.Function;
import tree.specific.Module;
import tree.specific.type.ClassNode;
import tree.statement.BlockScope;
import tree.statement.For;
import tree.statement.IfNode;
import tree.statement.Return;
import tree.statement.While;

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

       if (t instanceof Module)
       {
           visit((Module)t, data);
       }
       else if (t instanceof Assignment)
       {
           visit((Assignment)t, data);
       }
       else if (t instanceof BinaryExpression)
       {
           visit((BinaryExpression)t, data);
       }
       else if (t instanceof BlockScope)
       {
           visit((BlockScope)t, data);
       }
       else if (t instanceof ClassNode)
       {
           visit((ClassNode)t, data);
       }
       else if (t instanceof ArrayNode)
       {
           visit((ArrayNode)t, data);
       }
       else if (t instanceof Constant)
       {
           visit((Constant)t, data);
       }
       else if (t instanceof ErrorNode)
       {
           visit((ErrorNode)t, data);
       }
       else if (t instanceof Function)
       {
           visit((Function)t, data);
       }
       else if (t instanceof IfNode)
       {
           visit((IfNode)t, data);
       }
       else if (t instanceof For)
       {
           visit((For)t, data);
       }
       else if (t instanceof While)
       {
           visit((While)t, data);
       }
       else if (t instanceof Return)
       {
           visit((Return)t, data);
       }       
       else if (t instanceof Declaration)
       {
           visit((Declaration)t, data);
       }
       else if (t instanceof NewNode)
       {
           visit((NewNode)t, data);
       }
       else if (t instanceof MethodCall)
       {
           visit((MethodCall)t, data);
       }
       else if (t instanceof SliceNode)
       {
           visit((SliceNode)t, data);
       }
       else if (t instanceof Usage)
       {
           visit((Usage)t, data);
       }
       else if (t instanceof UnarExpression)
       {
           visit((UnarExpression)t, data);
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
   
   protected abstract void visit(final Module node, Object data);
   protected abstract void visit(final ClassNode node, Object data);
   protected abstract void visit(final Function node, Object data);
   protected abstract void visit(final Declaration node, Object data);
   protected abstract void visit(final NewNode node, Object data);
   protected abstract void visit(final MethodCall node, Object data);
   protected abstract void visit(final SliceNode node, Object data);
   protected abstract void visit(final Usage node, Object data);
   protected abstract void visit(final Assignment node, Object data);
   protected abstract void visit(final ArrayNode node, Object data);
   protected abstract void visit(final Constant node, Object data);
   protected abstract void visit(final Return node, Object data);
   protected abstract void visit(final BinaryExpression node, Object data);
   protected abstract void visit(final UnarExpression node, Object data);
   protected abstract void visit(final BlockScope node, Object data);
   protected abstract void visit(final ErrorNode node, Object data);
   protected abstract void visit(final IfNode node, Object data);
   protected abstract void visit(final For node, Object data);
   protected abstract void visit(final While node, Object data);
   
   protected abstract void visitUnknown(final HaxeTree node, Object data);
}
