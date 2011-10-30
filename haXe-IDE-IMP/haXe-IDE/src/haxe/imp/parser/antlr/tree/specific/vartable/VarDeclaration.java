package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import org.antlr.runtime.CommonToken;

public class VarDeclaration extends HaxeTree
{
    
    public enum Modifiers
    {
        staticDeclaration,
        commonDeclaration
    }

    public enum VarType
    {
        ClassDeclaration,       // Class
        ClassVarDeclaration,    // Class var (cant set type)
        FunctionDeclaration,    // function
        FunctionParameter,  // function parameter
        VarDeclaration,     // other then classes var declarations
        VarUsage            // usages, assignes of vars
    };

    private HaxeType  haxeType  = HaxeType.haxeUndefined;
    protected VarType declType  = VarType.VarDeclaration;
    private int       varNumber = 0;

    public VarType getDeclType()
    {
        return declType;
    }

    /**
     * VarNumber is inner value for identifying variables
     * with the same name but declared in different hierarchy types.
     * And as a result they are actually different variables.
     * 
     * @return Current declared var number.
     */
    public int getVarNumber()
    {
        return varNumber;
    }

    /**
     * By default all variables numbers are 0 - which means
     * that variable was declared only once. And this declaration
     * is that one first declaration.
     * 
     * @param Number
     * to replace current variable number.
     */
    public void setVarNumber(int varNumber)
    {
        this.varNumber = varNumber;
    }

    @Override
    public String getText()
    {
        return super.getText();
    }

    @Override
    public HaxeType getHaxeType()
    {
        return haxeType;
    }

    public void setVarType(final VarType varType)
    {
        this.declType = varType;
    }

    @Override
    public boolean setHaxeType(final HaxeType varType)
    {
        haxeType = varType;
        return true;
    }

    public String getNameWithType()
    {
        return getText() + " : " + this.getHaxeType().getTypeName();
    }

    /**
     * Creates var declaration with custom variable number.
     * 
     * @param token
     * @param Variable number 
     * which will show that this declaration
     * is not the first for variable with such name.
     */
    public VarDeclaration(CommonToken token, int varNumber) {
        super(token);
        setVarNumber(varNumber);
    }

    /**
     * Creates Var Declaration with default variable number 0.
     * 
     * @param token
     */
    public VarDeclaration(CommonToken token)
    {
        super(token);
    }

    /**
     * Creates Var Declaration from Declaration Node
     * with default variable number 0.
     * 
     * @param token
     */
    public VarDeclaration(VarDeclarationNode vd) 
    {
        super(vd.getVarNameNode().getToken());
        setVarNumber(0);
        try
        {
            for (HaxeTree tree : this.getChildren())
            {
                if (tree.getToken().getType() == TYPE_TAG_TYPE)
                {
                    setHaxeType(
                            (HaxeType.tryGetPrimaryType(tree.getChild(0)
                                    .getText()) != null) ?
                                    HaxeType.tryGetPrimaryType(tree.getChild(0)
                                            .getText()) :
                                    new HaxeType(tree.getChild(0).getText()));
                    break;
                }
            }
        }
        catch (NullPointerException nullPointerException)
        {
            System.out.println("Problems on getting varType");
        }
        /*
         * HaxeTree varInitNode = this.getVAR_INIT_NODE();
         * if (varInitNode != null) {
         * if (varInitNode.getChildCount() > 0) {
         * for (HaxeTree tree : varInitNode.getChildren()) {
         * tree.calculateScopes(blockScope); } } }
         */
    }

    public VarDeclaration(VarType type, CommonToken token, int varNumber) {
        super(token);
        setVarNumber(varNumber);
        this.declType = type;
    }

    /**
     * Class var declaration should have type.
     */
    public void commitClassUndefinedTypeError()
    {
        this.commitError("Class var declaration should have type.");
    }
    
    /**
     * Var is already declared.
     */
    public void commitVarAlreadyDeclaredTypeError()
    {
        this.commitError("Var is already declared");
    }

    /**
     * Returned value doesn't match function value.
     */
    public void commitIncorrectReturnTypeError()
    {
        this.commitError("Returned value doesn't match function value.");
    }

    @Override
    public boolean ifUndefinedType()
    {
        return haxeType.equals(HaxeType.haxeUndefined);
    }

    /**
     * Creating class outline
     */
    @Override
    public void accept(final HaxeModelVisitor visitor)
    {
        if (this.getDeclType().equals(VarType.ClassDeclaration))
        {
            visitor.visit(this);
            visitor.endVisit(this);
        }
    }

    public String getTextWithType()
    {
        if (this.getDeclType() == VarType.FunctionParameter)
        {
            return "some function param-not impelemented";
        }
        return this.getText() + " : " + this.getHaxeType().getTypeName();
    }
}
