package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class ExtendedCommonTree extends CommonTree {

    private boolean auxiliary = false;

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
        ArrayList<ExtendedCommonTree> nodes = (ArrayList<ExtendedCommonTree>) this
                .getChildren();

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

            if (pretender.getCharPositionInLine() + pretender.getText().length() >= posInLine) {
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

    /**
     * Calculates index of more appropriate child
     * 
     * @param line
     * @return return -1 in bad cases
     */
    // @SuppressWarnings("unchecked")
    // public ArrayList<ExtendedCommonTree> getAppropriateChildrenByLine(int
    // line) {
    // ArrayList<ExtendedCommonTree> result = new
    // ArrayList<ExtendedCommonTree>();
    // ArrayList<ExtendedCommonTree> nodes = (ArrayList<ExtendedCommonTree>)
    // this
    // .getChildren();
    // Collections.sort(nodes, new ComparatorByLines());
    // for (int i = 0; i <= nodes.size() - 2; i++) {
    // if (nodes.get(i).getLine() <= line && line < nodes.get(i + 1).getLine())
    // {
    // result.add(nodes.get(i));
    // } else if (nodes.get(i).getLine() == line
    // && line == nodes.get(i + 1).getLine()) {
    // result.add(nodes.get(i));
    // }
    // }
    // if (nodes.get(nodes.size() - 1).getLine() <= line) {
    // result.add(nodes.get(nodes.size() - 1));
    // }
    // return result;
    // }
    //
    // @SuppressWarnings("unchecked")
    // public ExtendedCommonTree getAppropriateChildByPositionInLine(int
    // position) {
    // ArrayList<ExtendedCommonTree> nodes = (ArrayList<ExtendedCommonTree>)
    // this
    // .getChildren();
    // Collections.sort(nodes, new ComparatorByLines());
    // for (int i = 0; i <= nodes.size() - 2; i++) {
    // if (nodes.get(i).getCharPositionInLine() <= position
    // && position <= nodes.get(i + 1).getCharPositionInLine()) {
    // return nodes.get(i);
    // }
    // }
    // if (nodes.get(nodes.size() - 1).getCharPositionInLine() <= position) {
    // return nodes.get(nodes.size() - 1);
    // }
    // return null;
    // }
    //
    // public int getTreePositionBeginInLine() {
    // ArrayList<ExtendedCommonTree> children = this.getAllChildren();
    // int result = this.getCharPositionInLine();
    // for (ExtendedCommonTree tree : children) {
    // if (tree.getLine() == this.getLine()) {
    // if (result > tree.getCharPositionInLine()) {
    // result = tree.getCharPositionInLine();
    // }
    // }
    // }
    // return result;
    // }
    //
    // /**
    // * Returns not last item.getCharPositionInLine(), but last
    // * (item.getCharPositionInLine()+item.token.lenght())
    // *
    // * @return
    // */
    // public int getTreePositionEndInLine() {
    // ArrayList<ExtendedCommonTree> children = this.getAllChildren();
    // int result = this.getCharPositionInLine();
    // for (ExtendedCommonTree tree : children) {
    // if (tree.getLine() == this.getLine()) {
    // if (result > tree.getCharPositionInLine()) {
    // result = tree.getCharPositionInLine();
    // }
    // }
    // }
    // return result;
    // }
    //
    // public int getTreeFirstLine() {
    // return 0;
    // }
    //
    // public int getTreeLastLine() {
    // return 0;
    // }

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
