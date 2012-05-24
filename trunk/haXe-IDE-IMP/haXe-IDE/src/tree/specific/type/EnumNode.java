package tree.specific.type;

import imp.parser.antlr.HaxeParser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.expression.Declaration;
import tree.statement.BlockScope;

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

		BlockScope blockScope = getBlockScope();
		if (blockScope == null) 
		{
		    return list;
		}
		for (HaxeTree x: blockScope.getChildren())
			if (x instanceof Declaration)
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
