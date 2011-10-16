package haxe.imp.parser.antlr.tree.specific.vartable;

import org.antlr.runtime.CommonToken;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

public class VarUse extends VarDeclaration
{

    private HaxeTree       fullName;
    private VarDeclaration assignment = null;

    @Override
    public String getText()
    {
        return fullName.getText();
    }

    public VarDeclaration getAssignExpr()
    {
        return assignment;
    }

    public void setAssignExpr(VarDeclaration assignment)
    {
        this.assignment = assignment;
    }

    public VarUse(HaxeTree name, CommonToken token, int varNumber) {
        super(token, varNumber);
        fullName = name;
    }

    /**
     * Creates var use with default variable number = 0.
     * This means that this variable is the same as in the very
     * first declaration of variable with such name.
     * 
     * @param Name
     * for variable - it can be complex, so just
     * copy necessary part of tree.
     * @param token
     */
    public VarUse(HaxeTree name, CommonToken token)
    {
        super(token);
        fullName = name;
    }

    public void commitIncorrectAssignmentError()
    {
        if (assignment.isNil()) return;
        assignment.commitError(assignment.getHaxeType() 
                + " should be "
                + this.getHaxeType().getTypeName());
    }

    public void commitUndeclaredError()
    {
        this.commitError(this.getText() + " is not declared.");
    }

    @Override
    public void printTree()
    {
        if (assignment != null)
        {
            System.out.println("Assignment");
            System.out.println("      Name: " + getText() + ", type: "
                    + getHaxeType().getTypeName() 
                    + ", Num: " + getVarNumber());
            System.out.print("      ");
            assignment.printTree();
        }
        else
        {
            System.out.println("UseNode: " + getText() + ", type: "
                    + getHaxeType().getTypeName() 
                    + ", Num: " + getVarNumber());
        }
    }

    @Override
    public void accept(final HaxeModelVisitor visitor)
    {}
}
