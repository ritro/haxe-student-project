package tree.utils;

import java.util.HashMap;

import tree.ErrorNode;
import tree.Function;
import tree.HaxeTree;
import tree.IPackageInfo;
import tree.Module;
import tree.expression.Array;
import tree.expression.Assignment;
import tree.expression.Binary;
import tree.expression.Constant;
import tree.expression.Declaration;
import tree.expression.MethodCall;
import tree.expression.NewNode;
import tree.expression.Slice;
import tree.expression.Unary;
import tree.expression.Usage;
import tree.statement.BlockScope;
import tree.statement.For;
import tree.statement.IfNode;
import tree.statement.Return;
import tree.statement.While;
import tree.type.ClassNode;
import tree.type.EnumNode;
import tree.type.HaxeType;
import workspace.Activator;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.ProjectManager;
import workspace.elements.CodeFile;
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
    private CodeFile currFile = null;
    
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
        ProjectManager prManager = Activator.getProjectManager();
        
        foundResult = new HashMapForLists<NodeLink>();
        project = prManager.getCurrentHaxeProject();
        
        HashMap<String, CodeFile> fullList = project.getFiles();
        
        currFile = prManager.getCurrentFile();
        analyseSearchedObject(searchFor);
        
        for (CodeFile file : fullList.values())
        {
            currFile = file;
            visit(file.getAst(), null);
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
        
        currFile = new CodeFile("some file", ast);
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
        if (searchFor instanceof Declaration)
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
        else if (searchFor instanceof Function)
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
        if (currFile == null)
        {
            return;
        }
        if (foundNode instanceof IPackageInfo)
        {
            String pack = ((IPackageInfo)foundNode).getPackage();
            CodeFile file = project.getFile(pack);
            addToResults(foundNode, file);
        }
        else
        {
            addToResults(foundNode, currFile);
        }
    }
    
    private void addToResults(final HaxeTree foundNode, final CodeFile file)
    {
        NodeLink info = new NodeLink(file.getRealFile(), foundNode);
        foundResult.put(file.getPackage(), info);
    }

    @Override
    protected void visit(final Module node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final ClassNode node, Object data)
    {
        BlockScope block = node.getBlockScope();        
        if (block == null)
        {
            return;
        }
        visitAllChildren(block, data);        
    }

    @Override
    protected void visit(final Function node, Object data)
    {
        for (HaxeTree param : node.getParametersAsDeclarations())
        {
            visit(param, data);
        }
        
        BlockScope block = node.getBlockScope();      
        if (block == null)
        {
            return;
        }
        visitAllChildren(block, data);
    }

    @Override
    protected void visit(final Declaration node, Object data)
    {
        HaxeType nodeType = node.getHaxeType();
        if ((searchObject instanceof ClassNode || searchObject instanceof EnumNode)
                && nodeType != null
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
    protected void visit(final MethodCall node, Object data)
    {
        HaxeTree parent = node.getParent();
        HaxeTree decl = node.getDeclarationNode();
        String name = node.getText();
        if ((searchObject instanceof Function 
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
    protected void visit(final Slice node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final Usage node, Object data)
    {
        String searchName = searchObject.getText();
        String nodeName = node.getText();
        if (node.getDeclarationNode() == null)
        {
            return;
        }
        if (nodeName.equals(searchName) 
                && node.getDeclarationNode().equals(searchObject)
                && (searchObject instanceof Declaration 
                        || searchObject instanceof ClassNode // for static classes
                        || searchObject instanceof EnumNode))
        {
            addToResults(node);
        }
        if (node.isFieldUse())
        {
            HaxeTree child = node.getChild(0).getChild(0);
            visit(child, data);
        }
    }

    @Override
    protected void visit(final Assignment node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final Array node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final Constant node, Object data)
    {
        // skip
    }

    @Override
    protected void visit(final Return node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final Binary node, Object data)
    {
        visitAllChildren(node, data);
    }
    
    protected void visit(final Unary node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final BlockScope node, Object data)
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
    protected void visit(final For node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final While node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visitUnknown(final HaxeTree node, Object data)
    {
        visitAllChildren(node, data);
    }

}
