package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;

public class EnumNode extends HaxeType 
{	
	public EnumNode(final Token t) {
		super(t);
	}

	public HaxeTree getInherits() 
	{
		for (HaxeTree tree : (ArrayList<HaxeTree>)getChildren()) 
		{
			if (tree.getType() == HaxeParser.EXTENDS) 
			{
				return (HaxeTree) tree;
			}
		}
		return null;
	}
	
	/**
	 * class D extends A, implements B, implements C {} 
	 * Каждый экземпляр D будет иметь тип D, но также имеет типы A , B и C.
	 * 
	 * @return Class Name type with implemented types record for each class/interface  
	 * it extended/implemented
	 */
	@Override
	public HaxeType getHaxeType()
	{
		return this;
	}

	/**
	 * Gets the all declared vars.
	 * 
	 * @return the all declared vars
	 */
	public List<HaxeTree> getAllMembers() {
		List<HaxeTree> list = new ArrayList<HaxeTree>();

		BlockScopeNode blockScope = getBlockScope();
		if (blockScope == null) 
		{
		    return list;
		}
		for (HaxeTree x: blockScope.getChildren())
			if (x instanceof VarDeclarationNode)
				list.add(x);
		return list;
	}

    @Override
    public HaxeTree getDeclaration(final String name)
    {
        for (HaxeTree child : getAllMembers())
        {
            if (child.getText().equals(name))
            {
                return child;
            }
        }
        return null;
    }

}
