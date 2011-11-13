package haxe.imp.parser.antlr.tree;

import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;

/**
 * Can print Haxe Trees and Variable Tables to console, to
 * make easier to debug.
 * @author Savenko Maria
 */
public class HaxeTreePrinter
{
    /**
     * Prints HaxeTree to console along with printing all
     * subtrees.
     * @param t - main root of tree.
     */
    public static void printTree(final HaxeTree t)
    {
        printTree(t, 0);
    }
    
    /**
     * Prints some subtree to console with certain offset
     * from left border of console for that subtree.
     * @param t - subtree to print.
     * @param indent - offset from left border of console.
     */
    private static void printTree(final HaxeTree t, final int indent) 
    {
        if (t == null) 
        {
            return;
        }
        
        StringBuffer sb = new StringBuffer(indent);
        for (int i = 0; i < indent; i++) {
            sb = sb.append("   ");
        }
        for (HaxeTree child : t.getChildren()) 
        {
            System.out.print(sb.toString());
            if (child instanceof AssignOperationNode)
            {
                printTree((AssignOperationNode)child);
            }
            else if (child instanceof VarUsageNode)
            {
                printTree((VarUsageNode)child);
            }
            else if (child instanceof ConstantNode)
            {
                printTree((ConstantNode)child);
            }
            else if (child instanceof ReturnNode)
            {
                printTree((ReturnNode)child);
            } 
            else if (child instanceof BlockScopeNode)
            {
                System.out.println("Block scope "+ t.getText());
            } 
            else
            {
                System.out.println(child.getText());
            }
            printTree(child, indent + 1);
        }
    }
    
    private static void printTree(final AssignOperationNode node)
    {
        System.out.println("AssignOperation"+ "{name=" +node.getText()+'}');
    }

    private static void printTree(final ConstantNode node)
    {
        System.out.println("Const"+"(name="+node.getText() +")"
                +"{"+node.getHaxeType().getShortTypeName()+'}');
    }

    private static void printTree(final ReturnNode node){
        System.out.println("Return"+ "{"+node.getHaxeType().getShortTypeName()+'}');
    }
    
    private static void printTree(final VarUsageNode node)
    {
        if (node.isAuxiliary())
            System.out.println("VarUseDOT");
        else
            System.out.println("VarUsage"+ "(name=" +node.getText()+")" +
                "{"+node.getHaxeType().getShortTypeName()+'}');
    }
}
