package haxe.tree.utils;

import java.util.ArrayList;
import java.util.List;

public class GenericHaxeType extends HaxeType
{
    private List<HaxeType> paramTypes = new ArrayList<HaxeType>();
    
    public List<HaxeType> getParameterTypes() 
    {
        return paramTypes;
    }
    
    public void addParameterType(final HaxeType type)
    {
        paramTypes.add(type);
    }
    
    @Override
    public boolean equals(final Object arg0) 
    {
        if (!(arg0 instanceof GenericHaxeType))
        {
            return false;
        }
        GenericHaxeType type = (GenericHaxeType)arg0;
        if (!getFullTypeName().equals(type.getFullTypeName()))
        {
            return false;
        }
        List<HaxeType> params = type.getParameterTypes();
        if (paramTypes.size() != params.size())
        {
            return false;
        }
        for (int i=0; i<paramTypes.size(); i++)
        {
            if (!paramTypes.get(i).equals(params.get(i)))
            {
                return false;
            }
        }
        return true;
    }
}
