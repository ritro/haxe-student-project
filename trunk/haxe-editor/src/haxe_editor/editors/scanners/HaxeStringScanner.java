package haxe_editor.editors.scanners;

import haxe_editor.editors.ColorManager;
import haxe_editor.editors.HaxeWhitespaceDetector;
import haxe_editor.editors.IXMLColorConstants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

public class HaxeStringScanner extends RuleBasedScanner {

    // private static String[] fgKeywords = { "while", "for", "if", "else" };

    public HaxeStringScanner(ColorManager manager) {
        // IToken keyword = new Token(new TextAttribute(manager
        // .getColor(IXMLColorConstants.KEYWORD)));
        IToken string = new Token(new TextAttribute(manager
                .getColor(IXMLColorConstants.STRING)));
        // IToken comment = new Token(new TextAttribute(manager
        // .getColor(IXMLColorConstants.SINGLE_LINE_COMMENT)));
        // IToken other = new Token(new TextAttribute(manager
        // .getColor(IXMLColorConstants.DEFAULT)));

        List<IRule> rules = new ArrayList<IRule>();
        // Add generic whitespace rule.
        rules.add(new WhitespaceRule(new HaxeWhitespaceDetector()));
        // For single line comment
        // rules.add(new EndOfLineRule("//", comment));
        // For Strings
        rules.add(new MultiLineRule("\"", "\"", string, '\\'));
        rules.add(new MultiLineRule("'", "'", string, '\\'));
        // WordRule wordRule = new WordRule(new HaxeWordDetector(), other);
        // for (String word : fgKeywords) {
        // wordRule.addWord(word, keyword);
        // }
        // rules.add(wordRule);

        setRules(rules.toArray(new IRule[0]));
    }
}
