package haxe_editor.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class HaxeEditor extends TextEditor {

	private ColorManager colorManager;

	public HaxeEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new HaxeConfiguration(colorManager));
		setDocumentProvider(new HaxeDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
