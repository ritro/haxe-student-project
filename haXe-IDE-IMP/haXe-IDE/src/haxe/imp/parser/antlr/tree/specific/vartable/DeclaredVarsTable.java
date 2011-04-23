package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.ScopeVarDeclNode.VarType;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;

public class DeclaredVarsTable{

	private ArrayList<ScopeVarDeclNode> declaredVars = new ArrayList<ScopeVarDeclNode>();
	
	public ArrayList<ScopeVarDeclNode> getDeclaredVars() {
		return declaredVars;
	}
	
	public boolean ifVarExists(ScopeVarDeclNode var){
		for (ScopeVarDeclNode tree: declaredVars){
			if (tree.getToken().equals(var.getToken()))
				break; //looking for the previous vars with the same text
			if (tree instanceof ScopeFunDeclNode) {
				if (var.getText().equals(((ScopeFunDeclNode)tree).getText()) &&
					//FIXME && parametres equals... ??
					!var.getToken().equals(((ScopeFunDeclNode)tree).getToken()))
					return false; //another var with the same name
			} else
			if (!(tree instanceof ScopeVarUseNode)){
				if (var.getText().equals(tree.getText()) &&
					var.getDeclType().equals(tree.getDeclType()) && //now just for param-decl override
						//&& parametres equals... && blockscope mark equals
					!var.getToken().equals(tree.getToken()))
						return false; //another var with the same name
			} 
		}
		return true;
	}
	
	public ScopeVarDeclNode findDeclaredVar(CommonToken token){
		for (ScopeVarDeclNode x: getDeclaredVars())
			if (x.getToken().equals(token))
				return x;
		return null;
	}

	/**
	 * Sets the declared vars.
	 * 
	 * @param declaredVars
	 *            the declaredVars to set
	 */
	public void setDeclaredVars(final ArrayList<ScopeVarDeclNode> declaredVars) {
		declaredVars.clear();
		addAll(declaredVars);
	}
	
	public void addToDeclaredVars(final ScopeVarDeclNode declaredVar){
		/*for (ScopeVarDeclNode x : declaredVars)
			if (x instanceof ScopeVarDeclNode &&
				x.getName().equals(declaredVar.getName())){
				declaredVars.remove(x);
				break;
			}*/
		declaredVars.add(declaredVar);
	}
	
	public void addToDeclaredVars(final ScopeFunDeclNode declaredVar){
		declaredVars.add(declaredVar);
	}
	
	public void addToDeclaredVars(final ScopeVarUseNode declaredVar){
		declaredVars.add(declaredVar);
	}

	public boolean addAll(ArrayList<ScopeVarDeclNode> vars) {
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
		for (ScopeVarDeclNode tree : declaredVars) {
			if (tree instanceof ScopeFunDeclNode) {
				
			} else
			if (tree instanceof ScopeVarUseNode){
				
			} else
			if (tree instanceof ScopeVarDeclNode){
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
				return ((ScopeVarDeclNode) usage).getHaxeType();
			}
		}
		return HaxeType.haxeUndefined;
	}
	
	public void print(){
		for (ScopeVarDeclNode x: declaredVars)
			x.printTree();
	}
}
