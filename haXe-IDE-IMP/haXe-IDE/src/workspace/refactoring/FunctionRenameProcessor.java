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
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;
import org.eclipse.ltk.core.refactoring.participants.SharableParticipants;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;

import tree.Function;
import tree.HaxeTree;
import tree.expression.Declaration;
import tree.expression.Usage;
import tree.expression.Declaration.DeclarationType;
import tree.type.HaxeType;
import tree.utils.ReferencesListBuilder;
import tree.utils.TreeUtils;
import workspace.HashMapForLists;
import workspace.NodeLink;
import workspace.elements.HaxeProject;

public class FunctionRenameProcessor extends HaxeRenameProcessor
{   
    private static final String ID                      = "haxeFunRenamePreprocessor";
    private static final String NAME                    = "Haxe Function Rename Preprocessor";
    private static final String CHANGE_NAME             = "Function rename";

    private Function targetNode       = null;

    public FunctionRenameProcessor(
            final Function node, 
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
        
        HaxeTree searchScope = TreeUtils.getParentType(targetNode);
        
        if (TreeUtils.haveErrorNodes(searchScope))
        {
            return RefactoringStatus.createErrorStatus(
                    "There are parsing errors. Rename couldn't be processed.");
        }
        return new RefactoringStatus();
    }

    @Override
    protected String getTargetPackage()
    {
        return targetNode.getModule().getFullPackage();
    }

    @Override
    protected String getOldName()
    {
        return targetNode.getText();
    }
    
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
                if (node instanceof Usage || node instanceof Function)
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
    protected RefactoringStatus checkNameAvailability()
    {
        return new RefactoringStatus();
    }

    @Override
    protected void updateChangeName()
    {
        changeName = CHANGE_NAME;
    }

}
