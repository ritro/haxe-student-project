/**
 * 
 */
package main.tree.specific;

import java.util.ArrayList;

import main.tree.ExtendedCommonTree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * @author kondratyev
 * 
 */
public class BlockScopeNode extends ExtendedCommonTree {

    /**
     * Each BlockScope contains Nodes representing vars, that could be used in
     * current scope
     */
    private ArrayList<VarUsage> declaredVars = new ArrayList<VarUsage>();

    /**
     * @return the declaredVars
     */

    /*
     * public ArrayList<VarUsage> getDeclaredVars() { return this.declaredVars;
     * }
     */

    @SuppressWarnings("unchecked")
    public ArrayList<VarUsage> getDeclaredVarsClone() {
        return (ArrayList<VarUsage>) this.declaredVars.clone();
    }

    /**
     * @param declaredVars
     *            the declaredVars to set
     */
    public void setDeclaredVars(ArrayList<VarUsage> declaredVars) {
        this.declaredVars = declaredVars;
    }

    /**
     * 
     */
    public BlockScopeNode() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param node
     */
    public BlockScopeNode(CommonTree node) {
        super(node);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param t
     */
    public BlockScopeNode(Token t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param t
     * @param auxiliary
     */
    public BlockScopeNode(int ttype, Token t, boolean auxiliary) {
        super(ttype, t, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param type
     * @param auxiliary
     */
    public BlockScopeNode(int ttype, String type, boolean auxiliary) {
        super(ttype, type, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param auxiliary
     */
    public BlockScopeNode(int ttype, boolean auxiliary) {
        super(ttype, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     */
    public BlockScopeNode(int ttype) {
        super(ttype);
        // TODO Auto-generated constructor stub
    }

    /**
     * Checks if there is var with such name in current scope
     * 
     * @param varName
     * @return
     */
    public boolean doScopeContainsVarName(String varName) {
        for (VarUsage usage : declaredVars) {
            if (usage.getText().equals(varName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return type of var as it stores in scope
     * 
     * @param varName
     * @return
     */
    public String getVarInScopeType(String varName) {
        for (VarUsage usage : declaredVars) {
            if (usage.getText().equals(varName)) {
                return usage.getVarType();
            }
        }
        return VarUsage.VarTypes.UNKNOWN.toString();
    }

    @Override
    public String toString() {
        String vars = "";
        for (VarUsage usage : declaredVars) {
            vars += "[" + usage.getVarType() + " " + usage.getText() + "]" + ", ";
        }
        return super.toString() + "(" + this.getLine() + ", "
                + this.getCharPositionInLine() + ")" + "(" + vars + ") "
                + this.getClass();
    }
}
