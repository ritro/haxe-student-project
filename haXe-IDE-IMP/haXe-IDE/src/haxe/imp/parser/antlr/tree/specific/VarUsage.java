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

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class VarUsage extends HaxeTree {
	
	private HaxeType haxeType = HaxeType.haxeNotYetRecognized;

	/**
	 * Sets the var type.
	 * 
	 * @param varType
	 *            the varType to set
	 */
	@Override
	public boolean setHaxeType(final HaxeType varType) {
		this.haxeType = varType;
		return true;
	}
	
	/**
	 * Gets the var type.
	 * 
	 * @return the varType
	 */
	@Override
	public HaxeType getHaxeType() {
		return this.haxeType;
	}
	
	@Override
	public void printTree(){
		System.out.println("VarUsage"+ "(name=" +this.getText()+")" +
				"{"+getHaxeType().getTypeName()+'}');
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param t
	 *            the t
	 */
	public VarUsage(final Token t) {
		this.token = t;
	}
	
	/**
	 * 
	 * @return if getText != null then getText, else lastchild.getText
	 */
	@Override
	public String getText() {
		if (this.getChildCount() == 0) 
			return super.getText();
		
		return this.getChild(0).getText();//.getAllChildren().get(this.getAllChildren().size()-1)
	}
	
	/**
	 * Get Node by index
	 * @return Node at required deph or null if index is greater than max deph
	 */
	public HaxeTree getNodePart(int i){
		int lenth = this.getAllChildren().size();
		return (lenth>i)? this.getAllChildren().get(lenth-1 - i): null;
	}

	public VarUsage(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
	}
	

	/**
	 * Gets the clone.
	 * 
	 * @return the clone
	 */
	public VarUsage getClone() {
		VarUsage varUsage = new VarUsage(this.getToken());
		varUsage.setHaxeType(this.getHaxeType());
		varUsage.addChild(this.getChild(0));
		return varUsage;
	}

	/**
	 * Gets the text with type.
	 * 
	 * @return the text with type
	 */
	public String getTextWithType() {
		if (this.getParent() instanceof FunctionNode) {
			return ((FunctionNode) this.getParent())
					.getFullNameWithParameters();
		}
		return this.getText() + " : " + this.getHaxeType().getTypeName();
	}
	
	@Override
	public void calculateScopes(final BlockScopeNode blockScope){
		if (getHaxeType().equals(HaxeType.haxeNotYetRecognized)) {
			if (!isAuxiliary()){					
				if (blockScope.doScopeContainsVarName(getText())) {
					setHaxeType(blockScope.getVarType(getText()));
				} else {
					//try find class or enum declaration
					this.commitError(getText()+ " is not declared");
					return;
				}
			}
			else{ 
				HaxeTree y = getChild(0).getDeclarationNode(getChild(0));
				//simple identifier
				if (getChild(0).getChildCount()==0){
					if (blockScope.doScopeContainsVarName(getText())) {
						setHaxeType(blockScope.getVarType(getText()));
					} else if (y.getType() != 0){
						setHaxeType(y.getHaxeType());
					} else {
						this.commitError(getText()
								+ " is not declared", getMostLeftPosition(),
								getMostRightPosition()-getMostLeftPosition());
						return;
					}}
				else{
					//TODO здесь искать по пакетам, параметрам других классов и тп
					this.commitError(getText()+ " can't yet define Those", 
							getMostLeftPosition(),
							getMostRightPosition()-getMostLeftPosition());
					return;
				}
			}
		}
	}

}
