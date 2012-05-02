package tree;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class CommonTreeReplacer extends CommonTree 
{
    public CommonTreeReplacer() {}
    
    public CommonTreeReplacer(final Token t) 
    {
        super(t);
    }
    
    @Override
    public HaxeTree getChild(final int i) 
    {
        return (HaxeTree) super.getChild(i);
    }

    @Override
    public CommonToken getToken() 
    {
        return (CommonToken) super.getToken();
    }
    
    public int getTokenStartIndex()
    {
        if (token == null)
        {
            return -1;
        }
        return getToken().getStartIndex();
    }
    
    public int getTokenStopIndex()
    {
        if (token == null)
        {
            return -1;
        }
        return getToken().getStopIndex();
    }
    
    public HaxeTree getParent()
    {
        Tree parent = super.getParent();
        if (parent == null)
        {
            return null;
        }
        return (HaxeTree) parent;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<HaxeTree> getChildren() 
    {
        List<HaxeTree> res = (List<HaxeTree>)super.getChildren();
        
        if (res == null) return new ArrayList<HaxeTree>();
        
        return res;
    }

}
