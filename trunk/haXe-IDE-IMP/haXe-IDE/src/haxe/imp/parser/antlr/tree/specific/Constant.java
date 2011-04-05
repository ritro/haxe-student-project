package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.utils.HaxeType;

import org.antlr.runtime.Token;

public class Constant extends HaxeTree {
	
	/** The var type. */
	private HaxeType haxeType = HaxeType.haxeNotYetRecognized;

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
	
	@Override
	public void printTree(){
		System.out.println("Const"+"(name="+this.getText() +")"
				+"{"+getHaxeType().getTypeName()+'}');
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param t
	 *            the t
	 */
	public Constant(final Token t) {
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
	public Constant(final int ttype, final Token t, final String varType) {
		this.token = t;
		if (varType.equals("INT")) {
			this.setHaxeType(HaxeType.haxeInt);
		} else if (varType.equals("FLOAT")) {
			this.setHaxeType(HaxeType.haxeFloat);
		} else if (varType.equals("STRING")) {
			this.setHaxeType(HaxeType.haxeString);
		} else if (varType.equals("VOID")) {
			this.setHaxeType(HaxeType.haxeVoid);
		} else if (varType.equals("BOOL")) {
			this.setHaxeType(HaxeType.haxeBool);
		} else if (varType.equals("DYNAMIC")) {
			this.setHaxeType(HaxeType.haxeDynamic);
		} else if (varType.equals("Unknown<0>")){
			this.setHaxeType(HaxeType.haxeUnknown);
		}else{
			this.setHaxeType(HaxeType.haxeUndefined);
		}
	}

	public Constant(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
	}
	
	public Constant getClone() {
		Constant varUsage = new Constant(this.getToken());
		varUsage.setHaxeType(this.getHaxeType());
		return varUsage;
	}

}
