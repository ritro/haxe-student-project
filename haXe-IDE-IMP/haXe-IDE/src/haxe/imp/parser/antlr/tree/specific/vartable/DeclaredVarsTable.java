package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration.VarType;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;

public class DeclaredVarsTable {

    private ArrayList<VarDeclaration> declaredVars = new ArrayList<VarDeclaration>();

    public ArrayList<VarDeclaration> getDeclaredVars() {
        return declaredVars;
    }

    public boolean ifVarExists(VarDeclaration var) {
        for (VarDeclaration tree : declaredVars) {
            if (tree.getToken().equals(var.getToken()))
                break; // looking for the previous vars with the same text
            if (tree instanceof FunctionDeclaration) {
                if (var.getText().equals(((FunctionDeclaration) tree).getText()) &&
                        // FIXME && parametres equals... ??
                    !var.getToken().equals(((FunctionDeclaration) tree).getToken()))
                    return true; // another var with the same name
            } else if (!(tree instanceof VarUse)) {
                if (var.getText().equals(tree.getText()) && 
                    var.getDeclType().equals(tree.getDeclType()) && // now just for param-decl override 
                    //&& parametres equals... && blockscope mark equals
                    !var.getToken().equals(tree.getToken()))
                    return true; // another var with the same name
            }
        }
        return false;
    }
    
    public void addWithIncrease(VarDeclaration element){
        if ((element.getDeclType() == VarType.FunctionParam 
                    || element.getDeclType() == VarType.FunctionVarDecl) 
                    && this.findVarNumber(element.getText()) != -1) 
            element.setVarNumber(this.findVarNumber(element.getText()) + element.getVarNumber() + 1);
        
        this.addToDeclaredVars(element);
    }
    
    public void addWithIncrease(VarUse element){
        if (this.findVarNumber(element.getText()) != -1)
            element.setVarNumber(this.findVarNumber(element.getText()));
        
        this.addToDeclaredVars(element);
    }
    
    public void addWithIncrease(DeclaredVarsTable table){
        ArrayList<String> increased = new ArrayList<String>();
        
        for (VarDeclaration x: table.getDeclaredVars()){
            if ((x.getDeclType() == VarType.FunctionParam 
                    || x.getDeclType() == VarType.FunctionVarDecl) 
                    && this.findVarNumber(x.getText()) != -1
                    && !increased.contains(x.getText())) 
                table.increaseVarNumber(this.findVarNumber(x.getText()) + 1, 
                        x.getVarNumber(), x.getText());
                increased.add(x.getText());
        }
        
        this.addAll(table);
    }
    
    private void increaseVarNumber(int onHow, int fromNumber, String varName){
        for (VarDeclaration x : getDeclaredVars())
            if ( x.getText().equals(varName)
                    && x.getVarNumber() >= fromNumber)
                x.setVarNumber(x.getVarNumber() + onHow);
    }
    
    private int findVarNumber(String name){
        int maxNum = -1;
        for (VarDeclaration x: getDeclaredVars())
            if (x.getText().equals(name)
                    && maxNum < x.getVarNumber())
                maxNum = x.getVarNumber();
        
        return maxNum;
    }

    public VarDeclaration findDeclaredVar(CommonToken declToken) {
        for (VarDeclaration x : getDeclaredVars())
            if (x.getToken().equals(declToken))
                return x;
        for (VarDeclaration x : getDeclaredVars())
            if (x instanceof ClassDeclaration)
                return x.getDeclaredVars().findDeclaredVar(declToken);
        return null;
    }

    /*
     * public VarDeclNode findDeclaredVar(String name, CommonToken
     * blockScopeToken){ for (VarDeclNode x: getDeclaredVars()) if
     * (x.getScopeToken().equals(blockScopeToken)) return x; for (VarDeclNode x:
     * getDeclaredVars()) if (x instanceof ClassDeclNode) return
     * x.getDeclaredVars().findDeclaredVar(token); return null; }
     */
/*
    public void setDeclaredVarType(int indexOfVarUse, HaxeType type) {
        VarUse element = (VarUse) getDeclaredVars().get(indexOfVarUse);
        CommonToken lastScope = element.getScopeToken();
        
        setDeclaredVarType(element.getText(), lastScope, type);
        
        for (int i = indexOfVarUse; i >= 0 ; i--) {
            if ((getDeclaredVars().get(i).getDeclType() == VarType.ClassVarDecl
                    || getDeclaredVars().get(i).getDeclType() == VarType.FunctionVarDecl
                    || getDeclaredVars().get(i).getDeclType() == VarType.FunctionParam)
                    && getDeclaredVars().get(i).getText().equals(element.getText())
                    && !lastScope.equals(getDeclaredVars().get(i).getScopeToken())){
                lastScope = getDeclaredVars().get(i).getScopeToken();
                setDeclaredVarType(element.getText(), lastScope, type);
                return;
            }
            else if (getDeclaredVars().get(i).getText().equals(element.getText())){
                lastScope = getDeclaredVars().get(i).getScopeToken();
                setDeclaredVarType(element.getText(), lastScope, type);
            }
        }
    }
    
    public void setDeclaredVarType(String name,CommonToken blockScope, HaxeType type) {
        for (VarDeclaration x : getDeclaredVars()) {
            if (x.getDeclType() != VarType.ClassVarDecl
                    && x.getDeclType() != VarType.FunctionVarDecl
                    && x.getDeclType() != VarType.FunctionParam
                    && x.getScopeToken().equals(blockScope)
                    && x.getText().equals(name))
                x.setHaxeType(type);
        }
    }*/

    /**
     * Sets the declared vars.
     * 
     * @param declaredVars
     *            the declaredVars to set
     */
    public void setDeclaredVars(final ArrayList<VarDeclaration> declaredVars) {
        declaredVars.clear();
        addAll(declaredVars);
    }

    public void addToDeclaredVars(final VarDeclaration declaredVar) {
        declaredVars.add(declaredVar);
    }

    public void addToDeclaredVars(final FunctionDeclaration declaredVar) {
        declaredVars.add(declaredVar);
    }

    public void addToDeclaredVars(final VarUse declaredVar) {
        declaredVars.add(declaredVar);
    }

    public boolean addAll(ArrayList<VarDeclaration> vars) {
        if (vars != null && !vars.isEmpty())
            return declaredVars.addAll(vars);
        else
            return false;
    }

    public boolean addAll(DeclaredVarsTable vars) {
        if (!vars.getDeclaredVars().isEmpty())
            return declaredVars.addAll(vars.getDeclaredVars());
        else
            return false;
    }

    private boolean ifUndefinedExist() {
        for (VarDeclaration tree : declaredVars) {
            if (tree.getHaxeType().equals(HaxeType.haxeUndefined))
                return true;
        }
        return false;
    }

    public void calculateTypes() {
        for (VarDeclaration tree : declaredVars) {
            if (tree instanceof FunctionDeclaration) {
                FunctionDeclaration fdn = (FunctionDeclaration) tree;
                if (fdn.ifUndefinedType()) {
                    fdn.setHaxeType(HaxeType.haxeVoid);
                } else if (fdn.getReturnNode() == null) {
                    fdn.commitNullReturnError();
                } else {
                    // check if right return type
                    // if (!returnNode.getHaxeType().equals(getHaxeType()))
                    // returnNode.getChild(0).commitError("Returned value doesn't match function value");
                }
            } else if (tree instanceof ClassDeclaration) {

            } else if (tree instanceof VarUse) {
                VarUse vun = (VarUse) tree;
                if (vun.getAssignExpr() != null
                        && !vun.getAssignExpr().ifUndefinedType()
                        && vun.ifUndefinedType()) {
                    //setDeclaredVarType(getDeclaredVars().indexOf(tree), vun.getAssignExpr().getHaxeType());
                    vun.setHaxeType(vun.getAssignExpr().getHaxeType());
                } else if (vun.getAssignExpr() != null
                        && !vun.getAssignExpr().ifUndefinedType()
                        && !HaxeType.isAvailableAssignement(vun.getHaxeType(), 
                                vun.getAssignExpr().getHaxeType())) {
                    vun.commitAssignmentError();
                } else if (vun.getAssignExpr() == null) {

                }
            } else if (tree.getDeclType() == VarType.ClassVarDecl
                    && tree.ifUndefinedType())
                tree.commitError("Class var should have type");
        }
    }

    /**
     * Return type of var as it stores in scope.
     * 
     * @param varName
     *            the var name
     * @return the var in scope type
     */
    public HaxeType getVarType(final String varName) {
        for (HaxeTree usage : this.declaredVars) {
            if (usage.getText().equals(varName)) {
                return ((VarDeclaration) usage).getHaxeType();
            }
        }
        return HaxeType.haxeUndefined;
    }

    public void print() {
        for (VarDeclaration x : declaredVars)
            x.printTree();
    }
}
