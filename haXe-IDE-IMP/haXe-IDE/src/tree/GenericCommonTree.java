package tree;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public abstract class GenericCommonTree<T extends CommonTree> extends CommonTree 
{
    public GenericCommonTree() {}
    
    public GenericCommonTree(final Token t) 
    {
        super(t);
    }
    
    @Override
    public T getChild(final int i) 
    {
        return (T) super.getChild(i);
    }

    @Override
    public CommonToken getToken() 
    {
        return (CommonToken) super.getToken();
    }
    
    public int getTokenStartIndex()
    {
        if (getToken() == null)
        {
            return -1;
        }
        return getToken().getStartIndex();
    }
    
    public int getTokenStopIndex()
    {
        if (getToken() == null)
        {
            return -1;
        }
        return getToken().getStopIndex();
    }
    
    public T getParent()
    {
        Tree parent = super.getParent();
        if (parent == null)
        {
            return null;
        }
        return (T) parent;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<T> getChildren() 
    {
        List<T> res = (List<T>)super.getChildren();
        
        if (res == null) return new ArrayList<T>();
        
        return res;
    }
}
