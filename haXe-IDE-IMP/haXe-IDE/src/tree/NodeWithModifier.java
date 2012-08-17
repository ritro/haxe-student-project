package tree;

import java.util.ArrayList;

import org.antlr.runtime.Token;


public class NodeWithModifier extends HaxeTree implements INodeWithModifier
{
    protected ArrayList<Modifiers> modifiers = null;    
    
    protected NodeWithModifier()
    {
        super();
    }
    
    public NodeWithModifier(final Token token) 
    {
        super(token);
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
                modifiers.add(convertToModifier(mdf.getText()));
            }
            return;
        }
    }
    
    public static Modifiers convertToModifier(String str)
    {
        if (str.equalsIgnoreCase("STATIC"))
        {
            return Modifiers.STATIC;
        }
        else if (str.equalsIgnoreCase("DYNAMIC"))
        {
            return Modifiers.DYNAMIC;
        }
        else if (str.equalsIgnoreCase("OVERRIDE"))
        {
            return Modifiers.OVERRIDE;
        }
        else if (str.equalsIgnoreCase("PUBLIC"))
        {
            return Modifiers.PUBLIC;
        }
        
        return Modifiers.PRIVATE;
    }
}
