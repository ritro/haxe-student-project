package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclNode.VarType;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;

public class DeclaredVarsTable{

	private ArrayList<VarDeclNode> declaredVars = new ArrayList<VarDeclNode>();
	
	public ArrayList<VarDeclNode> getDeclaredVars() {
		return declaredVars;
	}
	
	public boolean ifVarExists(VarDeclNode var){
		for (VarDeclNode tree: declaredVars){
			if (tree.getToken().equals(var.getToken()))
				break; //looking for the previous vars with the same text
			if (tree instanceof FunctionDeclNode) {
				if (var.getText().equals(((FunctionDeclNode)tree).getText()) &&
					//FIXME && parametres equals... ??
					!var.getToken().equals(((FunctionDeclNode)tree).getToken()))
					return true; //another var with the same name
			} else
			if (!(tree instanceof VarUseNode)){
				if (var.getText().equals(tree.getText()) &&
					var.getDeclType().equals(tree.getDeclType()) && //now just for param-decl override
						//&& parametres equals... && blockscope mark equals
					!var.getToken().equals(tree.getToken()))
						return true; //another var with the same name
			} 
		}
		return false;
	}	
	
	public VarDeclNode findDeclaredVar(CommonToken declToken){
		for (VarDeclNode x: getDeclaredVars())
			if (x.getToken().equals(declToken))
				return x;
		for (VarDeclNode x: getDeclaredVars())
			if (x instanceof ClassDeclNode)
				return x.getDeclaredVars().findDeclaredVar(declToken);
		return null;
	}
	/*
	public VarDeclNode findDeclaredVar(String name, CommonToken blockScopeToken){
		for (VarDeclNode x: getDeclaredVars())
			if (x.getScopeToken().equals(blockScopeToken))
				return x;
		for (VarDeclNode x: getDeclaredVars())
			if (x instanceof ClassDeclNode)
				return x.getDeclaredVars().findDeclaredVar(token);
		return null;
	}*/
	
	public void setDeclaredVarType(String name, CommonToken blockScope, HaxeType type){
		for (VarDeclNode x: getDeclaredVars()){
			if (x.getDeclType() != VarType.ClassVarDecl &&
				x.getScopeToken().equals(blockScope) &&
				x.getText().equals(name))
				x.setHaxeType(type);
		}
	}

	/**
	 * Sets the declared vars.
	 * 
	 * @param declaredVars
	 *            the declaredVars to set
	 */
	public void setDeclaredVars(final ArrayList<VarDeclNode> declaredVars) {
		declaredVars.clear();
		addAll(declaredVars);
	}
	
	public void addToDeclaredVars(final VarDeclNode declaredVar){
		declaredVars.add(declaredVar);
	}
	
	public void addToDeclaredVars(final FunctionDeclNode declaredVar){
		declaredVars.add(declaredVar);
	}
	
	public void addToDeclaredVars(final VarUseNode declaredVar){
		declaredVars.add(declaredVar);
	}

	public boolean addAll(ArrayList<VarDeclNode> vars) {
		if (vars != null && !vars.isEmpty())
			return declaredVars.addAll(vars);
		else return false;
	}
	
	public boolean addAll(DeclaredVarsTable vars) {
		if (!vars.getDeclaredVars().isEmpty())
			return declaredVars.addAll(vars.getDeclaredVars());
		else return false;
	}
	
	private boolean ifUndefinedExist(){
		for (VarDeclNode tree : declaredVars) {
			if (tree.getHaxeType().equals(HaxeType.haxeUndefined))
				return true;
		}
		return false;
	}
	
	public void calculateTypes(){
		for (VarDeclNode tree : declaredVars) {
			if (tree instanceof FunctionDeclNode) {
				FunctionDeclNode fdn = (FunctionDeclNode)tree;
				if (fdn.ifUndefinedType()){
					fdn.setHaxeType(HaxeType.haxeVoid);
				} else if (fdn.getReturnNode() == null){
					fdn.commitNullReturnError();
				} else {
					//check if right return type	
				}
			} else if (tree instanceof ClassDeclNode){
				
			} else if (tree instanceof VarUseNode){
				VarUseNode vun = (VarUseNode)tree;
				if (vun.getAssignExpr() != null &&
					!vun.getAssignExpr().ifUndefinedType()){
					if (vun.ifUndefinedType()){
						vun.setHaxeType(vun.getAssignExpr().getHaxeType());
					} else if (!HaxeType.isAvailableAssignement(vun.getHaxeType(), 
									vun.getAssignExpr().getHaxeType())){
						vun.commitAssignmentError();
					}
				} else if (vun.getAssignExpr() == null)
				{
					
				}	
			} else if (tree.getDeclType() == VarType.ClassVarDecl &&
						tree.ifUndefinedType())
				tree.commitError("Class var should have type");
		}
	}		

	/**
	 * Return type of var as it stores in scope.
	 * 
	 * @param varName
	 *            the var name
	 * @return the var in scope type
	 */
	public HaxeType getVarType(final String varName) {
		for (HaxeTree usage : this.declaredVars) {
			if (usage.getText().equals(varName)) {
				return ((VarDeclNode) usage).getHaxeType();
			}
		}
		return HaxeType.haxeUndefined;
	}
	
	public void print(){
		for (VarDeclNode x: declaredVars)
			x.printTree();
	}
}
