/*******************************************************************************
 * Copyright (c) 2009 Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU General Public License, version 2
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Contributors:
 *    Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 *******************************************************************************/
package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.NodeWithModifier;
import haxe.tree.utils.HaxeType;
import haxe.tree.utils.PrimaryHaxeType;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * The Class VarDeclaration.
 * 
 * @author Anatoly Kondratyev
 */
public class VarDeclarationNode extends NodeWithModifier {

    private static final int VAR_INIT_TYPE = HaxeParser.VAR_INIT;
    private static final int TYPE_TAG_TYPE = HaxeParser.TYPE_TAG;
	/** The name with type. */
	private String nameWithType = "";
    private boolean declaredWithoutType = false;
    protected DeclarationType declType  = DeclarationType.VarDeclaration;
    
    public enum DeclarationType
    {
        ClassVarDeclaration,// Class variable
        FunctionParameter,  // function parameter
        VarDeclaration      // other then class var declarations
    };

	/**
	 * Gets the name with type.
	 * 
	 * @return the name with type
	 */
	public String getNameWithType() {
		if (this.nameWithType.equals("")) {
			this.nameWithType = getText() + " : "
					+ getHaxeType().getShortTypeName();
		}
		return this.nameWithType;
	}

	public VarDeclarationNode(final int ttype, final Token token)
	{
	    this(token);
	}

	public VarDeclarationNode(final Token token) 
	{
	    this.token = token;
    }

	/**
	 * Returns node correspond for var name (in var tmp:Int = foo+bar; it will
	 * return "tmp").
	 * 
	 * @return the var name
	 */
	public String getText() {
		return getToken().getText();
	}
    
    public boolean isDeclaredWithoutType()
    {
        return declaredWithoutType;
    }
    
    public void setDeclaratonType(DeclarationType type)
    {
        declType = type;
    }
	
	public DeclarationType getDeclaratonType()
	{
	    return declType;
	}
	
	public void updateInfo()
	{
	    tryExtractType();
	    updateModifier();
	}
	
	private void tryExtractType()
	{
	    for (HaxeTree tree : getChildren()) 
	    {
            if (tree.getToken().getType() == TYPE_TAG_TYPE
                    && tree.getChildCount() != 0) 
            {
                String typeName = tree.getChild(0).getText();
                HaxeType primatyType = PrimaryHaxeType.tryGetPrimaryType(typeName);
                haxeType = primatyType != null
                        ? primatyType
                        : new HaxeType(typeName);
                break;
            }
            declaredWithoutType = true;
        }
	}

	public HaxeTree getInitializationNode() 
	{
		for (HaxeTree tree : getChildren()) 
		{
			Token token = (CommonToken) tree.getToken();
			if (token.getType() == VAR_INIT_TYPE) 
			{
				return tree.getChild(0);
			}
		}
		return null;
	}
}
