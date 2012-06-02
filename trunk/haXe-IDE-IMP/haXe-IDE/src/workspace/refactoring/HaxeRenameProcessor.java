package workspace.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
import org.eclipse.ltk.core.refactoring.participants.RenameProcessor;
import org.eclipse.ltk.core.refactoring.participants.SharableParticipants;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;

import tree.utils.ReferencesListBuilder;
import workspace.Activator;
import workspace.HashMapForLists;
import workspace.elements.CodeFile;
import workspace.elements.HaxeLibProject;
import workspace.elements.HaxeProject;

public abstract class HaxeRenameProcessor extends RenameProcessor
{
    private static final List<String> INVALID_NAMES     = new ArrayList<String>()
            {
                private static final long serialVersionUID = 1L;
                {
                    this.addAll(
                            Arrays.asList(new String[]{"this", "super",
                                    // and practically all keywords
                                    "for", "else", "if", "catch", "try",
                                    "while", "do", "switch", "case", 
                                    "function", "class", "enum", "interface", "var",
                                    "true", "false"}));
                }
            };
            
    protected ReferencesListBuilder usageBuilder  = null;
    protected CompositeChange compositeChange     = null;
    protected HaxeProject currentProject          = null;    
    protected HashMapForLists<Pair> targets       = null;
    protected String newName                      = null;    
    protected String changeName                   = null;
    
    public HaxeRenameProcessor(
            final String newTargetName, 
            final HaxeProject project)
    {
        newName = newTargetName;
        currentProject = project;
        
        updateChangeName();
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
        String pack = getTargetPackage();
        // check if file is from haxe lib
        HaxeLibProject project = Activator.getProjectManager().getHaxeLib();
        CodeFile file = project.getFile(pack);
        if (file != null)
        {
            return RefactoringStatus.createErrorStatus("Can't edit library file");
        }        
        // available for editing
        HaxeProject proj = Activator.getProjectManager().getCurrentHaxeProject();
        file = proj.getFile(pack);
        if (file.getRealFile().getResourceAttributes().isReadOnly())
        {
            return RefactoringStatus.createErrorStatus("File isn't editable");
        }
        
        return new RefactoringStatus();
    }

    @Override
    public RefactoringStatus checkFinalConditions(
            IProgressMonitor pm, CheckConditionsContext context) 
            throws CoreException, OperationCanceledException
    {
        try
        {
            pm.beginTask("Checking final conditions...", 1);
            
            if ( newName == null || newName.isEmpty())
            {
                return RefactoringStatus.createFatalErrorStatus("New name is null or empty");
            }
            
            Pattern p = Pattern.compile( "[a-zA-Z_][a-zA-Z0-9_]*");
            Matcher m = p.matcher(newName);
            if (INVALID_NAMES.contains(newName) || !m.matches())
            {
                return RefactoringStatus.createFatalErrorStatus("New name is invalid");
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
    public Change createChange(IProgressMonitor monitor) throws CoreException,
            OperationCanceledException
    {
        try 
        {
            if (monitor != null)
            {
                monitor.beginTask("Searching targets...", 1);
            }
            
            compositeChange = new CompositeChange(changeName);
        
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
    
    protected abstract String getTargetPackage();
    protected abstract String getOldName();
    protected abstract RefactoringStatus checkNameAvailability();
    
    protected boolean showConfirmDialog(String title, String message)
    {
        JFrame frame = new JFrame();
        int result = JOptionPane.showConfirmDialog(
                            frame,
                            message,
                            title,
                            JOptionPane.OK_CANCEL_OPTION);
        return result == JOptionPane.OK_OPTION;

        
    }
    
    protected abstract void updateChangeName();    
    protected abstract void searchTargets();
    
    protected void createChangesForTargets()
    {
        if (targets == null)
        {
            return;
        }
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
