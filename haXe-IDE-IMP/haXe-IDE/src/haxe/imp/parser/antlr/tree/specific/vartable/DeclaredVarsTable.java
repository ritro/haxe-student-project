package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
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
public class DeclaredVarsTable extends ArrayList<VarDeclaration> 
{    
    /**
     * If local class or function variable was already declared 
     * and has the same declaration type (Function variable declaration, 
     * parameter...) then Var Already Declared Exception 
     * will be committed else declaration will be added to the end of the table.
     * @param Declaration to add to the table.
     * @return True - if declaration was successfully added.
     */
    public boolean tryAdd(VarDeclaration element) 
    {
        //possible declaration types - function variable decl,
        //class variable decl, function parameter.
        VarType declType = element.getDeclType();
        if (containsDeclaration(element.getText(), declType))
        {
            element.commitVarAlreadyDeclaredTypeError();
            return false;
        }
        //maybe declaration with the same name exists but
        //we can overlay it -> new number needed for the new decl.
        int foundVarNumber = findLastDeclarationNumber(element.getText());
        if (foundVarNumber != -1)
        {
            return super.add(element);
        }
        VarDeclaration declaration = findDeclaredVar(element.getText());
        if (declaration.getDeclType() == VarType.FunctionParameter
                && element.declType == VarType.VarDeclaration)
        {
            element.commitVarAlreadyDeclaredTypeError();
            return false;
        }
        int newVarNumber = foundVarNumber + 1;
        element.setVarNumber(newVarNumber);
        return super.add(element);
    }
    
    /**
     * Will check if Class with the same name was already declared
     * and in that case will commit the VarAlreadyDeclared
     * Exception. Else will add declaration to the end of the list.
     * @param element
     * @return
     */
    public boolean tryAdd(ClassDeclaration element) 
    {
        if (containsDeclaration(element.getText(), VarType.ClassDeclaration))
        {
            element.commitVarAlreadyDeclaredTypeError();
            return false;
        }
        return super.add(element);
    }
    
    /**
     * Finds the last declaration for that var and adds var to
     * table with that declaration var number. If no declaration 
     * was found it will be added unchanged due to possibility
     * of external tables declaration of that variable.
     * @param Variable usage to add to the table.
     * @return True if adding was successful.
     */
    public boolean tryAdd(VarUse element)
    {
        //we can't commit error anyway - decl may be earlier
        int foundVarNumber = findLastDeclarationNumber(element.getText());
        if (foundVarNumber != -1)
        {
            element.setVarNumber(foundVarNumber);
        }
        return super.add(element);
    }
    
    /**
     * Will check if function with the same name 
     * was already declared and the Var Already Declared 
     * Exception will be committed if so. Else will add
     * declaration to the end of the list. 
     * @param Function declaration to add to the table.
     */
    public boolean tryAdd(FunctionDeclaration element)
    {
        if (containsDeclaration(element.getText(), VarType.FunctionDeclaration))
        {
            element.commitVarAlreadyDeclaredTypeError();
            return false;
        }
        
        return super.add(element);
    }
     
    /**
     * Adds all declarations from table to the current list
     * with increasing the declaration number if var with
     * the same name is declared.
     * @param table from which variables will be taken.
     */
    public boolean addAll(DeclaredVarsTable table)
    {
        for (VarDeclaration x : table)
        {
            String varName = x.getText();
            if (x.getDeclType() == VarType.VarUsage)
            {
                continue;
            }
            int foundVarNumber = findLastDeclarationNumber(varName);
            if (foundVarNumber == -1)
            {
                continue;
            }
            int oldNumber = x.getVarNumber();
            table.changeVarNumber(foundVarNumber + 1 - oldNumber,
                            oldNumber, varName);
        }

        return super.addAll(table);
    }
    
    /**
     * Adds variables and declarations without overlay
     * possibility. Commits error then adding wasn't
     * successful and continues without that declaration.
     * @param table from which variables will be taken.
     * @return
     */
    public boolean tryAddAll(DeclaredVarsTable table)
    {
        for (VarDeclaration x : table)
        {
            String varName = x.getText();
            if (x.getDeclType() == VarType.VarUsage)
            {
                continue;
            }
            int foundVarNumber = findLastDeclarationNumber(varName);
            if (foundVarNumber == -1)
            {
                continue;
            }
            x.commitVarAlreadyDeclaredTypeError();
            table.remove(x);
        }

        return super.addAll(table);
    }
    
    /**
     * Changes all variables' numbers with the specific name and number
     * to new value. This is used for overlaying the previous 
     * declaration and all it's usages in the scope.
     * @param onNumber - what number it should be.
     * @param fromNumber - old that declaration's number.
     * @param varName - declaration's or usages' number.
     */
    private void changeVarNumber(int onNumber, int fromNumber, String varName)
    {
        for (VarDeclaration x : this)
        {
            if (x.getText().equals(varName)
                    && x.getVarNumber() >= fromNumber)
            {
                x.setVarNumber(x.getVarNumber() + onNumber);
            }
            if (!(x instanceof VarUse))
            {
                continue;
            }//FIXME add binary usages and complex expressions
            VarUse varUse = (VarUse) x;
            VarDeclaration assignment = varUse.getAssignExpr();
            if (assignment == null)
            {
                continue;
            }
            if (assignment.getText().equals(varName)
                    && assignment.getVarNumber() >= fromNumber)
            {
                assignment.setVarNumber(
                        x.getVarNumber() + onNumber);
            }
        }
    }
    
    /**
     * Finds last declaration's number to determine,
     * which variable actually is in use. Searches in
     * the whole table.
     * @param Variable name.
     * @return Largest suitable variable number or 
     * -1 if there was no declaration at all for this var.
     */
    private int findLastDeclarationNumber(String name)
    {
        int maxNum = -1;
        for (VarDeclaration x : this)
        {
            if (x.getText().equals(name)
                    && maxNum < x.getVarNumber())
            {
                maxNum = x.getVarNumber();
            }
        }

        return maxNum;
    }
    
    /**
     * Searches for declaration in the table of the same name
     * and type. Used in checking for possibility of overlaying
     * the declaration. 
     * @param name - declaration name.
     * @param type - declaration type.
     * @return True if declaration with the same name 
     * and type was found.
     */
    private boolean containsDeclaration(String name, VarType type)
    {
        for (VarDeclaration tree : this)
        {
            if (tree instanceof VarUse)
            {
                continue;
            }
            
            if (tree.getText().equals(name) 
                    && tree.getDeclType().equals(type))
            {
                return true;
            }
        }
        
        return false;
    }

    public VarDeclaration findDeclaredVar(CommonToken declToken)
    {
        for (VarDeclaration x : this)
            if (x.getToken().equals(declToken)) 
                return x;
        for (VarDeclaration x : this)
            if (x instanceof ClassDeclaration) 
                return x.getDeclaredVars().findDeclaredVar(declToken);
        return null;
    }
    
    public VarDeclaration findDeclaredVar(String name)
    {
        for (VarDeclaration x : this)
            if (x.getText().equals(name)
                    && x.ifVarDeclaration()) 
                return x;
        for (VarDeclaration x : this)
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
        for (VarDeclaration x : this)
        {
            if (Num == x.getVarNumber()
                    && x.getText().equals(name)
                    && !x.getDeclType().equals(VarType.ClassVarDeclaration)) 
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
        this.clear();
        addAll(declaredVars);
    }
    
    public void calculateTypes() {
        boolean ifChanged = false;
        
        do {
            ifChanged = false;
            for (VarDeclaration tree : this) {
                if (tree instanceof FunctionDeclaration) {
                    FunctionDeclaration fdn = (FunctionDeclaration) tree;
                    if (fdn.ifUndefinedType()) 
                    {
                        fdn.setHaxeType(HaxeType.haxeVoid); //??
                        ifChanged = true;
                    }
                } else if (tree instanceof ClassDeclaration) {
    
                } else if (tree instanceof VarUse) {
                    VarUse vun = (VarUse) tree;
                    if (vun.getAssignExpr() != null
                            && !vun.getAssignExpr().ifUndefinedType()
                            && vun.ifUndefinedType()) 
                    {
                        setDeclaredVarType(vun.getText(),vun.getVarNumber(), 
                                vun.getAssignExpr().getHaxeType());
                        ifChanged = true;
                    } else if (vun.getAssignExpr() == null) 
                    {
                        //do nothing??
                    }
                }
            }
        } while (ifChanged);
        markErrors();
    }
    
    public void markErrors()
    {
        for (VarDeclaration tree : this) {
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
                if (findDeclaredVar(vun.getText()) == null)
                {
                    vun.commitUndeclaredError();
                } else if (vun.getAssignExpr() != null
                        && !vun.getAssignExpr().ifUndefinedType()
                        && !HaxeType.isAvailableAssignement(vun.getHaxeType(), 
                                vun.getAssignExpr().getHaxeType())) {
                    vun.commitIncorrectAssignmentError();
                }
            } else if (tree.getDeclType() == VarType.ClassVarDeclaration
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
    public HaxeType getVarType(final String varName) 
    {
        for (HaxeTree usage : this) 
        {
            if (usage.getText().equals(varName)) 
            {
                return ((VarDeclaration) usage).getHaxeType();
            }
        }
        return HaxeType.haxeUndefined;
    }
}
