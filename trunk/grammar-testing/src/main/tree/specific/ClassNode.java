package main.tree.specific;

import java.util.ArrayList;

import main.haxe.utils.HaxeType;
import main.tree.ExtendedCommonTree;

import org.antlr.runtime.Token;

public class ClassNode extends ExtendedCommonTree {

    /**
     * 
     */
    public ClassNode() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param node
     */
    public ClassNode(ExtendedCommonTree node) {
        super(node);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param t
     */
    public ClassNode(Token t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

    public BlockScopeNode getBlockScope() {
        for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this.getChildren()) {
            if (tree instanceof BlockScopeNode) {
                return (BlockScopeNode) tree;
            }
        }
        return null;
    }

    public ArrayList<VarUsage> getAllDeclaredVars() {
        ArrayList<VarUsage> list = new ArrayList<VarUsage>();
        BlockScopeNode blockScopeNode = this.getBlockScope();
        if (blockScopeNode != null) {
            for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) blockScopeNode
                    .getChildren()) {
                if (tree instanceof VarDeclaration) {
                    VarDeclaration declarationTree = (VarDeclaration) tree;
                    declarationTree.getVarNameNode().setVarType(
                            declarationTree.getVarType());
                    VarUsage varUsage = declarationTree.getVarNameNode().getClone();
                    list.add(varUsage);
                } else if (tree instanceof FunctionNode) {
                    FunctionNode functionTree = (FunctionNode) tree;
                    VarUsage usage = new VarUsage(((ExtendedCommonTree) functionTree
                            .getChild(0)).getToken());
                    usage.setVarType(functionTree.getFunctionReturnType());
                    list.add(usage);
                } else if (tree instanceof ClassNode) {
                    ClassNode classTree = (ClassNode) tree;
                    VarUsage usage = new VarUsage(classTree.getChild(0).getToken());
                    /**
                     * FIXME нужно создавать тип, используя всю информацию о
                     * классе
                     */
                    usage.setVarType(new HaxeType(classTree.getChild(0).getToken()
                            .getText()));
                    list.add(usage);
                }
            }
        }
        return list;
    }

}
