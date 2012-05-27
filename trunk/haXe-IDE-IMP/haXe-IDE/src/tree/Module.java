package tree;


public class Module extends HaxeTree
{
    private String fullPackage = null;
    private String packageName = null;
    
    public Module(final int type)
    {
        super(type, "Module");
    }
    
    public void setFullPackage(final String pack)
    {
        fullPackage = pack;
    }
    
    /** 
     * Retruns the full package for the file, this Module identifies.
     */
    public String getFullPackage()
    {
        return fullPackage;
    }
    
    public String getText()
    {
        if (fullPackage == null)
        {
            return "";
        }
        return fullPackage.substring(getPackage().length() + 1);
    }
    
    public String getPackage()
    {
        if (packageName == null)
        {
            findPackage();
        }
        return packageName;
    }
    
    private void findPackage()
    {
        if (getChildCount() == 0)
        {
            packageName = "";
            return;
        }
        HaxeTree supposedPackNode = getChild(0);
        if (!supposedPackNode.getText().equals("package"))
        {
            packageName = "";
            return;
        }
        packageName = supposedPackNode.getChild(0).getText();
    }
    
    public void commitError(final String message) 
    {
        if (messageHandler == null)
        {
            return;
        }
        messageHandler.handleSimpleMessage( 
                message, 
                0, 
                0,
                0, 0, 1, 1);
    }
}
