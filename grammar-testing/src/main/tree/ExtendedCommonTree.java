package main.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import main.main.TinyHaxeTry1Parser;
import main.tree.exceptions.AlreadyDeclaredVarDeclarationException;
import main.tree.exceptions.NotDeclaredVarUsageException;
import main.tree.specific.AssignOperationNode;
import main.tree.specific.BlockScopeNode;
import main.tree.specific.ClassNode;
import main.tree.specific.FunctionNode;
import main.tree.specific.VarDeclaration;
import main.tree.specific.VarUsage;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class ExtendedCommonTree extends CommonTree {

    private boolean auxiliary = false;

    public static final int PARAM_LIST_TYPE = (new ArrayList<String>(Arrays
            .asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.PARAM_LIST
            .toString());

    public static final int TYPE_TAG_TYPE = (new ArrayList<String>(Arrays
            .asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.TYPE_TAG
            .toString());

    public static final int SUFFIX_EXPR_TYPE = (new ArrayList<String>(Arrays
            .asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.SUFFIX_EXPR
            .toString());
    public static final int VAR_INIT_TYPE = (new ArrayList<String>(Arrays
            .asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.VAR_INIT
            .toString());

    //
    // public static final int TYPE_TAG_TYPE = (new ArrayList<String>(Arrays
    // .asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.TYPE_TAG
    // .toString());

    /**
     * @return the auxiliary
     */
    public boolean isAuxiliary() {
        return auxiliary;
    }

    /**
     * @param auxiliary
     *            the auxiliary to set
     */
    public void setAuxiliary(boolean auxiliary) {
        this.auxiliary = auxiliary;
    }

    public ExtendedCommonTree() {
        // TODO Auto-generated constructor stub
    }

    public ExtendedCommonTree(CommonTree node) {
        super(node);
        // TODO Auto-generated constructor stub
    }

    public ExtendedCommonTree(Token t) {
        super(t);
    }

    public ExtendedCommonTree(int ttype, Token t, boolean auxiliary) {
        token = t;
        this.auxiliary = auxiliary;
    }

    public ExtendedCommonTree(int ttype, String type, boolean auxiliary) {
        this.token = new CommonToken(ttype, type);
        this.auxiliary = auxiliary;
    }

    public ExtendedCommonTree(int ttype, boolean auxiliary) {
        System.out.println("Extended: " + ttype);
        token = new CommonToken(ttype);
        this.auxiliary = auxiliary;
    }

    public ExtendedCommonTree(int ttype) {
        token = new CommonToken(ttype);
    }

    /**
     * Calculating scopes in tree. Should be applied only to module
     * 
     * @throws AlreadyDeclaredVarDeclarationException
     * @throws NotDeclaredVarUsageException
     */
    public void calculateScopes() throws AlreadyDeclaredVarDeclarationException,
            NotDeclaredVarUsageException {
        for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this.getChildren()) {
            if (tree instanceof ClassNode) {
                ((ClassNode) tree).getBlockScope().calculateScopes(
                        ((ClassNode) tree).getBlockScope());
                break;
            }
        }
    }

    /**
     * 
     * @param blockScope
     * @throws AlreadyDeclaredVarDeclarationException
     * @throws NotDeclaredVarUsageException
     */
    protected void calculateScopes(BlockScopeNode blockScope)
            throws AlreadyDeclaredVarDeclarationException, NotDeclaredVarUsageException {
        if (this instanceof BlockScopeNode) {
            BlockScopeNode thisAsBlockScope = (BlockScopeNode) this;
            thisAsBlockScope.setDeclaredVars(blockScope.getDeclaredVarsClone());

            if (this.getParent() instanceof FunctionNode) {
                ArrayList<VarUsage> params = ((FunctionNode) this.getParent())
                        .getParametersAsVarUsage();
                ArrayList<VarUsage> united = new ArrayList<VarUsage>(thisAsBlockScope
                        .getDeclaredVarsClone());
                united.addAll(params);
                thisAsBlockScope.setDeclaredVars(united);
            } else if (this.getParent() instanceof ClassNode) {
                ArrayList<VarUsage> varsFromClass = ((ClassNode) this.getParent())
                        .getAllDeclaredVars();
                varsFromClass.addAll(thisAsBlockScope.getDeclaredVarsClone());
                thisAsBlockScope.setDeclaredVars(varsFromClass);
            }
            for (ExtendedCommonTree tree : this.getChildren()) {
                tree.calculateScopes(thisAsBlockScope);
            }
        } else if (this instanceof VarDeclaration) {
            VarDeclaration declarationTree = (VarDeclaration) this;
            declarationTree.getVarNameNode().setVarType(declarationTree.getVarType());
            VarUsage varUsage = declarationTree.getVarNameNode().getClone();

            ExtendedCommonTree varInitNode = declarationTree.getVAR_INIT_NODE();
            if (varInitNode != null) {
                for (ExtendedCommonTree tree : varInitNode.getChildren()) {
                    tree.calculateScopes(blockScope);
                }
            }

            if (varUsage.getVarType().equals(VarUsage.VarTypes.UNKNOWN.toString())) {
                // Попробовать посчитать тип выражения
            }
            if (blockScope.getDeclaredVarsClone().contains(varUsage)) {
                throw new AlreadyDeclaredVarDeclarationException();
            } else {
                // TODO could be used without cloning
                ArrayList<VarUsage> united = new ArrayList<VarUsage>(blockScope
                        .getDeclaredVarsClone());
                united.add(varUsage);
                blockScope.setDeclaredVars(united);
            }
        } else if (this instanceof AssignOperationNode) {
            /** FIXME сделать проверку типов */
            // Проверить, есть ли данный узел в скопе
            for (ExtendedCommonTree tree : this.getChildren()) {
                tree.calculateScopes(blockScope);
            }
        } else if (this instanceof VarUsage) {
            VarUsage thisAsVarUsage = (VarUsage) this;
            if (thisAsVarUsage.getVarType().equals(
                    VarUsage.VarTypes.NOT_YET_RGRECOGNIZED.toString())) {

                if (blockScope.doScopeContainsVarName(thisAsVarUsage.getText())) {
                    thisAsVarUsage.setVarType(blockScope.getVarInScopeType(thisAsVarUsage
                            .getText()));
                } else {
                    throw new NotDeclaredVarUsageException(thisAsVarUsage);
                }
            }
        } else if (this instanceof FunctionNode) {
            ((FunctionNode) this).getBlockScope().calculateScopes(blockScope);

        } else {
            if (this.getChildren() != null) {
                for (ExtendedCommonTree tree : this.getChildren()) {
                    tree.calculateScopes(blockScope);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public ExtendedCommonTree getNodeByPosition(int line, int posInLine) {
        ArrayList<ExtendedCommonTree> nodes = (ArrayList<ExtendedCommonTree>) (this
                .getChildren()).clone();

        if (this.getLine() != line) {
            Collections.sort(nodes, new ComparatorByLines());
            for (int i = 0; i <= nodes.size() - 2; i++) {
                if (nodes.get(i).getLine() <= line && line < nodes.get(i + 1).getLine()) {
                    return nodes.get(i).getNodeByPosition(line, posInLine);
                }
            }
            if (nodes.get(nodes.size() - 1).getLine() <= line) {
                if (nodes.get(nodes.size() - 1).getChildren() != null) {
                    return nodes.get(nodes.size() - 1).getNodeByPosition(line, posInLine);
                } else {
                    return this;
                }
            }
            System.out.println("Fail on first part");
            return null;
        } else {
            for (int i = nodes.size() - 1; i >= 0; i--) {
                if (nodes.get(i).getLine() != line) {
                    nodes.remove(i);
                }
            }
            Collections.sort(nodes, new ComparatorByPosInLine());
            ExtendedCommonTree pretender = null;
            for (int i = 0; i <= nodes.size() - 2; i++) {
                if (nodes.get(i).getCharPositionInLine() <= posInLine
                        && posInLine < nodes.get(i + 1).getCharPositionInLine()) {
                    pretender = nodes.get(i);
                    break;
                }
            }
            if (nodes.get(nodes.size() - 1).getCharPositionInLine() <= posInLine) {
                pretender = nodes.get(nodes.size() - 1);
            }
            if (pretender == null) {
                return nodes.get(0).getNodeByPosition(line, posInLine);
            }

            if (pretender.getCharPositionInLine() + pretender.getText().length() > posInLine
                    && pretender.getCharPositionInLine() <= posInLine
                    && pretender.auxiliary == false) {
                return pretender;
            } else {
                if (pretender.getChildren() != null) {
                    return pretender.getNodeByPosition(line, posInLine);
                } else {
                    return this;
                }
            }
        }
    }

    public ExtendedCommonTree getDeclarationNode(ExtendedCommonTree usageNode) {
        ExtendedCommonTree parent = (ExtendedCommonTree) this.getParent();
        if (parent != null) {
            ExtendedCommonTree declaration = null;
            if (this instanceof VarDeclaration) {
                if (this.isDeclaration(usageNode)) {
                    return declaration = this;
                }
            } else if (this instanceof FunctionNode) {
                if (((FunctionNode) this).getFunctionName().equals(usageNode.getText())) {
                    return this;
                } else {
                    ExtendedCommonTree params = ((FunctionNode) this).getParamListNode();
                    if (params != null) {
                        declaration = usageNode.isDeclaredIn(params.getChildren());
                    }
                }
            } else if (this instanceof ClassNode) {
                if (this.isClassDeclaration(usageNode)) {
                    declaration = this;
                }
            }
            if (declaration != null) {
                return declaration;
            }
            int index = parent.getChildren().indexOf(this);
            if (index > 0) {
                return ((ExtendedCommonTree) parent.getChild(index - 1))
                        .getDeclarationNode(usageNode);
            } else {
                if (parent instanceof BlockScopeNode) {
                    // Если предок блока это класс, то, возможно, переменная
                    // была определена после использования
                    if (parent.getParent() instanceof ClassNode) {
                        ExtendedCommonTree paramDeclaration = usageNode
                                .isDeclaredIn(((ExtendedCommonTree) parent).getChildren());
                        if (paramDeclaration != null) {
                            return paramDeclaration;
                        }
                    }
                }
                return parent.getDeclarationNode(usageNode);
            }
        } else {
            return new ExtendedCommonTree(0);
        }
    }

    /**
     * Checks if it is declaration of current object in passed list. If not,
     * returns null;
     * 
     * @param declarations
     * @return
     */
    private ExtendedCommonTree isDeclaredIn(List<ExtendedCommonTree> declarations) {
        for (ExtendedCommonTree tree : declarations) {
            if (tree.isDeclaration(this) || tree.isFuncDeclaration(this)
                    || tree.isClassDeclaration(this)) {
                return tree;
            }
        }
        return null;
    }

    /**
     * Checks if this object is declaration of usage
     * 
     * @param usage
     * @return
     */
    private boolean isDeclaration(ExtendedCommonTree usage) {
        return ((this instanceof VarDeclaration) && (this.getChildren() != null) && (this
                .getChild(0).getText().equals(usage.getText())));
    }

    private boolean isFuncDeclaration(ExtendedCommonTree usage) {
        return ((this instanceof FunctionNode) && (this.getChild(0).getText()
                .equals(usage.getText())));
    }

    private boolean isClassDeclaration(ExtendedCommonTree usage) {
        return ((this instanceof ClassNode) && (this.getChild(0).getText().equals(usage
                .getText())));
    }

    public ArrayList<ExtendedCommonTree> getAllChildren() {
        ArrayList<ExtendedCommonTree> childs = new ArrayList<ExtendedCommonTree>();
        if (this.getChildCount() != 0) {
            for (ExtendedCommonTree child : this.getChildren()) {
                childs.addAll(child.getAllChildren());
            }
        } else {
            childs.add(this);
        }
        return childs;
    }

    private class ComparatorByLines implements Comparator<CommonTree> {
        @Override
        public int compare(CommonTree arg0, CommonTree arg1) {
            if (arg0.getLine() < arg1.getLine()) {
                return -1;
            } else if (arg0.getLine() > arg1.getLine()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    private class ComparatorByPosInLine implements Comparator<CommonTree> {
        @Override
        public int compare(CommonTree arg0, CommonTree arg1) {
            if (arg0.getCharPositionInLine() < arg1.getCharPositionInLine()) {
                return -1;
            } else if (arg0.getCharPositionInLine() > arg1.getCharPositionInLine()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.antlr.runtime.tree.BaseTree#getChildren()
     */
    @Override
    @SuppressWarnings("unchecked")
    public ArrayList<ExtendedCommonTree> getChildren() {
        return (ArrayList<ExtendedCommonTree>) super.getChildren();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.antlr.runtime.tree.BaseTree#getChild(int)
     */
    @Override
    public ExtendedCommonTree getChild(int i) {
        // TODO Auto-generated method stub
        return (ExtendedCommonTree) super.getChild(i);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.antlr.runtime.tree.CommonTree#toString()
     */
    @Override
    public String toString() {
        return super.toString() + "(" + this.getLine() + ", "
                + this.getCharPositionInLine() + ")" + "(" + this.auxiliary + ") "
                + this.getClass();
    }

}
