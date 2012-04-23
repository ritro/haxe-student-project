package tree.specific;

import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.INodeWithModifier;
import tree.Modifiers;

public class NodeWithScopeAndModifier 
    extends BlockScopeContainer 
    implements INodeWithModifier
{
    protected Modifiers modifier = Modifiers.PRIVATE;

    public NodeWithScopeAndModifier(Token t) 
    {
        super(t);
    }
    
    public Modifiers getModifier()
    {
        return modifier;
    }
    
    public void updateModifier()
    {
        for (HaxeTree tree : getChildren()) 
        {
            if (tree.getToken().getType() != DECL_ATTR_LIST) 
            {
                continue;
            }
            modifier = 
                    NodeWithModifier.convertToModifier(tree.getText());
            return;
        }
    }
    
}