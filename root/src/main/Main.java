package main;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

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

        ExtendedCommonTree target = tree.getNodeByPosition(11, 12);

        System.out.println("Result:" + target);
        System.out.println("Declaration:" + target.getDeclarationNode(target));
    }

    public static void printTree(ExtendedCommonTree t, int indent) {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; i++)
                sb = sb.append("   ");
            for (int i = 0; i < t.getChildCount(); i++) {
                System.out.println(sb.toString() + t.getChild(i).toString()
                        + t.getChild(i).getText());
                printTree((ExtendedCommonTree) t.getChild(i), indent + 1);
            }
        }
    }
}
