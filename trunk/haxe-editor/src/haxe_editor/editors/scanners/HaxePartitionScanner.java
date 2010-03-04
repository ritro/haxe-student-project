package haxe_editor.editors.scanners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class HaxePartitionScanner extends RuleBasedPartitionScanner {
    public final static String MULTILINE_COMMENT = "multiline_comment";
    public final static String SINGLELINE_COMMENT = "singleline_comment";
    public final static String STRING = "string";
    public final static String KEYWORD = "keyword";
    public final static String[] PARTITION_TYPES = new String[] { MULTILINE_COMMENT,
            SINGLELINE_COMMENT, STRING, KEYWORD };

    public HaxePartitionScanner() {
        super();
        IToken multilinecomment = new Token(MULTILINE_COMMENT);
        IToken singlelinecomment = new Token(SINGLELINE_COMMENT);
        IToken string = new Token(STRING);

        List<IPredicateRule> rules = new ArrayList<IPredicateRule>();
        // Add rule for single line comments.
        rules.add(new EndOfLineRule("//", singlelinecomment));
        // Add rule for strings and character constants.
        rules.add(new MultiLineRule("\"", "\"", string, '\\'));
        rules.add(new MultiLineRule("'", "'", string, '\\'));
        // Add rules for multi-line comments and javadoc.
        rules.add(new MultiLineRule("/*", "*/", multilinecomment, (char) 0, true));

        IPredicateRule[] result = new IPredicateRule[rules.size()];
        rules.toArray(result);
        setPredicateRules(rules.toArray(new IPredicateRule[0]));
    }
}
