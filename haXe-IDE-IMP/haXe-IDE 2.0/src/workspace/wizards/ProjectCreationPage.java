package workspace.wizards;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import workspace.WorkspaceUtils;
import workspace.elements.BuildFile;
import workspace.elements.HaxeProject;
import workspace.elements.BuildFile.Targets;

public class ProjectCreationPage extends WizardNewProjectCreationPage
{
    private static String _defaultPageName = "New haXe project";
    private static String _defaultTitle = "Create a haXe project";
    private static String _defaultDescription = 
            "Create a haXe project in the workspace or in an external location.";
    private static String _defaultProjectName = "TestingHaxeCreateProject";
    private static String[] _defaultTargets = {"JavaScript", "Flash9", "ActionScript3", "NekoVM", "C++", "PHP"};
    
    private final Listener validateOnModify = new Listener() 
    {
        public void handleEvent(Event e) 
        {
            setPageComplete(validatePage());
        }
    };
    
    private final Listener updateOnModify = new Listener() 
    {
        public void handleEvent(Event e) 
        {
            switch (((Combo)e.widget).getSelectionIndex())
            {
                case 0:
                    selectedTarget = Targets.JAVA_SCRIPT;
                    break;
                case 1:
                    selectedTarget = Targets.FLASH_9;
                    break;
                case 2:
                    selectedTarget = Targets.ACTION_SCRIPT;
                    break;
                case 3:
                    selectedTarget = Targets.NEKO_VM;
                    break;
                case 4:
                    selectedTarget = Targets.C_PLUS_PLUS;
                    break;
                default:
                    selectedTarget = Targets.PHP;
            }
        }
    };

    private Text buildFileNameField;
    private Text srcFolderField;
    private Text outputFolderField;
    private Text mainFileField;
    private Targets selectedTarget = Targets.FLASH_9;
    
    public Targets getSelectedTarget()
    {
        return selectedTarget;
    }
    
    public String getBuildFileName()
    {
        return buildFileNameField.getText().trim();
    }
    
    public String getSrcFolder()
    {
        return srcFolderField.getText().trim();
    }
    
    public String getOutputFolder()
    {
        return outputFolderField.getText().trim();
    }
    
    public String getMainFileName()
    {
        return mainFileField.getText().trim();
    }

    public ProjectCreationPage() 
    {
        super(_defaultPageName);
        
        setTitle(_defaultTitle);
        setDescription(_defaultDescription);
        setInitialProjectName(_defaultProjectName);
    }
    
    @Override
    public void createControl(Composite parent) 
    {
        super.createControl(parent);

        Group group = new Group((Composite) getControl(), SWT.NONE);
        group.setText("Project settings");
        group.setLayout(new GridLayout(2, false));
        group.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                        | GridData.HORIZONTAL_ALIGN_FILL));

        // common data grid
        GridData dataFillHorizontal = new GridData(GridData.FILL_HORIZONTAL);
        
        // build file name lable
        Label buildFileNameLabel = new Label(group, SWT.NONE);
        buildFileNameLabel.setText("Build file name:");
        buildFileNameLabel.setFont(parent.getFont());
        
        // build filename ...
        buildFileNameField = new Text(group, SWT.BORDER);
        buildFileNameField.setText(BuildFile._defaultName); 
        buildFileNameField.setFont(parent.getFont());       
        buildFileNameField.setLayoutData(dataFillHorizontal);
        buildFileNameField.addListener(SWT.Modify, validateOnModify);
        
        // build target
        Label buildFileLabel = new Label(group, SWT.NONE);
        buildFileLabel.setText("Build Target:");
        buildFileLabel.setFont(parent.getFont());

        // build target combobox
        Combo targetsCombo = new Combo(group, SWT.NONE);
        targetsCombo.setItems(_defaultTargets);
        targetsCombo.select(0);
        targetsCombo.setLayoutData(dataFillHorizontal);
        targetsCombo.addListener(SWT.Modify, updateOnModify);
        
        // source folder label
        Label srcFolderLabel = new Label(group, SWT.NONE);
        srcFolderLabel.setText("Source Folder:");
        srcFolderLabel.setFont(parent.getFont());

        // source folder entry field
        srcFolderField = new Text(group, SWT.BORDER);
        srcFolderField.setText(BuildFile._defaultSourceFolderName);
        srcFolderField.setFont(parent.getFont());
        srcFolderField.setLayoutData(dataFillHorizontal);
        srcFolderField.addListener(SWT.Modify, validateOnModify);

        // Output folder label
        Label binFolderLabel = new Label(group, SWT.NONE);
        binFolderLabel.setText("Output Folder:");
        binFolderLabel.setFont(parent.getFont());

        // output folder entry field
        outputFolderField = new Text(group, SWT.BORDER);
        outputFolderField.setText(BuildFile._defaultOutputFolderName);
        outputFolderField.setFont(parent.getFont());
        outputFolderField.setLayoutData(dataFillHorizontal);
        outputFolderField.addListener(SWT.Modify, validateOnModify);        
        
        // Output folder label
        Label mainFileLabel = new Label(group, SWT.NONE);
        mainFileLabel.setText("Main File Name with path:");
        mainFileLabel.setFont(parent.getFont());

        // output folder entry field
        mainFileField = new Text(group, SWT.BORDER);
        mainFileField.setText(BuildFile._defaultMainFileName);
        mainFileField.setFont(parent.getFont());
        mainFileField.setLayoutData(dataFillHorizontal);
        mainFileField.addListener(SWT.Modify, validateOnModify);
    }

    @Override
    protected boolean validatePage() 
    {            
        // Validates the project name and project location fields.
        if (!super.validatePage()) 
        {
            return false;
        }
        
        if (buildFileNameField == null)
        {
            // the validation was prior the componen creation
            return true;
        }
        
        if (getBuildFileName().isEmpty())
        {
            setErrorMessage("Build file name cannot be empty.");
            return false;
        }
        
        if (getMainFileName().isEmpty())
        {
            setErrorMessage("Main file name cannot be empty.");
            return false;
        }
        
        return true;
    }
}
