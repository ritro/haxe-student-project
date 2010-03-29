/**
 * 
 */
package main.tree.specific;

import main.tree.ExtendedCommonTree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * @author kondratyev
 * 
 */
public class BlockScopeNode extends ExtendedCommonTree {

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

}
