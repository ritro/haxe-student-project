package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.tree.utils.HaxeType;
import haxe.tree.utils.PrimaryHaxeType;

import org.antlr.runtime.Token;

public class ConstantNode extends HaxeTree {
	
	/** The var type. */
	private HaxeType haxeType = PrimaryHaxeType.haxeUndefined;

	/**
	 * Sets the var type.
	 * 
	 * @param varType
	 *            the varType to set
	 */
	public boolean setHaxeType(final HaxeType varType) {
		this.haxeType = varType;
		return true;
	}
	
	/**
	 * Gets the var type.
	 * 
	 * @return the varType
	 */
	public HaxeType getHaxeType() {
		return this.haxeType;
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param t
	 *            the t
	 */
	public ConstantNode(final Token t) {
		this.token = t;
	}
	
	/**
	 * Get Node by index
	 * @return Node at required deph or null if index is greater than max deph
	 */
	public HaxeTree getNodePart(int i){
		int lenth = this.getAllChildren().size();
		return (lenth>i)? this.getAllChildren().get(lenth-1 - i): null;
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param t
	 *            the t
	 * @param varType
	 *            the var type
	 */
	public ConstantNode(final int ttype, final Token t, final String varType) {
		this.token = t;
		if (varType.equalsIgnoreCase("INT")) {
			setHaxeType(PrimaryHaxeType.haxeInt);
		} else if (varType.equalsIgnoreCase("FLOAT")) {
			setHaxeType(PrimaryHaxeType.haxeFloat);
		} else if (varType.equalsIgnoreCase("STRING")) {
			setHaxeType(PrimaryHaxeType.haxeString);
		} else if (varType.equalsIgnoreCase("VOID")) {
			setHaxeType(PrimaryHaxeType.haxeVoid);
		} else if (varType.equalsIgnoreCase("BOOL")) {
			setHaxeType(PrimaryHaxeType.haxeBool);
		} else if (varType.equalsIgnoreCase("DYNAMIC")) {
			setHaxeType(PrimaryHaxeType.haxeDynamic);
		} else if (varType.equalsIgnoreCase("Unknown<0>")){
			setHaxeType(PrimaryHaxeType.haxeUnknown);
		}else{
			setHaxeType(PrimaryHaxeType.haxeUndefined);
		}
	}
	
	public ConstantNode getClone() {
		ConstantNode varUsage = new ConstantNode(this.getToken());
		varUsage.setHaxeType(this.getHaxeType());
		return varUsage;
	}
}
