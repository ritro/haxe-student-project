package main.tree.specific;

import java.util.ArrayList;
import java.util.Arrays;

import main.main.TinyHaxeTry1Parser;
import main.tree.ExtendedCommonTree;
import main.tree.TreeTokens;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class FunctionNode extends ExtendedCommonTree {
    public static final int PARAM_LIST_TYPE = (new ArrayList<String>(Arrays
            .asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.PARAM_LIST
            .toString());

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

    @SuppressWarnings("unchecked")
    public ExtendedCommonTree getParamListNode() {
        for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this.getChildren()) {
            Token token = (CommonToken) tree.getToken();
            if (token.getType() == PARAM_LIST_TYPE) {
                return tree;
            }
        }
        return null;
    }

    public String getFunctionName() {
        return this.getChild(0).getText();
    }
}
