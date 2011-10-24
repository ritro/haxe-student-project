package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.vartable.BinaryExpression.OperatorClasses;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration.VarType;

import java.util.ArrayList;

public class VarDeclarationFactory
{
    
    /**
     * Creates declaration usable for Var Declaration Table 
     * for Function from it's tree node.
     * @param Function Node from tree.
     * @return Ready to operate with Function Declaration.
     */
    public FunctionDeclaration createFunctionDeclaration(FunctionNode node)
    {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration(node.getChild(0).getToken(), 0);
        functionDeclaration.setHaxeType(node.getHaxeType());
        if (node.getReturnNode() != null)
        {
            /*
            HaxeTree returnN =  ((FunctionNode)tree).getReturnNode();
            VarUse vun = new VarUse(returnN, returnN.getToken(), 
                    this.getToken());
            vun.setHaxeType(returnN.getHaxeType());
            sfd.setReturnNode(vun);*///FIXME
        }
        return functionDeclaration;
    }
    
    /**
     * Creates declaration usable for Var Declaration Table
     * for Var node from it's tree node. It created only declaration
     * of var and no info about it's value assignments during declaration.
     * @param Var node.
     * @return Ready to operate with Var Declaration.
     */
    public VarDeclaration createVarDeclaration(
            VarDeclarationNode node, boolean ifParentClass)
    {
        VarDeclaration varDeclaration = new VarDeclaration(node,0);
        varDeclaration.setHaxeType(node.getHaxeType());
        
        if (ifParentClass)
            varDeclaration.setVarType(VarType.ClassVarDeclaration);
        //else if (this.ifParentIsFunction())
        //  varDeclaration.setVarType(VarType.FunctionDeclaration);
            
        return varDeclaration;
    }
    
    /**
     * Creates declaration of assignment for Var node from it's tree 
     * node info and previously created declaration for this var.
     * This declaration can be used in Var Declaration Table as normal
     * Var Use.
     * @param Vars node.
     * @param Previously created varDeclaration for that var.
     * @return Ready to operate with Var Usage or if where was
     * no usage it returns Null.
     */
    public VarUse createVarUse(VarDeclarationNode node, VarDeclaration varDeclaration)
    {
        HaxeTree init = node.getVAR_INIT_NODE();
        VarUse varUse = null;
        if (init != null &&
            !init.ifUndefinedType() &&//primary
            varDeclaration.getHaxeType().getClassHierarchy().contains(init.getHaxeType()))//Undef too
            varDeclaration.setHaxeType(init.getHaxeType());
        else if (init != null)
        {
            varUse = createVarUse(node.getChild(0));
            //varUse.token = varDeclaration.getToken();
            varUse.setHaxeType(varDeclaration.getHaxeType());
            varUse.setAssignExpr(createExpression(init));
            //varUse.getAssignExpr().setHaxeType(init.getHaxeType());
        }
        
        return varUse;
    }
    
    /**
     * Creates declaration for assigning var a new value.
     * @param assignOperation
     * @return Ready to operate with Var Usage.
     */
    public VarUse createVarUse(AssignOperationNode assignOperation)
    {
        //left always should be VarUsageNode
        VarUse varBeforeEquation = createVarUse(assignOperation.getLeftOperand());
        //right may be expr as well
        VarDeclaration varAfterEquation = createExpression(assignOperation.getRightOperand());
        varBeforeEquation.setAssignExpr(varAfterEquation);
        return varBeforeEquation;
    }
    
    public VarUse createVarUse (VarUsageNode node)
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
    
    public VarUse createVarUse (ConstantNode node)
    {
        ArrayList<HaxeTree> name = new ArrayList<HaxeTree>();
        name.add(node);
        return new VarUse(name, node.getToken());
    }
    
    public VarUse createVarUse (HaxeTree node)
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
    
    public VarDeclaration createExpression(HaxeTree node)
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
