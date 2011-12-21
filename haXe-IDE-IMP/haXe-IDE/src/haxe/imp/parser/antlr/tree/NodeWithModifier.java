package haxe.imp.parser.antlr.tree;

public class NodeWithModifier extends HaxeTree implements INodeWithModifier
{
    protected Modifiers modifier = Modifiers.PRIVATE;
    
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
            modifier = convertToModifier(tree.getText());
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
