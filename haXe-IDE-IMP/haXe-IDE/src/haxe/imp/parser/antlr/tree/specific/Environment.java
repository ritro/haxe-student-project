package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode.DeclarationType;

import java.util.ArrayList;

/**
 * List of declarations valid in the current scope
 * with extended functionality to easier work with
 * extending environment or restoring it's old state.
 * @author Savenko Maria
 *
 */
public class Environment extends ArrayList<HaxeTree>
{
    private static final long serialVersionUID = -567500510015429577L;

    /**
     * Creates new empty Environment.
     */
    public Environment()
    {
        super();
    }
    
    /**
     * Creates new empty Environment and copies
     * all declarations from parameter to that
     * new instance.
     * @param environment - declarations, which
     * will be copied to the new invironment.
     */
    public Environment(Environment environment)
    {
        this();
        addAll(environment);
    }
    
    /**
     * Adds the declaration to the copy of current 
     * environment, not to the current one.
     * @param declaration which should be inserted
     * into the environment.
     * @return Copy of current environment with the
     * inserted new declaration into it.
     */
    public Environment addToCopy(HaxeTree declaration)
    {
        Environment env = new Environment(this);
        env.add(declaration);
        return env;
    }
    
    /**
     * Adds declarations to the copy of current 
     * environment, not to the current one.
     * @param declarations which should be inserted
     * into the environment.
     * @return Copy of current environment with the
     * inserted new declarations into it.
     */
    public Environment addAllToCopy(ArrayList<HaxeTree> declarations)
    {
        Environment env = new Environment(this);
        for (HaxeTree node : declarations)
        {
            env.add(node);
        }
        return env;
    }
    
    public boolean add(HaxeTree declaration, boolean reportErrors)
    {
        HaxeTree decl = getDeclaration(declaration.getText());
        if (decl == null)
        {
            return super.add(declaration);
        }
        if (decl instanceof VarDeclarationNode)
        {
            DeclarationType foundType = 
                    ((VarDeclarationNode)decl).getDeclaratonType();
            DeclarationType addType = 
                    ((VarDeclarationNode)declaration).getDeclaratonType();
            if (foundType == addType)
            {
                if (reportErrors)
                {
                    ((VarDeclarationNode)declaration).commitVarAlreadyDeclaredTypeError();
                }
                return false;
            }
            remove(decl);
            return super.add(declaration);
        }
        // classes and function could not be overlaid
        // instead of implementing - TODO
        if (reportErrors)
        {
            declaration.commitError("Alredy exists");
        }
        return false;
    }
    
    @Override
    public boolean add(HaxeTree declaration)
    {
        return add(declaration, true);
    }
    
    /**
     * Checks environment for containing a declarations
     * with a special name.
     * @param declarationName - name to look for.
     * @return True if such declaration was found.
     */
    private boolean contatins(String declarationName)
    {
        for (HaxeTree declaration : this)
        {
            if (declaration.getText().equals(declarationName))
            {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Removes declaration from current table by it's name
     * if there was such declaration.
     * @param declarationName - declaration to look for.
     */
    public void remove(String declarationName)
    {
        for (HaxeTree declaration : this)
        {
            if (declaration.getText().equals(declarationName))
            {
                remove(declaration);
            }
        }
    }
    
    /**
     * Searching for declaration with certain name.
     * @param variableName - name by which declaration will
     * be searched.
     * @return Declaration searched for, or null if nothing
     * was found.
     */
    public HaxeTree getDeclaration(String variableName)
    {
        //TODO: can class and variable have same names?
        for (HaxeTree decl : this)
        {
            if (decl.getText().equals(variableName))
            {
                return decl;
            }
        }
        return null;
    }
    
    /**
     * Search for variables declarations exclusively.
     * @param variableName - declaration to search for.
     * @return found declaration or null if nothing found.
     */
    public VarDeclarationNode getVarDeclaration(String variableName)
    {
        //no need to search for last - in the current
        //environment there can be only one decl per name
        for (HaxeTree decl : this)
        {
            if (!(decl instanceof VarDeclarationNode))
            {
                continue;
            }
            if (decl.getText() == variableName)
            {
                return (VarDeclarationNode)decl;
            }
        }
        return null;
    }
}
