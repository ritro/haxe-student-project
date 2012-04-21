package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.tree.utils.HaxeTypeUtils;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * This class represents arryas in that form: [el1, el2, ..]
 * 
 * @author Savenko Maria
 */
public class ArrayNode extends ConstantNode
{   
    private CommonToken leftBracket = null;
    private CommonToken rightBracket = null;
    
    private HaxeType memebersType = null;
    
    public ArrayNode(
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
            HaxeType arrayType = HaxeTypeUtils.getArray();
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
        HaxeType type = HaxeTypeUtils.getUnknown();
        for (HaxeTree child : getChildren())
        {
            if (child.getChildIndex() == 0)
            {
                type = child.getHaxeType();
                continue;
            }
            if (child.ifUndefinedType())
            {
                // it will leave type of the array as Undefined
                return;
            }
            HaxeType ctype = child.getHaxeType();
            if (HaxeTypeUtils.isAvailableAssignement(type, ctype))
            {
                continue;
            }
            else if (HaxeTypeUtils.isAvailableAssignement(ctype, type))
            {
                type = ctype;
                continue;
            }
        }
        setHaxeType(type);
    }
}
