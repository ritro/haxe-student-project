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
					return false; //another var with the same name
			} else
			if (!(tree instanceof VarUseNode)){
				if (var.getText().equals(tree.getText()) &&
					var.getDeclType().equals(tree.getDeclType()) && //now just for param-decl override
						//&& parametres equals... && blockscope mark equals
					!var.getToken().equals(tree.getToken()))
						return false; //another var with the same name
			} 
		}
		return true;
	}
	
	public VarDeclNode findDeclaredVar(CommonToken token){
		for (VarDeclNode x: getDeclaredVars())
			if (x.getToken().equals(token))
				return x;
		for (VarDeclNode x: getDeclaredVars())
			if (x instanceof ClassDeclNode)
				return x.getDeclaredVars().findDeclaredVar(token);
		return null;
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
		/*for (ScopeVarDeclNode x : declaredVars)
			if (x instanceof ScopeVarDeclNode &&
				x.getName().equals(declaredVar.getName())){
				declaredVars.remove(x);
				break;
			}*/
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
	
	public void calculateTypes(){
		for (VarDeclNode tree : declaredVars) {
			if (tree instanceof FunctionDeclNode) {
				
			} else
			if (tree instanceof VarUseNode){
				
			} else
			if (tree instanceof VarDeclNode){
				if (tree.getDeclType() == VarType.ClassVarDecl &&
					tree.ifUndefinedType())
					tree.commitError("Class var should have type");
				//if (!checkUniqueOFDeclarations(tree))
				//	tree.commitError("Var is already declared");
			}
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
