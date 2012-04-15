package workspace.refactoring;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.tree.utils.ReferencesListBuilder;

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
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;

import workspace.HashMapForLists;
import workspace.elements.HaxeProject;

public class HaxeVariableRenameProcessor extends HaxeRenameProcessor
{ 
    // TODO something usually is added at the beginning e.g. - RuntimePlugin.IMP_RUNTIME for imp
    private static final String ID                      = "haxeVarRenamePreprocessor";
    private static final String NAME                    = "Haxe Variable Rename Preprocessor";
    private static final String CHANGE_NAME             = "Variable Usage rename";
    
    private VarDeclarationNode targetNode       = null;

    public HaxeVariableRenameProcessor(
            final VarDeclarationNode node, 
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
    public RefactoringStatus checkFinalConditions(
            IProgressMonitor pm,
            CheckConditionsContext context) 
                    throws CoreException, OperationCanceledException
    {
        pm.beginTask("Checking final conditions...", 1);
        // as long as nothing is here - it is a stub
        pm.done();
        return new RefactoringStatus();
    }
    
    @Override
    public Change createChange(IProgressMonitor monitor) throws CoreException,
            OperationCanceledException
    {
        try 
        {   //RefactoringCoreMessages.RenameTypeProcessor_creating_changes
            if (monitor != null)
            {
                monitor.beginTask("Creating changes...", 1);
            }
            
            compositeChange = new CompositeChange(CHANGE_NAME);
        
            searchTargets();
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
        // TODO do checkNameAvailability
        return new RefactoringStatus();
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
        
        HashMapForLists<HaxeTree> usages = usageBuilder.getResult();
        
        for (String pack : usages.keySet())
        {
            for (HaxeTree node : usages.get(pack))
            {
                Pair pair = null;
                if (node instanceof VarUsageNode)
                {
                    pair = new Pair(
                        node.getMostLeftPosition(), 
                        node.getMostRightPosition() - node.getMostLeftPosition() + 1);
                }
                else //VarDeclaration 
                {
                    pair = new Pair(
                            node.getToken().getStartIndex(),
                            node.getToken().getStopIndex() - node.getToken().getStartIndex() + 1
                            );
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
                ReplaceEdit edit = new ReplaceEdit( 
                        (int) pair.first,
                        (int) pair.second,
                        newName);
                fileChangeRootEdit.addChild( edit );                 
            }
        }
    }

}
