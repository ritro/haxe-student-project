package tree.utils;

import java.util.List;

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
import tree.specific.NewNode;
import tree.specific.Return;
import tree.specific.SliceNode;
import tree.specific.UnarExpression;
import tree.specific.Declaration;
import tree.specific.Usage;
import tree.specific.While;
import tree.specific.type.ClassNode;


/**
 * Can print Haxe Trees and Variable Tables to console, to
 * make easier to debug.
 * @author Savenko Maria
 */
public class HaxeTreePrinter extends AbstractHaxeTreeVisitor
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
    protected void visitHighLevel(HaxeTree node, Object data)
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
    protected void visit(final SliceNode node, Object data)
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
    protected void visit(final ArrayNode node, Object data)
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
    protected void visit(final BinaryExpression node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println(node.toString());
        visitAllChildren(node, (int)data + 1);
    }
    
    protected void visit(final UnarExpression node, Object data)
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