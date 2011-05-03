package haxe.imp.parser.antlr.tree.specific.vartable;

import org.antlr.runtime.CommonToken;

import haxe.imp.parser.antlr.tree.HaxeTree;

public class VarUse extends VarDeclaration {
	
	private HaxeTree fullName;
	private VarDeclaration assignment = null;

	@Override
	public String getText() {
		return fullName.getText();
	}
	
	public VarDeclaration getAssignExpr() {
		return assignment;
	}
	
	public void setAssignExpr(VarDeclaration assignment) {
		this.assignment = assignment;
	}
	
	public VarUse(HaxeTree name, CommonToken token,int varNumber) {
		super(token,varNumber);
		fullName = name;
	}
	
	public void commitAssignmentError(){
		if (assignment.isNil())
			return;
		assignment.commitError(assignment.getHaxeType() + " should be " + this.getHaxeType().getTypeName());
	}
	
	@Override
	public void printTree(){
		if (assignment != null){
			System.out.println("Assignment");
			System.out.println("      Name: " + getText() + ", type: "+ getHaxeType().getTypeName()+ 
	                ", Num: " + getVarNumber());
			System.out.print("      ");
			assignment.printTree();
		}
		else{
			System.out.println("UseNode: " + getText() + ", type: "+ getHaxeType().getTypeName()+ 
	                ", Num: " + getVarNumber());
		}
	}
}
