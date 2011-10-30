package haxe.imp.parser.antlr.tree;

import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.vartable.BinaryExpression;
import haxe.imp.parser.antlr.tree.specific.vartable.ClassDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.tree.specific.vartable.FunctionDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.VarUse;

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
     * Prints variable table to console along with all inner tables.
     * @param table - variable table to print.
     */
    public static void printTable(final DeclaredVarsTable table)
    {
        printTable(table, 0);
    }
    
    private static void printTable(final DeclaredVarsTable table, final int indent)
    {
        if (table == null)
        {
            return;
        }
        
        StringBuffer sb = new StringBuffer(indent);
        for (int i = 0; i < indent; i++) {
            sb = sb.append("   ");
        }
        
        for (VarDeclaration declaration : table.getDeclaredVars())
        {
            System.out.print(sb.toString());
            if (declaration instanceof VarUse)
            {
                printTree((VarUse)declaration);
            }
            else if (declaration instanceof FunctionDeclaration)
            {
                printTree((FunctionDeclaration)declaration);
            }
            else if (declaration instanceof ClassDeclaration)
            {
                printTree((ClassDeclaration)declaration);
                
                DeclaredVarsTable table2 = declaration.getDeclaredVars();
                printTable(table2, indent + 1);
            }
            else if (declaration instanceof BinaryExpression)
            {
                printTree((BinaryExpression)declaration);
            }
            else
            {
                printTree((VarDeclaration)declaration);
            }
        }
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
        
        printTable(t.getDeclaredVars(),indent);
        
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
                +"{"+node.getHaxeType().getTypeName()+'}');
    }

    private static void printTree(final ReturnNode node){
        System.out.println("Return"+ "{"+node.getHaxeType().getTypeName()+'}');
    }
    
    private static void printTree(final VarUsageNode node)
    {
        if (node.isAuxiliary())
            System.out.println("VarUseDOT");
        else
            System.out.println("VarUsage"+ "(name=" +node.getText()+")" +
                "{"+node.getHaxeType().getTypeName()+'}');
    }

    private static void printTree(final VarDeclaration node)
    {
        System.out.println("DeclNode: " + node.getText() + ", type: "
                + node.getHaxeType().getTypeName() +
                ", Num: " + node.getVarNumber());
    }
    
    private static void printTree(final VarUse node)
    {
        VarDeclaration assignment = node.getAssignExpr();
        if (assignment == null)
        {
            System.out.println("UseNode: " + node.getText() + ", type: "
                    + node.getHaxeType().getTypeName() 
                    + ", Num: " + node.getVarNumber());
            return;
        }
        
        System.out.println("Assignment");
        System.out.println("      Name: " + node.getText() + ", type: "
                + node.getHaxeType().getTypeName() 
                + ", Num: " + node.getVarNumber());
        System.out.print("      ");
        printTree(assignment);
    }
    
    private static void printTree(final FunctionDeclaration node)
    {
        System.out.print("FunDecl " + node.getText() + 
                ", type: "+ node.getHaxeType().getTypeName() + 
                ", Num: " + node.getVarNumber());
        
        VarDeclaration returnNode = node.getReturnNode();
        if (returnNode == null)
        {
            System.out.println();
            return;
        }
        System.out.print(" return: ");
        printTree(returnNode);
    }

    private static void printTree(final ClassDeclaration node)
    {
        System.out.println("ClassDecl Name: " + node.getText() +  
                ", Num: " + node.getVarNumber());
    }    

    private static void printTree(final BinaryExpression node)
    {
        printTree(node.getLeftOperand());
        System.out.println(" " + node.getOperatorType().toString());
        printTree(node.getRightOperand());
    }
}
