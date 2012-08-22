package workspace.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import workspace.Activator;
import workspace.WorkspaceUtils;
import workspace.elements.BuildFile;
import workspace.elements.BuildFile.Targets;
import workspace.elements.CodeFile;

public class BuildFileDesignerPage
{
    public static String DEFAULT_MAIN_FILENAME = "\\Main";
    
    private static String[] COMBO_TARGETS_STRING = 
        {
        "JavaScript", "Flash9", "ActionScript3", "NekoVM", "C++", "PHP"
        };
    
    private String oldSrcFolder = BuildFile.DEFAULT_SRC_FOLDER_NAME;
    private Text buildFileNameField;
    private Text srcFolderField;
    private Text outputFolderField;
    private Text mainFileField;
    private Combo targetsCombo;
    private Listener outerListener = null;    
    private final Listener modifyListener = new Listener() 
    {
        public void handleEvent(Event e) 
        {
            if (outerListener != null)
            {
                outerListener.handleEvent(e);
            }
        }
    };
    
    public Targets getSelectedTarget()
    {
        return getTargetByComboIndex(targetsCombo.getSelectionIndex());
    }
    
    public void setTarget(Targets target)
    {
        targetsCombo.select(getTargetsComboIndex(target));
    }
    
    public String getBuildFileName()
    {
        return buildFileNameField.getText().trim();
    }
    
    public void setBuildFileName(String name)
    {
        buildFileNameField.setText(name);
    }
    
    public String getSrcFolder()
    {
        return srcFolderField.getText().trim();
    }
    
    public void setSrcFolder(String path)
    {
        srcFolderField.setText(path);
    }
    
    public String getOutputFolder()
    {
        return outputFolderField.getText().trim();
    }
    
    public void setOutputFolder(String path)
    {
        outputFolderField.setText(path);
    }
    
    public String getMainFileName()
    {
        return mainFileField.getText().trim();
    }
    
    public void setMainFileName(String name)
    {
        mainFileField.setText(name);
    }
    
    public void SetModifyListener(Listener listener)
    {
        outerListener = listener;
    }
    
    public void initialize(final Composite parent)
    {
        // common data grid
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 3;        
        parent.setLayout(gridLayout);

        GridData dataFillHorizontal = new GridData(GridData.FILL, GridData.CENTER, true, false); 
        dataFillHorizontal.horizontalSpan = 2;
        
        // build file name lable
        new Label(parent, SWT.NONE).setText("Build file name:");
        
        // build filename ...
        buildFileNameField = new Text(parent, SWT.BORDER);
        buildFileNameField.setText(BuildFile.DEFAULT_NAME); 
        buildFileNameField.setFont(parent.getFont());       
        buildFileNameField.setLayoutData(dataFillHorizontal);
        buildFileNameField.addListener(SWT.Modify, modifyListener);
        
        // build target
        new Label(parent, SWT.NONE).setText("Build Target:");

        // build target combobox
        targetsCombo = new Combo(parent, SWT.NONE);
        targetsCombo.setItems(COMBO_TARGETS_STRING);
        targetsCombo.select(0);
        targetsCombo.setLayoutData(dataFillHorizontal);
        targetsCombo.addListener(SWT.Modify, modifyListener);
        
        // source folder label
        new Label(parent, SWT.NONE).setText("Source Folder:");

        // source folder entry field
        srcFolderField = new Text(parent, SWT.BORDER);
        srcFolderField.setText(BuildFile.DEFAULT_SRC_FOLDER_NAME);
        srcFolderField.setFont(parent.getFont());
        srcFolderField.setLayoutData(dataFillHorizontal);
        srcFolderField.addListener(SWT.Modify, validateOnModifySrc);

        // Output folder label
        new Label(parent, SWT.NONE).setText("Output Folder:");

        // output folder entry field
        outputFolderField = new Text(parent, SWT.BORDER);
        outputFolderField.setText(BuildFile.DEFAULT_OUT_FOLDER_NAME);
        outputFolderField.setFont(parent.getFont());
        outputFolderField.setLayoutData(dataFillHorizontal);  
        outputFolderField.addListener(SWT.Modify, modifyListener);     
        
        // Output folder label
        new Label(parent, SWT.NONE).setText("Main class package:");
  
        dataFillHorizontal = new GridData(GridData.FILL, GridData.CENTER, true, false);
        // output folder entry field
        mainFileField = new Text(parent, SWT.BORDER);
        mainFileField.setText(BuildFile.DEFAULT_MAIN_CLASS_PACK);
        mainFileField.setFont(parent.getFont());
        mainFileField.setLayoutData(dataFillHorizontal);
        mainFileField.addListener(SWT.Modify, modifyListener); 

        dataFillHorizontal = new GridData(GridData.END, GridData.CENTER, false, false);
        Button button = new Button(parent, SWT.NONE);
        button.setFont(parent.getFont());
        button.setText("Browse");
        button.setLayoutData(dataFillHorizontal);
        button.addSelectionListener(new SelectionListener() 
        {
            @Override
            public void widgetSelected(SelectionEvent e)
            {
                selectFile(parent);                
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e)
            {
                // TODO Auto-generated method stub
                
            }
        });
    }
    
    private void selectFile(Composite parent)
    {
        FileDialog fileDialog = new FileDialog(parent.getShell());
        fileDialog.setFilterExtensions(new String[]{"*.hx"});
        String path = fileDialog.open();
        if (path != null)
        {
            IFile file = WorkspaceUtils.getFileFromWorkspace(path);
            if (file == null)
            {
                return;
            }
            CodeFile codeFile = Activator.getProjectManager().getCurrentHaxeProject().getFile(file);
            mainFileField.setText(codeFile.getPackage());
        }
    }
    
    private Targets getTargetByComboIndex(int index)
    {
        switch (index)
        {
            case 0: return Targets.JAVA_SCRIPT;
            case 1: return Targets.FLASH_9;
            case 2: return Targets.ACTION_SCRIPT;
            case 3: return Targets.NEKO_VM;
            case 4: return Targets.C_PLUS_PLUS;
            default: return Targets.PHP;
        }
    }
    private int getTargetsComboIndex(Targets target) 
    {
        switch (target)
        {
            case JAVA_SCRIPT: return 0;
            case FLASH_9: return 1;
            case ACTION_SCRIPT: return 2;
            case NEKO_VM: return 3;
            case C_PLUS_PLUS: return 4;
            default: return 5;
        }
    }
    
    private final Listener validateOnModifySrc = new Listener()
    {
        public void handleEvent(Event e)
        {
            String path = getMainFileName();
            String newSrc = ((Text)e.widget).getText();
            if (path.startsWith(oldSrcFolder + "\\"))
            {
                path = path.substring(oldSrcFolder.length());
                if (!newSrc.isEmpty())
                {
                    path = newSrc + path;
                }
            }
            else if (path.contains("\\" + oldSrcFolder + "\\"))
            {
                if (newSrc.isEmpty())
                {
                    path = path.replace("\\" + oldSrcFolder + "\\", "\\");
                }
                else
                {
                    path = path.replace("\\" + oldSrcFolder + "\\", "\\" + newSrc + "\\");
                }
            }
            oldSrcFolder = newSrc;
            setMainFileName(path);
            modifyListener.handleEvent(e);
        }
    };
}
