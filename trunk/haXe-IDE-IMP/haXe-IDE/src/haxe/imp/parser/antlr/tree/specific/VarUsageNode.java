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

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.utils.HaxeType;

import org.antlr.runtime.Token;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class VarUsageNode extends HaxeTree {

    private HaxeTree declaration = null;
    
	/**
	 * Sets type to declaration of that variable
	 * and all it's entries.
	 * @param varType - the varType to set
	 */
    @Override
	public boolean setHaxeType(final HaxeType varType) 
	{
	    return declaration.setHaxeType(varType);
	}
	
	@Override
	public HaxeType getHaxeType()
	{
	    if (declaration == null)
	    {
	        return super.getHaxeType();
	    }
	    return declaration.getHaxeType();
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param t
	 *            the t
	 */
	public VarUsageNode(final Token t) {
		token = t;
	}
	
	/**
	 * 
	 * @return if getText != null then getText, else lastchild.getText
	 */
	@Override
	public String getText() 
	{
		//FIXME
		if (getChildCount() == 0) 
			return super.getText();
		
		return getAllChildren().get(this.getAllChildren().size()-1).getText();
	}
	
	/**
	 * Get Node by index
	 * @return Node at required deph or null if index is greater than max deph
	 */
	public HaxeTree getNodePart(int i){
		int lenth = this.getAllChildren().size();
		return (lenth>i)? this.getAllChildren().get(lenth-1 - i): null;
	}

	public VarUsageNode(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
	}
	
	@Override
	public void calculateScopes(Environment declarations)
	{
	    declaration = declarations.getDeclaration(getText());
	    if (declaration == null)
	    {
	        //FIXME packets, classes, else?
	        commitUndeclaredError();
	        return;
	    }
	    
	    setDeclarationNode(declaration);
	}
	
	public HaxeTree getDeclarationNode()
	{
	    return declaration;
	}
	
	public void setDeclarationNode(HaxeTree declaration)
	{
	    this.declaration = declaration; 
	}

    /**
     * Error then user variable wan't declared before.
     */
    public void commitUndeclaredError()
    {
        commitError(getText() + " is not declared.");
    }
    
    /**
     * Error when we using defined, but not initialized
     * variable.
     * Official Haxe  error text used.
     */
    public void commitUninitializedUsingError()
    {
        commitError(
                "Local variable " 
                + getText() 
                + " used without being initialized");
    }
}
