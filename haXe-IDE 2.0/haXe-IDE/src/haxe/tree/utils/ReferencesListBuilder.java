package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.ArrayNode;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.UnarExpressionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.WhileNode;

import java.util.List;

import org.eclipse.core.resources.IFile;

import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.elements.HaxeFile;
import workspace.elements.HaxeProject;

/**
 * Makes a list of usages and calls for the node passed to
 * that class in the project to which currently active file
 * belongs.
 * @author Savenko Maria
 */
public class ReferencesListBuilder extends AbstractHaxeTreeVisitor
{
    // a VarDeclaration\Function\Class\Enum
    private HaxeTree searchObject = null;
    // filepackage - list of found nodes in this' file ast
    private HashMapForLists<NodeLink> foundResult = null;
    private HaxeProject project = null;
    private HaxeFile currFile = null;
    
    /**
     * Starts the analysis of references to sertain object in the project.
     * The object to searche references to should be one of the following:
     * Function, Class, Enum, Variable Declaration (later the list of 
     * types can be extended)
     * 
     * Use Utils to get the object that this class can analyze.
     */
    public void visit(final HaxeTree searchFor)
    {
        foundResult = new HashMapForLists<NodeLink>();
        project = Activator.getInstance().getCurrentHaxeProject();
        
        HashMapForLists<HaxeFile> fullList = project.getFiles();
        
        IFile activeFile = Activator.getInstance().getCurrentFile();
        currFile = project.getFile(activeFile.getFullPath());
        analyseSearchedObject(searchFor);
        
        for (List<HaxeFile> list : fullList.values())
        {
            for (HaxeFile file : list)
            {
                currFile = file;
                visit(file.getAst(), null);
            }
        }
    }
    
    /**
     * For testing perposes only - when we have no prebuilt project
     * structure.
     * @param searchFor - object to search for
     * @param ast - for current parsed part of test
     */
    public void testVisit(final HaxeTree searchFor, final HaxeTree ast)
    {
        searchObject = searchFor;
        foundResult = new HashMapForLists<NodeLink>();
        
        currFile = new HaxeFile("some file", ast);
        visit(ast, null);
    }
    
    /**
     * List of usages\calls for object with the package
     * for file where they we found.
     * @return List of pairs of usages\calls or empty list of pairs.
     */
    public HashMapForLists<NodeLink> getResult()
    {
        return foundResult;
    }
    
    /**
     * This function will analyse the class of the searched object
     * and will extract the real object we should search for.
     * After running that function the previously null 'searchObject'
     * will have the value if the object for searching was valid.
     * @param searchFor
     */
    private void analyseSearchedObject(final HaxeTree searchFor)
    {
        if (searchFor instanceof VarDeclarationNode)
        {
            addToResults(searchFor);
            searchObject = searchFor;
        }
        else if (searchFor instanceof ClassNode)
        {
            searchObject = searchFor;
            /*
            // TODO actually we can only have one constructor in the class but we 
            // can have regular Function named 'new' as well and thus I don't know 
            // how to destinguish them so for now I will just make a list and search
            // usages for the first from that list
            List<HaxeTree> constructors = new ArrayList<HaxeTree>();
            ClassNode classN = (ClassNode)searchFor;
            while (constructors.isEmpty())
            {
                BlockScopeNode block = classN.getBlockScope();
                for (HaxeTree subNode : block.getChildren())
                {
                    if (subNode instanceof FunctionNode &&
                            subNode.getText().equals("new"))
                    {
                        constructors.add(subNode);
                    }
                }
                HaxeTree parent = classN.getParentToExtend();
                if (parent == null)
                {
                    break;
                }
                // if the list is empry we will search for superclasses constructors
                classN = (ClassNode)parent;
            }
            // this is just for now as was explained earlier
            if (!constructors.isEmpty())
            {
                searchObject = constructors.get(0);
            }*/
        }
        else if (searchFor instanceof EnumNode)
        {
            // not implemented yet
        }
        else if (searchFor instanceof FunctionNode)
        {
            if (searchFor.getText().equals("new"))
            {
                // TODO actually we can only have one constructor in the class but we 
                // can have regular Function named 'new' as well and thus I don't know 
                // how to destinguish them
                searchObject = searchFor.getParent().getParent();
            }
            else
            {
                searchObject = searchFor;
            }
        }
    }
    
    private void addToResults(final HaxeTree foundNode)
    {
        NodeLink info = new NodeLink(currFile.getRealFile(), foundNode);
        foundResult.put(currFile.getPackage(), info);
    }

    @Override
    protected void visitHighLevel(final HaxeTree node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final ClassNode node, Object data)
    {
        BlockScopeNode block = node.getBlockScope();        
        if (block == null)
        {
            return;
        }
        visitAllChildren(block, data);        
    }

    @Override
    protected void visit(final FunctionNode node, Object data)
    {
        for (HaxeTree param : node.getParametersAsDeclarations())
        {
            visit(param, data);
        }
        
        BlockScopeNode block = node.getBlockScope();      
        if (block == null)
        {
            return;
        }
        visitAllChildren(block, data);
    }

    @Override
    protected void visit(final VarDeclarationNode node, Object data)
    {
        HaxeType nodeType = node.getHaxeType();
        if ((searchObject instanceof ClassNode
                || searchObject instanceof EnumNode)
                    && searchObject.getHaxeType().getShortTypeName().equals(nodeType.getShortTypeName()))
        {
            addToResults(node);
        }
        HaxeTree init = node.getInitializationNode();
        if (init == null)
        {
            return;
        }
        visit (init, data);
    }

    @Override
    protected void visit(final NewNode node, Object data)
    {
        HaxeTree declaration = node.getDeclarationNode();
        if (declaration != null
                && searchObject instanceof ClassNode
                // TODO check parameter types and so
                && declaration.getText().equals(searchObject.getText()))
        {
            addToResults(node);
        }
        
        // now visit the params if there are any
        for (HaxeTree child : node.getChildren())
        {
            if (child.getChildIndex() == 0)
            {
                continue;
            }
            visit(child, data);
        }
    }

    @Override
    protected void visit(final MethodCallNode node, Object data)
    {
        HaxeTree parent = node.getParent();
        HaxeTree decl = node.getDeclarationNode();
        String name = node.getText();
        if ((searchObject instanceof FunctionNode 
                || parent instanceof NewNode) // for constructors
                && name.equals(searchObject.getText())
                && decl != null
                && decl.equals(searchObject))
        {
            addToResults(node);
        }
        
        for (HaxeTree param : node.getParameters())
        {
            visit(param, data);
        }
    
        if (node.isFieldUse())
        {
            visit(node.getChild(node.getChildCount() - 1), data);
        }
    }

    @Override
    protected void visit(final SliceNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final VarUsageNode node, Object data)
    {
        String searchName = searchObject.getText();
        String nodeName = node.getText();
        if (node.getDeclarationNode() == null)
        {
            return;
        }
        if (nodeName.equals(searchName) 
                && node.getDeclarationNode().equals(searchObject)
                && (searchObject instanceof VarDeclarationNode 
                        || searchObject instanceof ClassNode // for static classes
                        || searchObject instanceof EnumNode))
        {
            addToResults(node);
        }
    }

    @Override
    protected void visit(final AssignOperationNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final ArrayNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final ConstantNode node, Object data)
    {
        // skip
    }

    @Override
    protected void visit(final ReturnNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final BinaryExpressionNode node, Object data)
    {
        visitAllChildren(node, data);
    }
    
    protected void visit(final UnarExpressionNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final BlockScopeNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final ErrorNode node, Object data)
    {
        // skip
    }

    @Override
    protected void visit(final IfNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final ForNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final WhileNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visitUnknown(final HaxeTree node, Object data)
    {
        visitAllChildren(node, data);
    }

}
