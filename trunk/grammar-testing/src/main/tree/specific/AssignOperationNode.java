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
public class AssignOperationNode extends ExtendedCommonTree {

    /**
     * 
     */
    public AssignOperationNode() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param node
     */
    public AssignOperationNode(CommonTree node) {
        super(node);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param t
     */
    public AssignOperationNode(Token t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param t
     * @param auxiliary
     */
    public AssignOperationNode(int ttype, Token t, boolean auxiliary) {
        super(ttype, t, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param type
     * @param auxiliary
     */
    public AssignOperationNode(int ttype, String type, boolean auxiliary) {
        super(ttype, type, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     * @param type
     * @param auxiliary
     */
    public AssignOperationNode(int ttype, String type) {
        this.token = new CommonToken(ttype, type);
    }

    public AssignOperationNode(int ttype, Token token) {
        this.token = token;
    }

    /**
     * @param ttype
     * @param auxiliary
     */
    public AssignOperationNode(int ttype, boolean auxiliary) {
        super(ttype, auxiliary);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param ttype
     */
    public AssignOperationNode(int ttype) {
        super(ttype);
        // TODO Auto-generated constructor stub
    }

}
