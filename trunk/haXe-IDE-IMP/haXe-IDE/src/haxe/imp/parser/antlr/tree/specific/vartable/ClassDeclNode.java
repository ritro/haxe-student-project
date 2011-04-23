package haxe.imp.parser.antlr.tree.specific.vartable;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.eclipse.core.internal.resources.AliasManager.AddToCollectionDoit;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

public class ClassDeclNode extends VarDeclNode {
	
	DeclaredVarsTable varTable = new DeclaredVarsTable();

	public DeclaredVarsTable getVarTable() {
		return varTable;
	}

	public void setVarTable(DeclaredVarsTable varTable) {
		this.varTable = varTable;
	}

	public void addAllToDeclaredVars(DeclaredVarsTable list) {
		this.varTable.addAll(list);
	}
	
	public ClassDeclNode(CommonToken token, CommonToken blockScope) {
		super(token,blockScope);
	}
	
	public void addToDeclaredVars(VarDeclNode declaredVar){
		varTable.addToDeclaredVars(declaredVar);
	}
	
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);
		for (VarDeclNode x: varTable.getDeclaredVars())
			if (x.getScopeToken().equals(this.getScopeToken()))
				x.accept(visitor);
		visitor.endVisit(this);
	}

	@Override
	public void printTree(){
		System.out.println("ClassDecl"+"Name: " + getText());
		for (VarDeclNode x: varTable.getDeclaredVars()){
			System.out.print("     ");
			x.printTree();
		}
	}

}
