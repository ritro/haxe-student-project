package tree.expression;


import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.type.ClassNode;
import tree.type.HaxeType;
import tree.utils.TypeUtils;

/**
 * This class represents arryas in that form: [el1, el2, ..]
 * 
 * @author Savenko Maria
 */
public class Array extends Constant
{   
    private CommonToken leftBracket = null;
    private CommonToken rightBracket = null;
    
    private HaxeType memebersType = null;
    
    public Array(
            final int ttype, final Token lbToken, final Token rbToken) 
    {
        super(new CommonToken(ttype, "Array"));
        leftBracket = (CommonToken) lbToken;
        rightBracket = (CommonToken) rbToken;
    }
    
    @Override
    public HaxeType getHaxeType()
    {
        if (haxeType == null)
        {
            HaxeType arrayType = TypeUtils.getArray();
            if (arrayType == null || !(arrayType instanceof ClassNode))
            {
                return null;
            }
            ((ClassNode)arrayType).addToParamTypes(getMembersType());
            haxeType = arrayType;
        }
        return super.getHaxeType();
    }
    
    public HaxeType getMembersType()
    {
        if (memebersType == null)
        {
            tryDefineType();
        }
        return memebersType;
    }
    
    @Override
    public String getText()
    {
        return "Array";
    }
    
    @Override
    protected void calculateMostRightPosition()
    {
        mostRightPosition = rightBracket.getStopIndex();
    }
    
    @Override
    protected void calculateMostLeftPosition()
    {
        mostLeftPosition = leftBracket.getStartIndex();
    }
    
    private void tryDefineType()
    {
        // for empty arrays
        HaxeType type = TypeUtils.getUnknown();
        for (HaxeTree child : getChildren())
        {
            if (child.getChildIndex() == 0)
            {
                type = child.getHaxeType();
                continue;
            }
            if (child.isUndefinedType())
            {
                // it will leave type of the array as Undefined
                return;
            }
            HaxeType ctype = child.getHaxeType();
            if (TypeUtils.isAvailableAssignement(type, ctype))
            {
                continue;
            }
            else if (TypeUtils.isAvailableAssignement(ctype, type))
            {
                type = ctype;
                continue;
            }
        }
        setHaxeType(type);
    }
}
