package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.tree.utils.HaxeTypeUtils;

import org.antlr.runtime.Token;

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
public class ConstantNode extends HaxeTree {

	public ConstantNode(final Token token) {
		this.token = token;
	}

	public ConstantNode(
	        final int ttype, final Token token, final String varType) 
	{
	    this(token);
		HaxeType constantType = HaxeTypeUtils.getLibTypeByName(varType);
		if (constantType == null)
		{
			setHaxeType(null);
		}
		else
		{
		    setHaxeType(constantType);
		}
	}
}
