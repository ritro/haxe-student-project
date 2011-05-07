package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
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
        for (VarDeclaration x : getDeclaredVars()){
            if ( x.getText().equals(varName)
                    && x.getVarNumber() >= fromNumber){
                x.setVarNumber(x.getVarNumber() + onHow);
            }
            if (x instanceof VarUse 
                    && ((VarUse)x).getAssignExpr() != null
                    && ((VarUse)x).getAssignExpr().getText().equals(varName)
                    && ((VarUse)x).getAssignExpr().getVarNumber() >= fromNumber){
                ((VarUse)x).getAssignExpr().setVarNumber(x.getVarNumber() + onHow);
            } 
        }
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
    
    public VarDeclaration findDeclaredVar(String name) {
        for (VarDeclaration x : getDeclaredVars())
            if (x.getText().equals(name)
                    && x.ifVarDeclaration())
                return x;
        for (VarDeclaration x : getDeclaredVars())
            if (x instanceof ClassDeclaration)
                return x.getDeclaredVars().findDeclaredVar(name);
        return null;
    }

    /*
     * public VarDeclNode findDeclaredVar(String name, CommonToken
     * blockScopeToken){ for (VarDeclNode x: getDeclaredVars()) if
     * (x.getScopeToken().equals(blockScopeToken)) return x; for (VarDeclNode x:
     * getDeclaredVars()) if (x instanceof ClassDeclNode) return
     * x.getDeclaredVars().findDeclaredVar(token); return null; }
     */
    
    public void setDeclaredVarType(String name,int Num, HaxeType type) {
        for (VarDeclaration x : getDeclaredVars()) {
            if (Num == x.getVarNumber()
                    && x.getText().equals(name)
                    && !x.getDeclType().equals(VarType.ClassVarDecl))
                x.setHaxeType(type);
        }
    }

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

    public void calculateTypes() {
        boolean ifChanged = false;
        
        do {
            ifChanged = false;
            for (VarDeclaration tree : declaredVars) {
                if (tree instanceof FunctionDeclaration) {
                    FunctionDeclaration fdn = (FunctionDeclaration) tree;
                    if (fdn.ifUndefinedType()) {
                        fdn.setHaxeType(HaxeType.haxeVoid); //??
                        ifChanged = true;
                    } /*else if (fdn.getReturnNode() == null) {
                        fdn.commitNullReturnError();
                    } else if (!fdn.getReturnNode().ifUndefinedType() // check if right return type
                               && !fdn.getReturnNode().getHaxeType().equals(fdn.getHaxeType())) {
                             fdn.getReturnNode().commitIncorrectReturnTypeError();
                    }*/
                } else if (tree instanceof ClassDeclaration) {
    
                } else if (tree instanceof VarUse) {
                    VarUse vun = (VarUse) tree;
                    if (findDeclaredVar(vun.getText()) == null){
                        //vun.commitUndeclaredError();
                    } else if (vun.getAssignExpr() != null
                            && !vun.getAssignExpr().ifUndefinedType()
                            && vun.ifUndefinedType()) {
                        setDeclaredVarType(vun.getText(),vun.getVarNumber(), 
                                vun.getAssignExpr().getHaxeType());
                        ifChanged = true;
                    } else /*if (vun.getAssignExpr() != null
                            && !vun.getAssignExpr().ifUndefinedType()
                            && !HaxeType.isAvailableAssignement(vun.getHaxeType(), 
                                    vun.getAssignExpr().getHaxeType())) {
                        vun.commitIncorrectAssignmentError();
                    } else */ if (vun.getAssignExpr() == null) {
                        //do nothing??
                    }
                } else if (tree.getDeclType() == VarType.ClassVarDecl
                        && tree.ifUndefinedType()){
                    //tree.commitClassUndefinedTypeError();
                }
            }
        } while (ifChanged);
        markErrors();
    }
    
    public void markErrors(){
        for (VarDeclaration tree : declaredVars) {
            if (tree instanceof FunctionDeclaration) {
                FunctionDeclaration fdn = (FunctionDeclaration) tree;
                if (fdn.getHaxeType().equals(HaxeType.haxeVoid) 
                        && fdn.getReturnNode() != null) {
                    //fdn.getReturnNode().commitStrangeDecl();
                } else if (!fdn.getHaxeType().equals(HaxeType.haxeVoid) 
                           && fdn.getReturnNode() == null) {
                    fdn.commitNullReturnError();
                } else if (!fdn.getHaxeType().equals(HaxeType.haxeVoid) 
                           && !fdn.getReturnNode().ifUndefinedType() // check if right return type
                           && !fdn.getReturnNode().getHaxeType().equals(fdn.getHaxeType())) {
                         fdn.getReturnNode().commitIncorrectReturnTypeError();
                }
            } else if (tree instanceof ClassDeclaration) {

            } else if (tree instanceof VarUse) {
                VarUse vun = (VarUse) tree;
                if (findDeclaredVar(vun.getText()) == null){
                    vun.commitUndeclaredError();
                } else if (vun.getAssignExpr() != null
                        && !vun.getAssignExpr().ifUndefinedType()
                        && !HaxeType.isAvailableAssignement(vun.getHaxeType(), 
                                vun.getAssignExpr().getHaxeType())) {
                    vun.commitIncorrectAssignmentError();
                }
            } else if (tree.getDeclType() == VarType.ClassVarDecl
                    && tree.ifUndefinedType())
                tree.commitClassUndefinedTypeError();
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
