package haxe.imp.parser.antlr.tree.specific.vartable;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

public class VarUse extends VarDeclaration
{

    private ArrayList<HaxeTree> fullName;
    private VarDeclaration assignment = null;
    private String unarOperator = null;
    
    //FIXME thing about better names after struct 
    //will be proved to work
    public enum OperatorClasses
    {
        IncrDecr,   //++ --
        Logic       //! 
    }

    /* (non-Javadoc)
     * @see haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration#getText()
     * It will return name like 'Name' if it was simple
     * and 'Name.Name2.Name3" if it was auxiliary.
     */
    @Override
    public String getText()
    {
        if (fullName.size() == 1)
        {
            return fullName.get(0).getText();
        }
        
        String name = "";
        for (HaxeTree i : fullName)
        {
            name += i.getText() + ".";
        }
        return name.substring(0, name.length() - 1);
    }

    public VarDeclaration getAssignExpr()
    {
        return assignment;
    }

    public String getUnarOperator()
    {
        return unarOperator;
    }

    public void setAssignExpr(VarDeclaration assignment)
    {
        this.assignment = assignment;
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
    public VarUse(ArrayList<HaxeTree> name, CommonToken token)
    {
        super(token);
        fullName = name;
        declType = VarType.VarUsage;
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
