package workspace.editor;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescriber;
import org.eclipse.core.runtime.content.IContentDescription;

import workspace.WorkspaceUtils;

public class HaxeFileDescriber implements IContentDescriber
{

    public HaxeFileDescriber() 
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int describe(InputStream contents, IContentDescription description)
            throws IOException
    {
        Charset encoding = WorkspaceUtils.getEncoding(new PushbackInputStream(contents));
        if (encoding != null)
        {
            //return INVALID;
             //fEncodingSupport.setEncoding("UTF-8");
        }
        return VALID;
    }

    @Override
    public QualifiedName[] getSupportedOptions()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
