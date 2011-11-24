package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.BlockScopeContainer;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.utils.Environment;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.Token;

public class EnumNode extends BlockScopeContainer {

	/** The class name. */
	private String enumName = "";

	/**
	 * Gets the class name.
	 * 
	 * @return the class name
	 */
	public String getEnumName() {
		if (this.enumName.equals("")) {
			this.enumName = this.getText();
		}
		return this.enumName;
	}
	
	/**
	 * Instantiates a new class node.
	 * 
	 * @param t
	 *            the t
	 */
	public EnumNode(final Token t) {
		super(t);
	}

	public HaxeTree getInherits() {
		for (HaxeTree tree : (ArrayList<HaxeTree>) this
				.getChildren()) {
			if (tree.getType() == HaxeParser.INHERIT_LIST_OPT) {
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
	public HaxeType getHaxeType(){
		//TODO????
		return HaxeType.haxeEnum;
	}

	/**
	 * Gets the all declared vars.
	 * 
	 * @return the all declared vars
	 */
	public ArrayList<HaxeTree> getAllMembers() {
		ArrayList<HaxeTree> list = new ArrayList<HaxeTree>();

		BlockScopeNode blockScope = getBlockScope();
		if (blockScope != null) 
		{
			for (HaxeTree x: blockScope.getChildren())
				if (x instanceof VarDeclarationNode)
					list.add(x);
		}
		return list;
	}
	
	@Override
	public void calculateScopes(Environment declarations) 
	{
		BlockScopeNode blockScope = getBlockScope();
		if (blockScope != null) {
			blockScope.calculateScopes(declarations);
		}
	}

}