/**
 * 
 */
package main.tree.specific;

import main.haxe.utils.HaxeType;
import main.tree.ExtendedCommonTree;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * @author kondratyev
 * 
 */
public class VarUsage extends ExtendedCommonTree {
    private HaxeType varType = HaxeType.haxeNotYetRecognized;

    /**
     * @param varType
     *            the varType to set
     */
    public void setVarType(HaxeType varType) {
        this.varType = varType;
    }

    /**
     * @return the varType
     */
    public HaxeType getVarType() {
        return varType;
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
        System.out.println(varType);
        this.token = t;
        if (varType.equals("INT")) {
            this.setVarType(HaxeType.haxeInt);
        } else if (varType.equals("FLOAT")) {
            this.setVarType(HaxeType.haxeFloat);
        } else if (varType.equals("STRING")) {
            this.setVarType(HaxeType.haxeString);
        } else if (varType.equals("VOID")) {
            this.setVarType(HaxeType.haxeVoid);
        } else if (varType.equals("BOOL")) {
            this.setVarType(HaxeType.haxeBool);
        } else if (varType.equals("DYNAMIC")) {
            this.setVarType(HaxeType.haxeDynamic);
        } else {
            this.setVarType(HaxeType.haxeUndefined);
        }
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
