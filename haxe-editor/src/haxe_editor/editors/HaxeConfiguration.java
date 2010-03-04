package haxe_editor.editors;

import haxe_editor.editors.scanners.HaxeCommentScanner;
import haxe_editor.editors.scanners.HaxeKeywordScanner;
import haxe_editor.editors.scanners.HaxeMultiLineCommentScanner;
import haxe_editor.editors.scanners.HaxePartitionScanner;
import haxe_editor.editors.scanners.HaxeStringScanner;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class HaxeConfiguration extends SourceViewerConfiguration {
    private XMLDoubleClickStrategy doubleClickStrategy;
    private HaxeKeywordScanner keywordScanner;
    private HaxeCommentScanner commentScanner;
    private HaxeMultiLineCommentScanner multyCommentScanner;

    private HaxeStringScanner stringScanner;
    private ColorManager colorManager;

    public HaxeConfiguration(ColorManager colorManager) {
        this.colorManager = colorManager;
    }

    public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
        return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
                HaxePartitionScanner.MULTILINE_COMMENT,
                HaxePartitionScanner.SINGLELINE_COMMENT, HaxePartitionScanner.STRING };
    }

    public ITextDoubleClickStrategy getDoubleClickStrategy(ISourceViewer sourceViewer,
            String contentType) {
        if (doubleClickStrategy == null)
            doubleClickStrategy = new XMLDoubleClickStrategy();
        return doubleClickStrategy;
    }

    protected HaxeStringScanner getHaxeStringScanner() {
        if (stringScanner == null) {
            stringScanner = new HaxeStringScanner(colorManager);
            stringScanner.setDefaultReturnToken(new Token(new TextAttribute(colorManager
                    .getColor(IXMLColorConstants.STRING))));
        }
        return stringScanner;
    }

    protected HaxeKeywordScanner getHaxeKeywordScanner() {
        if (keywordScanner == null) {
            keywordScanner = new HaxeKeywordScanner(colorManager);
            keywordScanner.setDefaultReturnToken(new Token(new TextAttribute(colorManager
                    .getColor(IXMLColorConstants.KEYWORD))));
        }
        return keywordScanner;
    }

    protected HaxeCommentScanner getHaxeCommentScanner() {
        if (commentScanner == null) {
            commentScanner = new HaxeCommentScanner(colorManager);
            commentScanner.setDefaultReturnToken(new Token(new TextAttribute(colorManager
                    .getColor(IXMLColorConstants.SINGLE_LINE_COMMENT))));
        }
        return commentScanner;
    }

    protected HaxeMultiLineCommentScanner getHaxeMultiLineCommentScanner() {
        if (multyCommentScanner == null) {
            multyCommentScanner = new HaxeMultiLineCommentScanner(colorManager);
            multyCommentScanner.setDefaultReturnToken(new Token(new TextAttribute(
                    colorManager.getColor(IXMLColorConstants.SINGLE_LINE_COMMENT))));
        }
        return multyCommentScanner;
    }

    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
        PresentationReconciler reconciler = new PresentationReconciler();
        DefaultDamagerRepairer damagerRepairer;

        damagerRepairer = new DefaultDamagerRepairer(getHaxeKeywordScanner());
        reconciler.setDamager(damagerRepairer, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(damagerRepairer, IDocument.DEFAULT_CONTENT_TYPE);

        damagerRepairer = new DefaultDamagerRepairer(getHaxeStringScanner());
        reconciler.setDamager(damagerRepairer, HaxePartitionScanner.STRING);
        reconciler.setRepairer(damagerRepairer, HaxePartitionScanner.STRING);

        damagerRepairer = new DefaultDamagerRepairer(getHaxeCommentScanner());
        reconciler.setDamager(damagerRepairer, HaxePartitionScanner.SINGLELINE_COMMENT);
        reconciler.setRepairer(damagerRepairer, HaxePartitionScanner.SINGLELINE_COMMENT);

        damagerRepairer = new DefaultDamagerRepairer(getHaxeMultiLineCommentScanner());
        reconciler.setDamager(damagerRepairer, HaxePartitionScanner.MULTILINE_COMMENT);
        reconciler.setRepairer(damagerRepairer, HaxePartitionScanner.MULTILINE_COMMENT);

        // damagerRepairer = new
        // DefaultDamagerRepairer(getHaxeSingleLineCommentScanner());
        // reconciler.setDamager(damagerRepairer,
        // HaxePartitionScanner.MULTILINE_COMMENT);
        // reconciler.setRepairer(damagerRepairer,
        // HaxePartitionScanner.MULTILINE_COMMENT);

        // dr = new DefaultDamagerRepairer(getHaxeScanner());
        // reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        // reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
        //
        // NonRuleBasedDamagerRepairer ndr = new NonRuleBasedDamagerRepairer(
        // new TextAttribute(colorManager
        // .getColor(IXMLColorConstants.MULTI_LINE_COMMENT)));
        // reconciler.setDamager(ndr, HaxePartitionScanner.MULTILINE_COMMENT);
        // reconciler.setRepairer(ndr, HaxePartitionScanner.MULTILINE_COMMENT);

        return reconciler;
    }

}
