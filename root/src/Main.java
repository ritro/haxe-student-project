import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import tree.ExtendedCommonTree;
import tree.ExtendedTreeAdaptor;

/**
 * @author kondratyev
 * 
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Main main = new Main();

        System.out.print("Reading file...");
        String path = "./src/haxe-input.txt";
        ANTLRFileStream charStream = null;
        try {
            charStream = new ANTLRFileStream(path);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        System.out.println("Yes");

        System.out.print("Lexing file...");
        TinyHaxeTry1Lexer lexer = new TinyHaxeTry1Lexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        System.out.println("Yes");

        System.out.print("Parsing file...");
        TinyHaxeTry1Parser parser = new TinyHaxeTry1Parser(tokenStream);
        parser.setTreeAdaptor(new ExtendedTreeAdaptor());
        // ExtendedCommonTree tree = new ExtendedCommonTree();
        ExtendedCommonTree tree = new ExtendedCommonTree();

        try {
            TinyHaxeTry1Parser.module_return parserResult = parser.module();
            // tree = (ExtendedCommonTree) parserResult.getTree();
            tree = (ExtendedCommonTree) parserResult.getTree();
            System.out.println("Yes");
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        printTree(tree, 0);

        ExtendedCommonTree target = tree.getNodeByPosition(11, 4);
        System.out.println("Result:" + target);
    }

    public static void printTree(ExtendedCommonTree t, int indent) {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; i++)
                sb = sb.append("   ");
            for (int i = 0; i < t.getChildCount(); i++) {
                String tmp = t.getChild(i).getText();
                // Object object = t.getChild(i).get
                System.out.println(sb.toString() + t.getChild(i).toString()
                        + t.getChild(i).getText());
                printTree((ExtendedCommonTree) t.getChild(i), indent + 1);
            }
        }
    }

    // private ArrayList<ExtendedCommonTree>
    // getNodeByPosition(ExtendedCommonTree tree,
    // int lineNumber, int charPos) {
    // ArrayList<ExtendedCommonTree> path = new ArrayList<ExtendedCommonTree>();
    // path.add(tree);
    //
    // ArrayList<ExtendedCommonTree> byLine = tree
    // .getAppropriateChildrenByLine(lineNumber);
    // if (byLine.size() == 1) {
    // // It could be not correct node
    // ExtendedCommonTree commonTree = byLine.get(0);
    // if (commonTree.getLine() == lineNumber) {
    // ExtendedCommonTree correctNode = commonTree
    // .getAppropriateChildByPositionInLine(charPos);
    // path.add(correctNode);
    // } else {
    // path.addAll(getNodeByPosition(commonTree, lineNumber, charPos));
    // }
    // return path;
    // } else {
    // System.out.println("Вернули несколько узлов");
    // for (ExtendedCommonTree commonTree : byLine) {
    // System.out.println(commonTree.toString());
    // System.out.println("");
    // }
    // }
    //
    // return null;
    // }

    // private CommonTree getNode(CommonTree tree, int line, int positionInLine)
    // {
    // if (tree.getLine() == line) {
    // System.out.println(tree.toString() + "Correct line");
    // if (tree.getCharPositionInLine() == positionInLine) {
    // System.out.println(tree.toString() + "Corect position ");
    // }
    // } else {
    // ArrayList<Pair> nodes
    // for (CommonTree child:(List<CommonTree>)tree.getChildren()){
    // Pair node = new Pair(child, child.getLine());
    // }
    // tree.
    // }
    // return null;
    // }

    private class Pair {

        /**
         * @param tree
         * @param lineNumber
         */
        public Pair(CommonTree tree, int lineNumber) {
            this.tree = tree;
            this.lineNumber = lineNumber;
        }

        CommonTree tree;
        int lineNumber;
    }
}
