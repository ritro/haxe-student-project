package haxe_editor.editors.scanners;

import haxe_editor.editors.ColorManager;
import haxe_editor.editors.HaxeWhitespaceDetector;
import haxe_editor.editors.IXMLColorConstants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

public class HaxeCommentScanner extends RuleBasedScanner {
    public HaxeCommentScanner(ColorManager manager) {
        IToken comment = new Token(new TextAttribute(manager
                .getColor(IXMLColorConstants.SINGLE_LINE_COMMENT)));

        List<IRule> rules = new ArrayList<IRule>();
        // Add generic whitespace rule.
        rules.add(new WhitespaceRule(new HaxeWhitespaceDetector()));
        // For single line comment
        rules.add(new EndOfLineRule("//", comment));

        setRules(rules.toArray(new IRule[0]));
    }

}
