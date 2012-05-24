package tree.utils;


import java.util.ArrayList;
import java.util.HashMap;

import tree.HaxeTree;
import tree.expression.Declaration;
import tree.expression.Declaration.DeclarationType;
import tree.specific.Function;

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
    
    public boolean put(HaxeTree declaration)
    {
        String name = declaration.getText();
        return putWithCustomName(name, declaration);
    }
    
    public boolean putWithCustomName(String name, HaxeTree declaration)
    {
        HaxeTree decl = get(name);
        if (decl == null)
        {
            super.put(name, declaration);
            return true;
        }
        if (decl instanceof Declaration)
        {
            DeclarationType foundType = 
                    ((Declaration)decl).getDeclaratonType();
            DeclarationType addType = 
                    ((Declaration)declaration).getDeclaratonType();
            if (foundType != addType ||
                    addType != DeclarationType.ClassVarDeclaration)
            {

                super.put(name, declaration);
                return true;
            }
        }
        
        declaration.setDuplicate(true);
        // classes and function could not be overlaid
        // instead of implementing - TODO - not here?
        return false;
    }
    
    public Function getLastFunction()
    {
        HaxeTree[] values = new HaxeTree[values().size()];
        values().toArray(values);
        int size = values.length;
        for (int i = size - 1; i >= 0; i--)
        {
            HaxeTree node = values[i];
            if (node instanceof Function)
            {
                return (Function)node;
            }
        }
        
        return null;
    }
}
