package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.exceptions.VarAlreadyDeclaredException;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration.VarType;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;

/**
 * Table that contains different declarations (e.g class, function, enums)
 * and usages (e.g. variables) useful in type interference.
 * @author Savenko Maria
 *
 */
public class DeclaredVarsTable {

    private ArrayList<VarDeclaration> declaredVars = new ArrayList<VarDeclaration>();

    public ArrayList<VarDeclaration> getDeclaredVars()
    {
        return declaredVars;
    }

    /**
     * Checks if declaration for var, class or function
     * already exists in the table.
     * @param var
     * @return true if table contains variable
     */
    public boolean contains(VarDeclaration var)
    {
        for (VarDeclaration tree : declaredVars)
        {
            //we look only for declarations
            if (tree instanceof VarUse)
            {
                continue;
            }
            if (tree.getToken().equals(var.getToken()))
                break; // looking for the previous vars with the same text FIXME????
            if (tree instanceof FunctionDeclaration 
                    && var.getText().equals(((FunctionDeclaration) tree).getText()) 
                    // FIXME && parameters equals... ??
                    && !var.getToken().equals(((FunctionDeclaration) tree).getToken()))
            {
                    return true; // another var with the same name
            }
            if (!(tree instanceof FunctionDeclaration)
                    && var.getText().equals(tree.getText())
                    //&& parameters equals... && blockscope mark equals
                    && !var.getToken().equals(tree.getToken()))
            {
                return true; // another var with the same name
            }
        }
        return false;
    }
    
    /**
     * Experimental function with immediate error effect.
     * If overlay is allowed it will search for previous 
     * declaration and adds this one with new number = old + 1.
     * Else it will throw exception if such variable already was
     * declared.
     */
    public void tryAdd(VarDeclaration element) 
            throws VarAlreadyDeclaredException
    {
        int foundVarNumber = findVarNumber(element.getText());
        if (foundVarNumber == -1)
        {
            add(element);
            return;
        }
        if (element.getDeclType() == VarType.FunctionParam
                || element.getDeclType() == VarType.FunctionVarDecl)
        {
            int newVarNumber = foundVarNumber + 1;
            element.setVarNumber(newVarNumber);
            add(element);
            return;
        }
        if (contains(element))
        {
            throw new VarAlreadyDeclaredException();
        }
        add(element);
    }
    
    /**
     * If declaration is inside the function or it is a function
     * parameter then variable number will be increased to
     * determine the variable overlay. For over types of declaration
     * var number will not be changed.
     * @param Declaration to add to the table.
     */
    public void addWithIncrease(VarDeclaration element)
    {
        if ((element.getDeclType() == VarType.FunctionParam
                || element.getDeclType() == VarType.FunctionVarDecl)
                && findVarNumber(element.getText()) != -1)
        {
            int newVarNumber = findVarNumber(element.getText())
                    + element.getVarNumber() + 1;
            element.setVarNumber(newVarNumber);
        }

        this.add(element);
    }
    
    /**
     * Finds the last declaration for that var and adds var to
     * table with that declaration var number. If no declaration
     * was found the element will be added untouched.
     * @param Variable usage to add to the table.
     */
    public void addWithIncrease(VarUse element)
    {
        int foundVarNumber = findVarNumber(element.getText());
        if (foundVarNumber != -1)
        {
            element.setVarNumber(foundVarNumber);
        }

        this.add(element);
    }
    
    public void addWithIncrease(DeclaredVarsTable table)
    {
        ArrayList<String> checked = new ArrayList<String>();

        for (VarDeclaration x : table.getDeclaredVars())
        {
            String varName = x.getText();
            if (x.getDeclType() != VarType.FunctionParam
                    && x.getDeclType() != VarType.FunctionVarDecl)
            {
                checked.add(varName);
                continue;
            }
            int foundVarNumber = findVarNumber(varName);
            if (foundVarNumber != -1
                    && !checked.contains(varName)) 
            {
                table.increaseVarNumber(foundVarNumber + 1,
                            x.getVarNumber(), varName);
            }
            checked.add(varName);
        }

        this.addAll(table);
    }

    /**
     * Adds declaration to the list without any check.
     * @param any declaration
     */
    public void add(final VarDeclaration declaredVar)
    {
        declaredVars.add(declaredVar);
    }

    /**
     * Adds declaration to the list without any check.
     * @param function declaration
     */
    public void add(final FunctionDeclaration declaredVar)
    {
        declaredVars.add(declaredVar);
    }

    /**
     * Adds declaration to the list without any check.
     * @param variable usage
     */
    public void add(final VarUse declaredVar)
    {
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
    
    private void increaseVarNumber(int onHow, int fromNumber, String varName)
    {
        for (VarDeclaration x : getDeclaredVars())
        {
            if (x.getText().equals(varName)
                    && x.getVarNumber() >= fromNumber)
            {
                x.setVarNumber(x.getVarNumber() + onHow);
            }
            if (!(x instanceof VarUse))
            {
                continue;
            }
            VarUse varUse = (VarUse) x;
            if (varUse.getAssignExpr() != null
                    && varUse.getAssignExpr().getText().equals(varName)
                    && varUse.getAssignExpr().getVarNumber() >= fromNumber)
            {
                varUse.getAssignExpr().setVarNumber(
                        x.getVarNumber() + onHow);
            }
        }
    }
    
    /**
     * Finds last declaration's var number to determine,
     * which var actually is in use.
     * @param Variable name.
     * @return Largest suitable variable number or 
     * -1 if there was no declaration at all for this var.
     */
    private int findVarNumber(String name)
    {
        int maxNum = -1;
        for (VarDeclaration x : getDeclaredVars())
        {
            if (x.getText().equals(name)
                    && maxNum < x.getVarNumber())
            {
                maxNum = x.getVarNumber();
            }
        }

        return maxNum;
    }


    public VarDeclaration findDeclaredVar(CommonToken declToken)
    {
        for (VarDeclaration x : getDeclaredVars())
            if (x.getToken().equals(declToken)) 
                return x;
        for (VarDeclaration x : getDeclaredVars())
            if (x instanceof ClassDeclaration) 
                return x.getDeclaredVars().findDeclaredVar(declToken);
        return null;
    }
    
    public VarDeclaration findDeclaredVar(String name)
    {
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
    
    public void setDeclaredVarType(String name, int Num, HaxeType type)
    {
        for (VarDeclaration x : getDeclaredVars())
        {
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
    public void setDeclaredVars(final ArrayList<VarDeclaration> declaredVars)
    {
        declaredVars.clear();
        addAll(declaredVars);
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
