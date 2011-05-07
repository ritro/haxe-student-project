package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import org.antlr.runtime.CommonToken;

public class VarDeclaration extends HaxeTree {
	
	public enum VarType {ClassVarDecl, FunctionVarDecl, FunctionParam, NotDefined};
	private HaxeType haxeType = HaxeType.haxeUndefined;
	private VarType declType = VarType.NotDefined;
	private int varNumber = 0;

	public VarType getDeclType() {
		return declType;
	}
	
	public int getVarNumber(){
        return varNumber;
    }
	
	public void setVarNumber(int varNumber){
        this.varNumber = varNumber;
    }

	@Override
	public String getText(){
		return super.getText();
	}
	
	@Override
	public HaxeType getHaxeType() {
		return haxeType;
	}
	
	public void setVarType(final VarType varType) {
		this.declType = varType;
	}
	
	@Override
	public boolean setHaxeType(final HaxeType varType) {
		this.haxeType = varType;
		return true;
	}
	
	public String getNameWithType() {
		return this.getText() + " : " + this.getHaxeType().getTypeName();
	}

	public VarDeclaration(CommonToken token, int varNumber) {
		super(token);
		setVarNumber(varNumber);
	}
	
	public VarDeclaration(VarDeclarationNode vd, int varNumber){
		super(vd.getVarNameNode().getToken());	
		setVarNumber(varNumber);
		try {
			for (HaxeTree tree : this.getChildren()) {
				if ( tree.getToken().getType() == TYPE_TAG_TYPE) {
					this.setHaxeType(
							(HaxeType.tryGetPrimaryType(tree.getChild(0).getText()) != null)?
							HaxeType.tryGetPrimaryType(tree.getChild(0).getText()) :
							new HaxeType(tree.getChild(0).getText()));
					break;
				}
			}
		} catch (NullPointerException nullPointerException) {
			System.out.println("Problems on getting varType");
		}
		/*
		HaxeTree varInitNode = this.getVAR_INIT_NODE();
		if (varInitNode != null) {
			if (varInitNode.getChildCount() > 0) {
				for (HaxeTree tree : varInitNode.getChildren()) {
					tree.calculateScopes(blockScope);
				}
			}
		}*/
	}
	
	public VarDeclaration(VarType type, CommonToken token,int varNumber) {
		super(token);
		setVarNumber(varNumber);
		this.declType = type;
	}
    
    public void commitClassUndefinedTypeError(){
        this.commitError("Class var declaration should have type.");
    }
    
    public void commitIncorrectReturnTypeError(){
        this.commitError("Returned value doesn't match function value.");
    }

    public boolean ifUndefinedType(){
        return this.getHaxeType().equals(HaxeType.haxeUndefined);
    }
	
	@Override
	public void printTree(){
		System.out.println("DeclNode: " + getText() + ", type: "+ getHaxeType().getTypeName() + 
		        ", Num: " + this.getVarNumber());
	}
	
	/**
	 * Creating class outline
	 */
	@Override
	public void accept(final HaxeModelVisitor visitor){
	    if (this.getDeclType().equals(VarType.ClassVarDecl)){
    		visitor.visit(this);
    		visitor.endVisit(this);
	    }
	}

	public String getTextWithType() {
		if (this.getDeclType() == VarType.FunctionParam) {
			return "some function param-not impelemented";
		}
		return this.getText() + " : " + this.getHaxeType().getTypeName();
	}
}
