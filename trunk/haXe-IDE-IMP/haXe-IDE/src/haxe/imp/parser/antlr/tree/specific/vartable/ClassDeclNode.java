package haxe.imp.parser.antlr.tree.specific.vartable;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.eclipse.core.internal.resources.AliasManager.AddToCollectionDoit;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclNode.VarType;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

public class ClassDeclNode extends VarDeclNode {
	
	public void setDeclaredVars(DeclaredVarsTable varTable) {
		this.declaredVars = varTable;
	}

	public void addAllToDeclaredVars(DeclaredVarsTable list) {
		this.declaredVars.addAll(list);
	}
	
	public void addToDeclaredVars(VarDeclNode declaredVar){
		declaredVars.addToDeclaredVars(declaredVar);
	}
	
	public ClassDeclNode(CommonToken token, CommonToken blockScope) {
		super(token,blockScope);
		declaredVars = new DeclaredVarsTable();
	}
	
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);
		for (VarDeclNode x: declaredVars.getDeclaredVars())
			if (x.getScopeToken().equals(this.getScopeToken()))
				x.accept(visitor);
		visitor.endVisit(this);
	}

	@Override
	public void printTree(){
		System.out.println("ClassDecl"+"Name: " + getText());
		for (VarDeclNode x: declaredVars.getDeclaredVars()){
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
