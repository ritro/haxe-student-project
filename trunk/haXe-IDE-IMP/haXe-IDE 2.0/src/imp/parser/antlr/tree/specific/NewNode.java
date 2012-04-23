package imp.parser.antlr.tree.specific;

import imp.parser.antlr.tree.HaxeTree;

import java.util.List;

import org.antlr.runtime.Token;


public class NewNode extends HaxeTree
{
    private HaxeTree declaration = null;
    
    public NewNode(final Token t)
    {
        super(t);
    }
    
    public HaxeTree getDeclarationNode()
    {
        return declaration;
    }
    
    public void setDeclarationNode(final HaxeTree value)
    {
        declaration = value;
    }
    
    public HaxeTree getObjectWhichIsCreated()
    {
        return getChild(0);
    }
    
    public List<HaxeTree> getParameters()
    {
        List<HaxeTree> children = getChildren();
        children.remove(0);
        
        return children;
    }
}
