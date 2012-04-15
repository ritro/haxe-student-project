package workspace.refactoring;

import haxe.tree.utils.ReferencesListBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.imp.utils.Pair;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;
import org.eclipse.ltk.core.refactoring.participants.RenameProcessor;
import org.eclipse.ltk.core.refactoring.participants.SharableParticipants;

import workspace.HashMapForLists;
import workspace.elements.HaxeProject;

public abstract class HaxeRenameProcessor extends RenameProcessor
{
    private static final List<String> INVALID_NAMES     = new ArrayList<String>()
            {
                private static final long serialVersionUID = 1L;
                {
                    this.addAll(
                            Arrays.asList(new String[]{"this", "super"}));
                }
            };
            
    protected ReferencesListBuilder usageBuilder  = null;
    protected CompositeChange compositeChange     = null;
    protected HaxeProject currentProject          = null;    
    protected HashMapForLists<Pair> targets       = null;
    protected String newName                      = null;
    
    public HaxeRenameProcessor(
            final String newTargetName, 
            final HaxeProject project)
    {
        newName = newTargetName;
        currentProject = project;
    }
            
    
    @Override
    public Object[] getElements()
    {
        return targets.getAll().toArray();
    }

    @Override
    public abstract String getIdentifier();

    @Override
    public abstract String getProcessorName();

    @Override
    public abstract boolean isApplicable() throws CoreException;

    @Override
    public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
            throws CoreException, OperationCanceledException
    {
        try
        {
            pm.beginTask("Checking initial conditions...", 1);
            
            if ( newName == null || newName.isEmpty() || INVALID_NAMES.contains(newName))
            {
                return RefactoringStatus.createFatalErrorStatus("New name is null or empty");
            }
            if ( newName.equals(getOldName()))
            {
                return RefactoringStatus.createErrorStatus("New name is the same as old name");
            }
            return checkNameAvailability();
        }
        finally
        {
            pm.done();
        }
    }

    @Override
    public abstract RefactoringStatus checkFinalConditions(IProgressMonitor pm,
            CheckConditionsContext context) throws CoreException,
            OperationCanceledException;

    @Override
    public abstract Change createChange(IProgressMonitor pm) throws CoreException,
            OperationCanceledException;

    @Override
    public abstract RefactoringParticipant[] loadParticipants(RefactoringStatus status,
            SharableParticipants sharedParticipants) throws CoreException;
    
    protected abstract String getOldName();
    protected abstract RefactoringStatus checkNameAvailability();
}
