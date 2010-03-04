package haxe_editor.editors;

import org.eclipse.jface.text.rules.IWordDetector;

public class HaxeWordDetector implements IWordDetector {

    @Override
    public boolean isWordPart(char c) {
        return (Character.isLetter(c) || c == '_');

    }

    @Override
    public boolean isWordStart(char c) {
        return (Character.isLetterOrDigit(c) || c == '_');

    }

}
