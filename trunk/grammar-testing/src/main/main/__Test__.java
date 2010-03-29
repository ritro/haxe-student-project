import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import main.main.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        TinyHaxeTry1Lexer lex = new TinyHaxeTry1Lexer(new ANTLRFileStream("C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\main\\main\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        TinyHaxeTry1Parser g = new TinyHaxeTry1Parser(tokens, 49100, null);
        try {
            g.module();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}