package haxe_editor.editors.scanners;

import haxe_editor.editors.ColorManager;
import haxe_editor.editors.HaxeWhitespaceDetector;
import haxe_editor.editors.HaxeWordDetector;
import haxe_editor.editors.IXMLColorConstants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

public class HaxeKeywordScanner extends RuleBasedScanner {
    private final String[] fDeclareKeyWords = { "var", "function", "new", "delete",
            "class", "package" };

    private final String[] fKeyWords = { "import", "extends", "implements", "extern",
            "private", "public", "static", "try", "catch", "throw", "cast", "return",
            "break", "continue", "if", "else", "for", "while", "do", "switch", "case",
            "with" };

    private final String[] fTypeWords = { "Void", "Float", "Int" };

    private final String[] fTypeConstants = { "null", "undefined", "true", "false" };

    public HaxeKeywordScanner(ColorManager manager) {
        IToken keyword = new Token(new TextAttribute(manager
                .getColor(IXMLColorConstants.KEYWORD)));
        IToken other = new Token(new TextAttribute(manager
                .getColor(IXMLColorConstants.DEFAULT)));

        List<IRule> rules = new ArrayList<IRule>();
        // Add generic whitespace rule.
        rules.add(new WhitespaceRule(new HaxeWhitespaceDetector()));
        WordRule wordRule = new WordRule(new HaxeWordDetector(), other);

        // Add rule for haXe keywords
        for (String word : fKeyWords)
            wordRule.addWord(word, keyword);

        for (String word : fDeclareKeyWords)
            wordRule.addWord(word, keyword);

        for (String word : fTypeConstants)
            wordRule.addWord(word, keyword);

        for (String word : fTypeWords)
            wordRule.addWord(word, keyword);

        rules.add(wordRule);

        setRules(rules.toArray(new IRule[0]));
    }
}
