package haxe.ide;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class HaxeProjectWizard extends Wizard implements INewWizard, IExecutableExtension
{

    private WizardNewProjectCreationPage pageOne;
    private IConfigurationElement _configurationElement;

    public HaxeProjectWizard() 
    {
        setWindowTitle("Create a haXe project");
    }
    
    @Override
    public void addPages() {
        super.addPages();

        pageOne = new WizardNewProjectCreationPage("New haXe project");
        pageOne.setTitle("Create a haXe project");
        pageOne.setDescription(
                "Create a haXe project in the workspace or in an " +
                "external location.");
        pageOne.setInitialProjectName("TestingHaxeCreateProject");

        addPage(pageOne);
    }


    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection)
    {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean performFinish() {
        String name = pageOne.getProjectName();
        URI location = null;
        if (!pageOne.useDefaults()) {
            location = pageOne.getLocationURI();
            System.err.println("location: " + location.toString()); //$NON-NLS-1$
        } // else location == null

        try
        {
            HaxeProjectCreator.createProject(name, location);
        } catch (NullPointerException e)
        {
            //either name is null or empty
            return false;
        }

        BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

        return true;
    }


    @Override
    public void setInitializationData(IConfigurationElement config,
            String propertyName, Object data) throws CoreException
    {
        _configurationElement = config;        
    }
}
