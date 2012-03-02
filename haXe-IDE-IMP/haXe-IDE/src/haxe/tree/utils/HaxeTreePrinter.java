package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.WhileNode;

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
    protected void visit(ClassNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("class "+ node.getText());
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(FunctionNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("function "+ node.getText());
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(VarDeclarationNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("Declaration " +
                "\"" + node.getText() + "\"" +
                " {" + node.getHaxeType().getShortTypeName() + '}');
    }

    @Override
    protected void visit(VarUsageNode node, Object data)
    {
        System.out.print(getIndent(data));
        if (node.isAuxiliary())
            System.out.println("VarUseDOT");
        else
        {
            HaxeTree decl = node.getDeclarationNode();
            if (decl == null)
            {
                decl = node;
            }
            System.out.println("VarUsage " +
                    "\"" + node.getText() + "\"" +
                    " {" + decl.getHaxeType().getShortTypeName() + '}');
        }
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(AssignOperationNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("AssignOperation " + 
                "{name=" + node.getText() + '}');     
        visitAllChildren(node, (int)data + 1);   
    }

    @Override
    protected void visit(ConstantNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("Constant " + 
                "(name=" + node.getText() + ")" +
                "{" + node.getHaxeType().getShortTypeName() + '}');
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(ReturnNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("Return " + 
                "{" + node.getHaxeType().getShortTypeName() + '}');
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(BinaryExpressionNode node, Object data)
    {
        System.out.print(getIndent(data));
        System.out.println("BinaryExpression " + 
                "(" + node.getText() + ")" +
                "{" + node.getHaxeType().getShortTypeName() + '}');
        visitAllChildren(node, (int)data + 1);
    }

    @Override
    protected void visit(BlockScopeNode node, Object data)
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
    protected void visit(ForNode node, Object data)
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
    protected void visit(WhileNode node, Object data)
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
