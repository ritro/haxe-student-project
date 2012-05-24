package tree.utils;

import java.util.List;

import tree.ErrorNode;
import tree.Function;
import tree.HaxeTree;
import tree.Module;
import tree.expression.Array;
import tree.expression.Assignment;
import tree.expression.Binary;
import tree.expression.Constant;
import tree.expression.Declaration;
import tree.expression.MethodCall;
import tree.expression.NewNode;
import tree.expression.Slice;
import tree.expression.Unary;
import tree.expression.Usage;
import tree.statement.BlockScope;
import tree.statement.For;
import tree.statement.IfNode;
import tree.statement.Return;
import tree.statement.While;
import tree.type.ClassNode;


/**
 * Can print Haxe Trees and Variable Tables to console, to
 * make easier to debug.
 * @author Savenko Maria
 */
public class Printer extends AbstractHaxeTreeVisitor
{
    /**
     * Prints HaxeTree to console along with printing all
     * subtrees.
     * @param t - main root of tree.
     */
    @Override
    public void visit(final HaxeTree t)
    {
        visit(t, 0);
    }
    
    private String getIndent(Object data) 
    {
        int capacity = (int)data;
        StringBuffer sb = new StringBuffer(capacity);
        for (int i = 0; i < capacity; i++) {
            sb = sb.append("   ");
        }
        
        return sb.toString();
    }
    
    public void printArray(List<HaxeTree> array)
    {
        if (array == null || array.isEmpty())
        {
            return;
        }
        HaxeTree[] list = array.toArray(new HaxeTree[0]);
        for (HaxeTree child : list)
        {
            visit(child);
        }
    }

    @Override
    protected void visit(Module node, Object data)
    {
        if (data == null)
        {
            data = 0;
        }
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final ClassNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final Function node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(final Declaration node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        HaxeTree init = node.getInitializationNode();
        if ( init != null)
        {
            visit(init, (int)data + 1);
        }
    }

    @Override
    protected void visit(final NewNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("NEW ");
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(final MethodCall node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(final Slice node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(final Usage node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(final Assignment node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());     
        visitAllChildren(node, (int)data + 1);   
    }

    @Override
    protected void visit(final Array node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("Array ");
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(final Constant node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(final Return node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(final Binary node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, (int)data + 1);
    }
    
    protected void visit(final Unary node, Object data)
    {
        System.out.print(getIndent(data)); 
        System.out.println(node.toString());     
        visitAllChildren(node, (int)data + 1);   
    }

    @Override
    protected void visit(BlockScope node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("BlockScope");
        if (node == null)
        {
            System.out.println("{empty}");
        }
        else
        {
            visitAllChildren(node, (int)data + 1);
        }
    }

    @Override
    protected void visit(ErrorNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("ErrorNode");
    }

    @Override
    protected void visit(IfNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("IF ");
        visit(node.getCondition(), (int)data + 1);
        System.out.print(getIndent(data));
        System.out.println("THEN ");
        visit(node.getIfBlock(), (int)data + 1);
        if (node.getElseBlock() != null)
        {
            System.out.print("ELSE ");
            visit(node.getElseBlock(), data);
        }
    }

    @Override
    protected void visit(For node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("FOR ");
        visit(node.getLocalVariable(), (int)data + 1);
        System.out.print(getIndent(data));
        System.out.println("IN ");
        visit(node.getIterator(), (int)data + 1);
        visit(node.getScope(), (int)data + 1);
    }

    @Override
    protected void visit(While node, Object data)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void visitUnknown(HaxeTree node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.getText());
        visitAllChildren(node, (int)data + 1);
    }
}
