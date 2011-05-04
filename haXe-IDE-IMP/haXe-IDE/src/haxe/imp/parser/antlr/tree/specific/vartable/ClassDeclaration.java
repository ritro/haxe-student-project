package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import org.antlr.runtime.CommonToken;

public class ClassDeclaration extends VarDeclaration {
	
	public void setDeclaredVars(DeclaredVarsTable varTable) {
		this.declaredVars = varTable;
	}

	public void addAllToDeclaredVars(DeclaredVarsTable list) {
		this.declaredVars.addAll(list);
	}
	
	public void addToDeclaredVars(VarDeclaration declaredVar){
		declaredVars.addToDeclaredVars(declaredVar);
	}
	
	public ClassDeclaration(CommonToken token, int varNumber) {
		super(token,varNumber);
		declaredVars = new DeclaredVarsTable();
	}
	
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);
		for (VarDeclaration x: declaredVars.getDeclaredVars())
			x.accept(visitor);
		visitor.endVisit(this);
	}

	@Override
	public void printTree(){
		System.out.println("ClassDecl"+"Name: " + getText() +  ", Num: " + getVarNumber());
		for (VarDeclaration x: declaredVars.getDeclaredVars()){
			System.out.print("     ");
			x.printTree();
		}
	}
	
	@Override
	public void calculateTypes(){
		//while getDeclV.containdUndef...
		this.getDeclaredVars().calculateTypes();
	}

}
