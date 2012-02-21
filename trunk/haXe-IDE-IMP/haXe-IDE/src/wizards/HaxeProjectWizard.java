package wizards;


import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import workspace.HaxeProjectCreator;
import workspace.WorkspaceUtils;
import workspace.elements.BuildFile;
import workspace.elements.HaxeProject;

public class HaxeProjectWizard extends Wizard implements INewWizard, IExecutableExtension
{

    private ProjectCreationPage pageOne;
    private IConfigurationElement _configurationElement;

    public HaxeProjectWizard() 
    {
        setWindowTitle("Create a haXe project");
    }
    
    @Override
    public void addPages() {
        super.addPages();

        pageOne = new ProjectCreationPage();

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
            String buildFileName = pageOne.getBuildFileName();
            String srcFolder = pageOne.getSrcFolder();
            String outFolder = pageOne.getOutputFolder();
            HaxeProject project = HaxeProjectCreator.createProject(name, location);
            
            // creating build file
            BuildFile buildFile = new BuildFile(
                    buildFileName, 
                    srcFolder, 
                    WorkspaceUtils.getConcatenatedPath(outFolder,project.getName()), 
                    pageOne.getSelectedTarget(), 
                    pageOne.getMainFileName());
            project.addBuildFile(buildFile);
            project.createFile(buildFile.getPathWithName().toString(), buildFile.getContent(), false);
            
            // here the initial structure for project should be
            String[] struct = {srcFolder, outFolder};
            project.createFolders(struct);
            
            // create main file and add it to the project
            project.createFile(pageOne.getMainFileName() + ".hx");
            
            //TODO: find haxe compiler and attach it or inform user about not found
        } catch (NullPointerException e)
        {
            //either name is null or empty
            return false;
        }
        catch (CoreException e)
        {
            e.printStackTrace();
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
