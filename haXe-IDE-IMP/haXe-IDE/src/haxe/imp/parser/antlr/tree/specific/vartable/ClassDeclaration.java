package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import org.antlr.runtime.CommonToken;
import org.eclipse.jdt.internal.core.CommitWorkingCopyOperation;

public class ClassDeclaration extends VarDeclaration 
{
    public ClassDeclaration(CommonToken token)
    {
        super(token);
    }
	
	/**
	 * Replaces the content's of classes Var Table with
	 * parameter.
	 * @param Var Table to replace the current var table.
	 */
	public void setDeclaredVars(DeclaredVarsTable varTable) {
		declaredVars = varTable;
	}

	/**
	 * Adds list's content to the classes Var Table.
	 * @param Var list.
	 */
	public void addAllToDeclaredVars(DeclaredVarsTable list) {
		declaredVars.addAll(list);
	}
	
	/**
	 * Adds declaration to the current var table.
	 * @param Declaration to add to the table.
	 */
	public void addToDeclaredVars(VarDeclaration declaredVar){
		declaredVars.add(declaredVar);
	}
	
	/**
	 * Creates new instance of Class Declaration.
	 * @param Token to present the class decl in program
	 * text. Contains offset and Class name.
	 * @param Number of declaration in the list.
	 */
	public ClassDeclaration(CommonToken token, int varNumber) {
		super(token,varNumber);
		declaredVars = new DeclaredVarsTable();
		declType = VarType.ClassDeclaration;
	}
	
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);
		for (VarDeclaration x: declaredVars)
			x.accept(visitor);
		visitor.endVisit(this);
	}
	
	@Override
	public void calculateTypes(){
		//while getDeclV.containdUndef...
		this.getDeclaredVars().calculateTypes();
	}

}
