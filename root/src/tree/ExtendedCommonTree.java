package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import tree.specific.BlockScopeNode;
import tree.specific.ClassNode;
import tree.specific.ForNode;
import tree.specific.FunctionNode;
import tree.specific.VarDeclaration;
import tree.specific.WhileNode;

public class ExtendedCommonTree extends CommonTree {

    private boolean auxiliary = false;

    // public static final int VAR_DECLARATION_INDEX = (new
    // ArrayList<String>(Arrays.asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.)

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

    @SuppressWarnings("unchecked")
    public ExtendedCommonTree getNodeByPosition(int line, int posInLine) {
        ArrayList<ExtendedCommonTree> nodes = (ArrayList<ExtendedCommonTree>) ((ArrayList<ExtendedCommonTree>) this
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

            if (pretender.getCharPositionInLine() + pretender.getText().length() >= posInLine
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

    @SuppressWarnings("unchecked")
    public ExtendedCommonTree getDeclarationNode(ExtendedCommonTree usageNode) {
        ExtendedCommonTree parent = (ExtendedCommonTree) this.getParent();
        if (parent != null) {
            ExtendedCommonTree declaration = null;
            if (this instanceof VarDeclaration) {
                if (this.isDeclaration(usageNode)) {
                    declaration = this;
                }
            } else if (this instanceof FunctionNode) {
                ExtendedCommonTree params = ((FunctionNode) this).getParamListNode();
                if (params != null) {
                    declaration = usageNode.isDeclaredIn(params.getChildren());
                }

            } else if (this instanceof WhileNode) {

            } else if (this instanceof ForNode) {

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
                                .isDeclaredIn((ArrayList<ExtendedCommonTree>) ((ExtendedCommonTree) parent
                                        .getParent()).getChildren());
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
     * Returns child of current tree that has index-- due to passed child, or
     * itself if child has index==0
     * 
     * @param child
     * @return
     */
    private ExtendedCommonTree getPreviosChild(ExtendedCommonTree child) {
        int index = this.getChildren().indexOf(child);
        if (index > 0) {
            return (ExtendedCommonTree) this.getChild(index - 1);
        } else {
            return this;
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
            if (tree.isDeclaration(this)) {
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

    @SuppressWarnings("unchecked")
    public ArrayList<ExtendedCommonTree> getAllChildren() {
        ArrayList<ExtendedCommonTree> childs = new ArrayList<ExtendedCommonTree>();
        if (this.getChildCount() != 0) {
            for (ExtendedCommonTree child : (List<ExtendedCommonTree>) this.getChildren()) {
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
     * @see org.antlr.runtime.tree.CommonTree#toString()
     */
    @Override
    public String toString() {
        return super.toString() + "(" + this.getLine() + ", "
                + this.getCharPositionInLine() + ")" + "(" + this.auxiliary + ")";
    }

}
