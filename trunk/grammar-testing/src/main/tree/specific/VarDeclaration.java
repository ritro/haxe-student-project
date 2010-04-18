package main.tree.specific;

import java.util.ArrayList;

import main.haxe.utils.HaxeType;
import main.tree.ExtendedCommonTree;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

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

    public VarDeclaration(int ttype, Token token, boolean auxiliary) {
        this.token = token;
        this.setAuxiliary(auxiliary);
    }

    /**
     * Returns node correspond for var name (in var tmp:Int = foo+bar; it will
     * return "tmp")
     * 
     * @return
     */
    public VarUsage getVarNameNode() {
        return (VarUsage) this.getChild(0);
    }

    public HaxeType getVarType() {
        for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this.getChildren()) {
            Token token = (CommonToken) tree.getToken();
            if (token.getType() == TYPE_TAG_TYPE) {
                /**
                 * FIXME Нужно находить название этого класса в объявлениях,
                 * если он не примитивный, и возвращать его копию.
                 */
                // if
                // (HaxeType.primaryTypes.contains(tree.getChild(0).getText())){
                // return HaxeType
                // }
                return new HaxeType(tree.getChild(0).getText());
            }
        }
        return HaxeType.haxeUndefined;
    }

    public ExtendedCommonTree getVAR_INIT_NODE() {
        for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this.getChildren()) {
            Token token = (CommonToken) tree.getToken();
            if (token.getType() == VAR_INIT_TYPE) {
                return tree;
            }
        }
        return null;
    }
}
