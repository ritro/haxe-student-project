package haxe.imp.parser.antlr.tree.specific;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;

import haxe.imp.parser.antlr.tree.BlockScopeContainer;
import haxe.imp.parser.antlr.tree.HaxeTree;

public abstract class HaxeType extends BlockScopeContainer
{                
    protected boolean isHaxeLibType         = false;
    protected String fullName               = null;
    protected List<HaxeType> typeHierarchy  = null;

    public HaxeType(Token t) 
    {
        super(t);
        
        typeHierarchy = new ArrayList<HaxeType>();
    }
    
    public boolean isHaxeLibType()
    {
        return isHaxeLibType;
    }
    
    public void setHaxeLibType(final boolean isLibType)
    {
        isHaxeLibType = isLibType;
    }
    
    public List<HaxeType> getTypeHierarchy() 
    {
        return typeHierarchy;
    }
    
    public void addToTypeHierarchy(final HaxeType type) 
    {
        if (type == null)
        {
            return;
        }
        typeHierarchy.add(type);
    }
    
    public void clearTypeHierarchy() 
    {
        typeHierarchy.clear();
    }
    
    public String getShortTypeName() 
    {
        return getText();
    }

    public String getFullTypeName() 
    {
        if (fullName == null)
        {
            fullName = getShortTypeName();
        }
        return fullName;
    }
    
    public abstract HaxeTree getDeclaration(final String name);
    
    @Override
    public boolean equals(final Object obj)
    {
        if ( obj == null || !(obj instanceof HaxeType))
        {
            return false;
        }
        
        HaxeType type = (HaxeType)obj;
        boolean result = 
                getShortTypeName().equals(type.getShortTypeName());
        result &= getFullTypeName().equals(type.getFullTypeName());
        result &= typeHierarchy.equals(type.getTypeHierarchy());        
        
        return result;
    }

    @Override
    public String toString() 
    {
        return getFullTypeName().length() != 0 
                ? getFullTypeName()
                : getShortTypeName();
    }
}
