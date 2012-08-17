package tree;

import java.util.ArrayList;

import org.antlr.runtime.Token;


public class NodeWithScopeAndModifier 
    extends BlockScopeContainer 
    implements INodeWithModifier
{
    protected ArrayList<Modifiers> modifiers = null;

    public NodeWithScopeAndModifier(Token t) 
    {
        super(t);
    }

    public ArrayList<Modifiers> getModifiers()
    {
        return modifiers;
    }
    
    public void updateModifier()
    {
        modifiers = new ArrayList<Modifiers>();
        for (HaxeTree tree : getChildren()) 
        {
            if (tree.getToken().getType() != DECL_ATTR_LIST) 
            {
                continue;
            }
            for (HaxeTree mdf : tree.getChildren())
            {
                modifiers.add(NodeWithModifier.convertToModifier(mdf.getText()));
            }
            return;
        }
    }
    
}
