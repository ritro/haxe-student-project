package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.ArrayNode;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.WhileNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;

import workspace.Activator;
import workspace.HashMapForLists;
import workspace.elements.HaxeFile;
import workspace.elements.HaxeProject;

/**
 * Makes a list of usages and calls for the node passed to
 * that class in the project to which currently active file
 * belongs.
 * @author Savenko Maria
 */
public class CallHierarchyBuilder extends AbstractHaxeTreeVisitor
{
    // a VarDeclaration\VarUsage\Function\Class
    private HaxeTree searchObject = null;
    // filepackage - list of found nodes in this' file ast
    private HashMapForLists<HaxeTree> foundResult = null;
    private HaxeProject project = null;
    private HaxeFile currFile = null;
    
    public void visit(final HaxeTree searchFor)
    {
        searchObject = searchFor;
        foundResult = new HashMapForLists<HaxeTree>();
        project = Activator.getInstance().getCurrentHaxeProject();
        
        HashMap<String, List<HaxeFile>> fullList = project.getFiles();
        
        HaxeTree declaration = null;
        if (searchObject instanceof VarUsageNode)
        {
            declaration = ((VarUsageNode) searchObject).getDeclarationNode();
            if (declaration instanceof VarDeclarationNode)
            {
                IFile activeFile = Activator.getInstance().activeFile;
                currFile = project.getFile(activeFile.getFullPath());
                addToResults(declaration);
                searchObject = declaration;
            }
        }
        else if (searchObject instanceof VarDeclarationNode)
        {
            addToResults(searchFor);
        }
        else if (searchObject instanceof MethodCallNode)
        {
            searchObject = ((MethodCallNode)searchObject).getDeclarationNode();
        }
        else if (searchObject instanceof SliceNode)
        {
            searchObject = ((SliceNode)searchObject).getDeclarationNode();
        }
        
        if (searchObject == null)
        {
            return;
        }
        
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
        foundResult = new HashMapForLists<HaxeTree>();
        
        currFile = new HaxeFile("some file", ast);
        visit(ast, null);
    }
    
    /**
     * List of usages\calls for object with the package
     * for file where they we found.
     * @return List of pairs of usages\calls or empty list of pairs.
     */
    public HashMapForLists<HaxeTree> getResult()
    {
        return foundResult;
    }
    
    private void addToResults(final HaxeTree foundNode)
    {
        foundResult.put(currFile.getPackage(), foundNode);
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
        HaxeTree init = node.getInitializationNode();
        if (init == null)
        {
            return;
        }
        visit (init, data);
    }

    @Override
    protected void visit(NewNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(final MethodCallNode node, Object data)
    {
        if (searchObject instanceof FunctionNode
                && node.getText().equals(searchObject.getText())
                && node.getDeclarationNode().equals(searchObject))
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
        if (!(searchObject instanceof VarDeclarationNode) 
                || node.getDeclarationNode() == null)
        {
            return;
        }
        if (nodeName.equals(searchName) &&
                node.getDeclarationNode().equals(searchObject))
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
