package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.vartable.BinaryExpression.OperatorClasses;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration.VarType;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;

public class VarDeclarationFactory
{
    
    /**
     * Creates declaration usable for Var Declaration Table 
     * for Function from it's tree node.
     * @param Function Node from tree.
     * @return Ready to operate with Function Declaration.
     */
    public static FunctionDeclaration createFunctionDeclaration(FunctionNode node)
    {
        CommonToken functionToken = node.getChild(0).getToken();
        FunctionDeclaration functionDeclaration = new FunctionDeclaration(functionToken);
        functionDeclaration.setHaxeType(node.getHaxeType());
        if (node.getReturnNode() != null)
        {
            /*
            HaxeTree returnN =  node.getReturnNode();
            VarUse vun = new VarUse(returnN, returnN.getToken(), 
                    this.getToken());
            vun.setHaxeType(returnN.getHaxeType());
            sfd.setReturnNode(vun);*///FIXME
        }
        return functionDeclaration;
    }
    
    /**
     * Creates declaration usable for Var Declaration Table
     * for Function Var node from it's tree node. It creates only declaration
     * of var and no info about it's value assignments during declaration.
     * @param Var node.
     * @return Ready to operate with Function Var Declaration.
     */
    public static VarDeclaration createFunctionVarDeclaration(
            VarDeclarationNode node)
    {
        VarDeclaration varDeclaration = new VarDeclaration(node);
        varDeclaration.setHaxeType(node.getHaxeType());
            
        return varDeclaration;
    }
    
    /**
     * Creates declaration usable for Var Declaration Table
     * for Class Var node from it's tree node. It creates only declaration
     * of var and no info about it's value assignments during declaration.
     * @param Var node.
     * @return Ready to operate with Class Var Declaration.
     */
    public static VarDeclaration createClassVarDeclaration(VarDeclarationNode node)
    {
        VarDeclaration declaration = createFunctionVarDeclaration(node);
        
        declaration.setVarType(VarType.ClassVarDeclaration);
        
        return declaration;
    }
    
    /**
     * Creates declaration of assignment just declared var a value.
     * @param Vars node.
     * @return Ready to operate with Var Usage or if where was
     * no usage it returns Null.
     */
    public static VarUse createVarUse(VarDeclarationNode node)
    {
        HaxeTree init = node.getVAR_INIT_NODE();
        
        if (init == null)
        {
            return null;
        }

        VarUse varUse = createVarUse(node.getChild(0));
        HaxeType definedType = node.getHaxeType();
        //varUse.token = varDeclaration.getToken();
        varUse.setHaxeType(definedType);
        varUse.setAssignExpr(createExpression(init));
        //varUse.getAssignExpr().setHaxeType(init.getHaxeType());
        
        return varUse;
    }
    
    /**
     * Creates declaration for assigning var a new value.
     * @param assignOperation
     * @return Ready to operate with Var Usage.
     */
    public static VarUse createVarUse(AssignOperationNode assignOperation)
    {
        //left always should be VarUsageNode
        VarUse varBeforeEquation = createVarUse(assignOperation.getLeftOperand());
        //right may be expr as well
        VarDeclaration varAfterEquation = createExpression(assignOperation.getRightOperand());
        varBeforeEquation.setAssignExpr(varAfterEquation);
        return varBeforeEquation;
    }
    
    private static VarUse createVarUse (VarUsageNode node)
    {
        VarUse varUse;
        ArrayList<HaxeTree> name = new ArrayList<HaxeTree>();
        if (node.childIndex == 0)
        {
            name.add(node);
        }
        else
        {
            name = node.getAllChildren();
        }
        varUse = new VarUse(name,node.getToken());
        varUse.setHaxeType(node.getHaxeType());
        return varUse;
    }
    
    /**
     * Creates usage of constant.
     * @param node
     * @return
     */
    private static VarUse createVarUse (ConstantNode node)
    {
        ArrayList<HaxeTree> name = new ArrayList<HaxeTree>();
        name.add(node);
        VarUse varUse = new VarUse(name, node.getToken());
        varUse.setHaxeType(node.getHaxeType());
        return varUse;
    }
    
    /**
     * Creates VarUse records for var table from 
     * Var Usages nodes and Constant nodes.
     * @param node
     * @return
     */
    public static VarUse createVarUse (HaxeTree node)
    {
        if (node instanceof VarUsageNode)
        {
            return createVarUse((VarUsageNode)node);
        }
        if (node instanceof ConstantNode)
        {
            return createVarUse((ConstantNode)node);
        }
        //if (suffix expr)
        return null;
    }
    
    public static VarDeclaration createExpression(HaxeTree node)
    {
        VarUse varUse = createVarUse(node);
        if (varUse != null)
        {
            return varUse;
        }
        //FIXME: check for binary or make that node in antlr 
        if (node.getText().equals("+") ||
                node.getText().equals("-") ||
                node.getText().equals("/") ||
                node.getText().equals("*"))
        {
            VarDeclaration leftOp = createExpression(node.getChild(0));
            VarDeclaration rightOp = createExpression(node.getChild(1));
            //operator classes choose FIXME
            return new BinaryExpression(leftOp, rightOp, 
                    OperatorClasses.StringNumeric, node.getToken());
        }
        
        return null;
    }
}
