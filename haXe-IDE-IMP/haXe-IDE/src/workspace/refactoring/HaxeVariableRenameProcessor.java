package workspace.refactoring;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.imp.utils.Pair;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;
import org.eclipse.ltk.core.refactoring.participants.SharableParticipants;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;

import tree.HaxeTree;
import tree.specific.Declaration;
import tree.specific.Declaration.DeclarationType;
import tree.specific.ErrorNode;
import tree.specific.Function;
import tree.specific.Usage;
import tree.specific.type.HaxeType;
import tree.utils.TreeUtils;
import tree.utils.ReferencesListBuilder;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.elements.HaxeProject;

public class HaxeVariableRenameProcessor extends HaxeRenameProcessor
{ 
    // TODO something usually is added at the beginning e.g. - RuntimePlugin.IMP_RUNTIME for imp
    private static final String ID                      = "haxeVarRenamePreprocessor";
    private static final String NAME                    = "Haxe Variable Rename Preprocessor";
    private static final String CHANGE_NAME             = "Variable Usage rename";
    
    private Declaration targetNode       = null;

    public HaxeVariableRenameProcessor(
            final Declaration node, 
            final String newTargetName, 
            final HaxeProject project)
    {
        super(newTargetName, project);
        
        targetNode = node;
    }

    @Override
    public String getIdentifier()
    {
        return ID;
    }

    @Override
    public String getProcessorName()
    {
        return NAME;
    }

    @Override
    public boolean isApplicable() throws CoreException
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
            throws CoreException, OperationCanceledException
    {
        RefactoringStatus status = super.checkInitialConditions(pm);
        
        if (!status.isOK())
        {
            return status;
        }
        
        DeclarationType type = targetNode.getDeclaratonType();
        HaxeTree searchScope = null;
        switch (type)
        {
            case FunctionParameter:
                searchScope = TreeUtils.getParentFunction(targetNode);
                break;
            case VarDeclaration:
                searchScope = TreeUtils.getParentFunction(targetNode);
                searchScope = ((Function)searchScope).getBlockScope();
                break;
            default:
                searchScope = TreeUtils.getParentType(targetNode);
                break;
        }
        if (haveErrorNodes(searchScope))
        {
            return RefactoringStatus.createErrorStatus(
                    "There are parsing errors. Rename couldn't be processed.");
        }
        return new RefactoringStatus();
    }

    @Override
    public RefactoringStatus checkFinalConditions(
            IProgressMonitor pm,
            CheckConditionsContext context) 
                    throws CoreException, OperationCanceledException
    {
        return super.checkFinalConditions(pm, context);
    }
    
    @Override
    public Change createChange(IProgressMonitor monitor) throws CoreException,
            OperationCanceledException
    {
        try 
        {   //RefactoringCoreMessages.RenameTypeProcessor_creating_changes
            if (monitor != null)
            {
                monitor.beginTask("Searching targets...", 1);
            }
            
            compositeChange = new CompositeChange(CHANGE_NAME);
        
            searchTargets();
            if (monitor != null)
            {
                monitor.beginTask("Creating changes...", 70);
            }
            createChangesForTargets();
            
            return compositeChange;
        }
        finally 
        {
            if (monitor != null)
            {
                monitor.done();
            }
        }
    }

    @Override
    public RefactoringParticipant[] loadParticipants(RefactoringStatus status,
            SharableParticipants sharedParticipants) throws CoreException
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String getOldName()
    {
        return targetNode.getText();
    }
    
    /**
     * Checks is the code already have an object with the same name
     * that will conflict that name
     * TODO maybe we should warn but not completly disable renaming
     * @return the result of checking the code for the same names
     */
    protected RefactoringStatus checkNameAvailability()
    {
        HaxeType type = TreeUtils.getParentType(targetNode);
        HaxeTree decl = type.getDeclaration(newName);
        if (decl != null)
        {
            boolean answer = showConfirmDialog(
                    "Name collision", 
                    "Some other variable have the same name, are you still want to rename?");
            if (!answer)
            {
                return RefactoringStatus.createErrorStatus("Name collision.");
            }
        }
        // TODO do checkNameAvailability
        return new RefactoringStatus();
    }
    
    protected String getTargetPackage()
    {
        return targetNode.getModule().getFullPackage();
    }
    
    private boolean haveErrorNodes(final HaxeTree ast)
    {
        if (ast instanceof ErrorNode)
        {
            return true;
        }
        for (HaxeTree child: ast.getChildren())
        {
            if (child instanceof ErrorNode)
            {
                return true;
            }
            boolean result = haveErrorNodes(child);
            if (result)
            {
                return result;
            }
        }
        
        return false;
    }
    
    /**
     * Searches targets for renaming between over variable usages.
     * The results of the search will be in the 'targets' hashmap
     */
    private void searchTargets()
    {
        targets = new HashMapForLists<Pair>();
        usageBuilder = new ReferencesListBuilder();
        usageBuilder.visit(targetNode);
        
        HashMapForLists<NodeLink> usages = usageBuilder.getResult();
        
        for (String pack : usages.keySet())
        {
            for (NodeLink info : usages.get(pack))
            {
                HaxeTree node = info.getNode();
                Pair pair = null;
                if (node instanceof Usage || node instanceof Declaration)
                {
                    pair = new Pair(
                            node.getToken().getStartIndex(),
                            node.getToken().getStopIndex() - node.getToken().getStartIndex() + 1);
                }
                targets.put(pack, pair);
            }
        }
    }
    
    private void createChangesForTargets()
    {
        for (String pack : targets.keySet())
        {
            // create a change object for the file that contains the property
            // which the user has selected to rename
            IFile file = currentProject.getFile(pack).getRealFile();
            TextFileChange filechange = new TextFileChange( file.getName(), file );
            // a file change contains a tree of edits, first add the root of them
            MultiTextEdit fileChangeRootEdit = new MultiTextEdit();
            filechange.setEdit( fileChangeRootEdit );
            compositeChange.add(filechange);
            
            for (Pair pair : targets.get(pack))
            {
                // edit object for the text replacement in the file, this is the only child
                ReplaceEdit rEdit = new ReplaceEdit( 
                        (int) pair.first,
                        (int) pair.second,
                        "");
                InsertEdit iEdit = new InsertEdit( 
                        (int) pair.first,
                        newName);
                fileChangeRootEdit.addChild(rEdit);
                fileChangeRootEdit.addChild(iEdit);
            }
        }
    }

}
