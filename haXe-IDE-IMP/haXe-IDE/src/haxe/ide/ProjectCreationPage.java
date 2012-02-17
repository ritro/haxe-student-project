package haxe.ide;

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

public class ProjectCreationPage extends WizardNewProjectCreationPage
{
    private static String _defaultPageName = "New haXe project";
    private static String _defaultTitle = "Create a haXe project";
    private static String _defaultDescription = 
            "Create a haXe project in the workspace or in an external location.";
    private static String _defaultProjectName = "TestingHaxeCreateProject";
    private static String[] _defaultTargets = {"Flash9", "C++", "NekoVM"};
    
    private final Listener validateOnModify = new Listener() 
    {
        public void handleEvent(Event e) 
        {
            setPageComplete(validatePage());
        }
    };
    
    private enum Targets 
    {
        FLASH_9, 
        C_PLUS_PLUS, 
        NEKO_VM
    };

    private Text buildFileNameField;
    private Text srcFolderField;
    private Text outputFolderField;
    private Targets selectedTarget = Targets.FLASH_9;

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
        buildFileLabel.setText("Build target:");
        buildFileLabel.setFont(parent.getFont());

        // build target combobox
        Combo targetsCombo = new Combo(group, SWT.NONE);
        targetsCombo.setItems(_defaultTargets);
        targetsCombo.select(0);
        targetsCombo.setLayoutData(dataFillHorizontal);
        
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
    }

    @Override
    protected boolean validatePage() 
    {            
        // Validates the project name and project location fields.
        if (!super.validatePage()) {
                return false;
        }
        
        return true;
    }
}
