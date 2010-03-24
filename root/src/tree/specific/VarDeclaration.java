package tree.specific;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import tree.ExtendedCommonTree;

public class VarDeclaration extends ExtendedCommonTree {

    /**
     * 
     */
    public VarDeclaration() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param node
     */
    public VarDeclaration(CommonTree node) {
        super(node);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param t
     */
    public VarDeclaration(Token t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param type
     * @param auxiliary
     */
    public VarDeclaration(int ttype, String type, boolean auxiliary) {
        super(ttype, type, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     */
    public VarDeclaration(int ttype) {
        super(ttype);
        // TODO Auto-generated constructor stub
    }

    public VarDeclaration(int ttype, Token token) {
        this.token = token;
    }
}
