package tree.specific;


import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.specific.type.HaxeType;
import tree.utils.HaxeTypeUtils;

/**
 * Constants in haXe are:
 * Integers:    0; -134; 0xFF00
 * Floats:      123.0; .14179; 13e50; -1e-99
 * Strings:     "hello"; "hello \"world\" !"; 
 *              'hello "world" !'
 * Booleans:    true; false
 * Unknown<0>:  null
 * EReg - regular expression : ~/[a-z]+/i
 * @author Savenko Maria
 */
public class Constant extends HaxeTree {

	public Constant(final Token token) 
	{
		super(token);
	}

	public Constant(
	        final int ttype, final Token token, final String varType) 
	{
	    this(token);
		HaxeType constantType = HaxeTypeUtils.getStandartTypeByName(varType);
		if (constantType == null)
		{
			setHaxeType(null);
		}
		else
		{
		    setHaxeType(constantType);
		}
	}
	
	public String toString()
	{
	    return String.format(
	            "constant [%s]: %s", 
	            getText(),
	            getHaxeType() == null ? "null" : getHaxeType().toString());
	}
}
