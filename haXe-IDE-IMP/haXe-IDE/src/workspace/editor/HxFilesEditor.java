package workspace.editor;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.tree.utils.CallHierarchyBuilder;
import haxe.tree.utils.HaxeTreePrinter;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.editor.UniversalEditor;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.editors.text.DefaultEncodingSupport;
import org.eclipse.ui.editors.text.TextFileDocumentProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.omg.IOP.Encoding;

import workspace.Activator;
import workspace.WorkspaceUtils;
import workspace.elements.HaxeProject;

public class HxFilesEditor extends UniversalEditor
{    
    @Override
    protected void handleCursorPositionChanged() 
    {
        super.handleCursorPositionChanged();
        makeCallHierarchyAnalisys();
    }
/*
    @Override
    public IDocumentProvider getDocumentProvider() 
    {
        IEditorInput input = getEditorInput();
        if (input instanceof IURIEditorInput) 
        {
            IURIEditorInput uriEditorInput = (IURIEditorInput) input;
            URI uri= uriEditorInput.getURI();
            String path= uri.getPath();
            if (path.contains(".jar:") || path.contains(".zip:")) 
            {
                super.getDocumentProvider();
            }
        }
        if(input instanceof IFileEditorInput)
        {
            try
            {
                InputStream stream = ((FileEditorInput)input).getFile().getContents();
            
                Charset encording = 
                        WorkspaceUtils.getEncoding(new PushbackInputStream(stream));
                if (encording == null)
                {
                    fEncodingSupport = new DefaultEncodingSupport();
                }
            }
            catch (IOException | CoreException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            FileEditorInput in = new FileEditorInput(((FileEditorInput)input).getFile());
            return new documentProvider();
        } 
        return super.getDocumentProvider();
    }*/
    
    private void makeCallHierarchyAnalisys()
    {
        HaxeProject project = Activator.getInstance().getCurrentHaxeProject();
        if (project == null)
        {
            return;
        }
        HaxeTree node = getNodeToLookAt(project);
        if (node == null)
        {
            Activator.logger.info("HxFilesEditor.makeCallHierarchyAnalisys failed - node not found.");
            return;
        }
        // TODO remove later:
        if (!(node instanceof VarUsageNode))
        {
            return;
        }
        /*        
        try
        {
            ast = WorkspaceUtils.parseFileContents(file.getContents());
        }
        catch (RecognitionException | IOException | CoreException e)
        {
            // Auto-generated catch block
            e.printStackTrace();
            return;
        }
        HaxeTreeLinker linker = new HaxeTreeLinker();
        linker.visit(ast);*/
        
        CallHierarchyBuilder callFinder = new CallHierarchyBuilder();
        callFinder.visit(node);
        HashMap<String, List<HaxeTree>> result = callFinder.getResult();
        for (List<HaxeTree> value : result.values())
        {
            HaxeTreePrinter printer = new HaxeTreePrinter();
            printer.printArray(value);
        }
        Activator.getInstance().callH = result;
        Activator.getInstance().currNode = node;     
    }
    
    private HaxeTree getNodeToLookAt(HaxeProject project)
    {
        HaxeTree ast = project.getFileAST(Activator.getInstance().activeFile);
        // TODO should do smth with changing text
                //(HaxeTree) getParseController().getCurrentAst();
        if (ast == null)
        {
            return null;
        }
        TextSelection selection = (TextSelection)getSelectionProvider().getSelection();
        return WorkspaceUtils.getNodeUnderCursor(selection.getOffset(), selection.getLength(), ast);
    }
}
