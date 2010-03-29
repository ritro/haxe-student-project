package main.tree;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class ExtendedTreeAdaptor extends CommonTreeAdaptor {
    public Object create(Token token) {
        return new ExtendedCommonTree(token);
    }

    public Object dupNode(Object t) {
        if (t == null) {
            return null;
        }
        return create(((ExtendedCommonTree) t).token);
    }

    public Object errorNode(TokenStream input, Token start, Token stop,
            RecognitionException e) {
        ExtendedErrorNode t = new ExtendedErrorNode(input, start, stop, e);
        return t;
    }
}
