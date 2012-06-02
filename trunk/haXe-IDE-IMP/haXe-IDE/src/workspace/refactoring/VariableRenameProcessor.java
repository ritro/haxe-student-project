package workspace.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import tree.ErrorNode;
import tree.Function;
import tree.HaxeTree;
import tree.expression.Declaration;
import tree.expression.Usage;
import tree.expression.Declaration.DeclarationType;
import tree.type.HaxeType;
import tree.utils.TreeUtils;
import tree.utils.ReferencesListBuilder;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.elements.HaxeProject;

public class VariableRenameProcessor extends HaxeRenameProcessor
{ 
    // TODO something usually is added at the beginning e.g. - RuntimePlugin.IMP_RUNTIME for imp
    private static final String ID                      = "haxeVarRenamePreprocessor";
    private static final String NAME                    = "Haxe Variable Rename Preprocessor";
    private static final String CHANGE_NAME             = "Variable Usage rename";
    
    private static final List<String> INVALID_NAMES     = new ArrayList<String>()
            {
                private static final long serialVersionUID = 1L;
                {
                    this.addAll(
                            Arrays.asList(new String[]{"new"}));
                }
            };
            
    private Declaration targetNode       = null;

    public VariableRenameProcessor(
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
        if (TreeUtils.haveErrorNodes(searchScope))
        {
            return RefactoringStatus.createErrorStatus(
                    "There are parsing errors. Rename couldn't be processed.");
        }
        return new RefactoringStatus();
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
        // special names, forbidden only for variables
        if (INVALID_NAMES.contains(newName))
        {
            return RefactoringStatus.createFatalErrorStatus("New is invalid");
        }
        // Parent class name the same as new var name
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
    
    /**
     * Searches targets for renaming between over variable usages.
     * The results of the search will be in the 'targets' hashmap
     */
    protected void searchTargets()
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

    @Override
    protected void updateChangeName()
    {
        changeName = CHANGE_NAME;
    }

}
