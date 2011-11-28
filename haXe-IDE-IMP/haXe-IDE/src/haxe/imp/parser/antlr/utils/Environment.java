package haxe.imp.parser.antlr.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode.DeclarationType;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * List of declarations valid in the current scope
 * with extended functionality to easier work with
 * extending environment or restoring it's old state.
 * @author Savenko Maria
 *
 */
public class Environment extends HashMap<String, HaxeTree>
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
        putAll(environment);
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
        env.put(declaration);
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
            env.put(node);
        }
        return env;
    }
    
    public boolean put(HaxeTree declaration, boolean reportErrors)
    {
        String name = declaration.getText();
        HaxeTree decl = get(name);
        if (decl == null)
        {
            super.put(name, declaration);
            return true;
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
            super.put(name, declaration);
            return true;
        }
        // classes and function could not be overlaid
        // instead of implementing - TODO
        if (reportErrors)
        {
            declaration.commitError("Alredy exists");
        }
        return false;
    }
    
    public boolean put(HaxeTree declaration)
    {
        return put(declaration, true);
    }
    
    public FunctionNode getLastFunction()
    {
        HaxeTree[] values = (HaxeTree[]) values().toArray();
        int size = values.length;
        for (int i = size - 1; i >= 0; i--)
        {
            HaxeTree node = values[i];
            if (node instanceof FunctionNode)
            {
                return (FunctionNode)node;
            }
        }
        
        return null;
    }
}
