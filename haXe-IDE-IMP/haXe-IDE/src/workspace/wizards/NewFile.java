package workspace.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

import workspace.elements.CodeFile;

public class NewFile extends BasicNewFileResourceWizard
{
    public NewFile() {}

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection)
    {
        super.init(workbench, selection);
    }

    @Override
    public boolean performFinish()
    {
        WizardNewFileCreationPage page = ((WizardNewFileCreationPage)getPage("newFilePage1"));
        String fileName = page.getFileName();
        if (!fileName.endsWith(CodeFile.EXTENTION_WITH_DOT))
        {
            fileName += CodeFile.EXTENTION_WITH_DOT;
        }
        page.setFileName(fileName);
        
        return super.performFinish();
    }
}
