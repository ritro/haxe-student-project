package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class FunctionNode extends ExtendedCommonTree {
    // public static final int

    public FunctionNode() {
        super();
    }

    /**
     * @param node
     */
    public FunctionNode(ExtendedCommonTree node) {
        super(node);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param t
     */
    public FunctionNode(Token t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

    public ExtendedCommonTree getParamListNode() {
        for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this.getChildren()) {
            Token token = (CommonToken) tree.getToken();
            if (token.getType() == PARAM_LIST_TYPE) {
                return tree;
            }
        }
        return null;
    }

    public ArrayList<VarUsage> getParametersAsVarUsage() {
        ArrayList<VarUsage> list = new ArrayList<VarUsage>();
        ExtendedCommonTree parameters = this.getParamListNode();
        if (parameters != null) {
            for (ExtendedCommonTree varDecl : parameters.getChildren()) {
                VarDeclaration varDeclaration = (VarDeclaration) varDecl;
                varDeclaration.getVarNameNode().setVarType(varDeclaration.getVarType());
                VarUsage varUsage = varDeclaration.getVarNameNode().getClone();
                list.add(varUsage);
            }
        }
        return list;
    }

    public String getFunctionName() {
        return this.getChild(0).getText();
    }

    public HaxeType getFunctionReturnType() {
        for (ExtendedCommonTree tree : this.getChildren()) {
            if (tree.getToken().getType() == TYPE_TAG_TYPE) {
                /**
                 * FIXME Нужно находить название этого класса в объявлениях,
                 * если он не примитивный, и возвращать его копию.
                 */
                return new HaxeType(tree.getChild(0).getText());
            }
        }
        return HaxeType.haxeUndefined;
    }

    public BlockScopeNode getBlockScope() {
        for (ExtendedCommonTree tree : this.getChildren()) {
            if (tree instanceof BlockScopeNode) {
                return (BlockScopeNode) tree;
            }
        }
        return null;
    }
}
