/**
 * 
 */
package main.tree.specific;

import main.tree.ExtendedCommonTree;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * @author kondratyev
 * 
 */
public class VarUsage extends ExtendedCommonTree {

    public enum VarTypes {
        VOID, STRING, INT, FLOAT, BOOL, DYNAMIC, UNKNOWN, NOT_YET_RGRECOGNIZED
    }

    private String varType = VarTypes.NOT_YET_RGRECOGNIZED.toString();

    /**
     * @return the varType
     */
    public String getVarType() {
        return varType;
    }

    /**
     * @param varType
     *            the varType to set
     */
    public void setVarType(String varType) {
        this.varType = varType;
    }

    /**
     * 
     */
    public VarUsage() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param node
     */
    public VarUsage(CommonTree node) {
        super(node);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param t
     */
    public VarUsage(Token t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

    public VarUsage(int ttype, Token t, String varType) {
        this.token = t;
        this.varType = varType;
    }

    /**
     * @param ttype
     * @param t
     * @param auxiliary
     */
    public VarUsage(int ttype, Token t, boolean auxiliary) {
        super(ttype, t, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param type
     * @param auxiliary
     */
    public VarUsage(int ttype, String type, boolean auxiliary) {
        super(ttype, type, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param auxiliary
     */
    public VarUsage(int ttype, boolean auxiliary) {
        super(ttype, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     */
    public VarUsage(int ttype) {
        super(ttype);
        // TODO Auto-generated constructor stub
    }

    public VarUsage(int ttype, Token t) {
        this.token = new CommonToken(ttype);
    }

    public VarUsage getClone() {
        VarUsage varUsage = new VarUsage(this.getToken());
        varUsage.setVarType(this.getVarType());
        return varUsage;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + this.getLine() + ", "
                + this.getCharPositionInLine() + ")" + "(" + this.getVarType() + ") "
                + this.getClass();
    }

}
