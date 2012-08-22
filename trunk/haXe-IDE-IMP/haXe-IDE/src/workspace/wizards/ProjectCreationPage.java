package workspace.wizards;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import workspace.WorkspaceUtils;
import workspace.editor.BuildFileDesignerPage;
import workspace.elements.BuildFile;

public class ProjectCreationPage extends WizardNewProjectCreationPage
{
    private static String _defaultPageName = "New haXe project";
    private static String _defaultTitle = "Create a haXe project";
    private static String _defaultDescription = 
            "Create a haXe project in the workspace or in an external location.";
    private static String _defaultProjectName = "TestingHaxeCreateProject";

    private BuildFileDesignerPage buildFileDesigner = null;
    
    private final Listener validateOnModify = new Listener() 
    {
        public void handleEvent(Event e) 
        {
            setPageComplete(validatePage());
        }
    };
    
    public String getSrcFolder()
    {
        return buildFileDesigner.getSrcFolder();
    }
    
    public String getOutputFolder()
    {
        return buildFileDesigner.getOutputFolder();
    }
    
    public String getMainFileName()
    {
        return buildFileDesigner.getMainFileName();
    }
    
    public BuildFile getBuildFile()
    {
        BuildFile buildFile = new BuildFile(
                buildFileDesigner.getBuildFileName(), 
                buildFileDesigner.getSrcFolder(), 
                WorkspaceUtils.getConcatenatedPath(buildFileDesigner.getOutputFolder(),getProjectName()), 
                buildFileDesigner.getSelectedTarget(), 
                buildFileDesigner.getMainFileName());
        return buildFile;
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

        buildFileDesigner = new BuildFileDesignerPage();
        buildFileDesigner.initialize(group);
        buildFileDesigner.SetModifyListener(validateOnModify);
    }

    @Override
    protected boolean validatePage() 
    {            
        // Validates the project name and project location fields.
        if (!super.validatePage()) 
        {
            return false;
        }
        
        if (buildFileDesigner == null)
        {
            // the validation was prior the componen creation
            return true;
        }
        
        if (buildFileDesigner.getBuildFileName().isEmpty())
        {
            setErrorMessage("Build file name cannot be empty.");
            return false;
        }
        
        if (buildFileDesigner.getMainFileName().isEmpty())
        {
            setErrorMessage("Main file name cannot be empty.");
            return false;
        }
        
        return true;
    }
}
