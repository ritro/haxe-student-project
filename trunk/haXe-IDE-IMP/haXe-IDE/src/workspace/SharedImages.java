package workspace;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;

public class SharedImages
{
    public static final IPath ICONS_PATH = new Path("icons");
    
    // folders
    public static final String BASE                 = "base";
    public static final String VIEW_OBJ             = "ViewObjects";
    public static final String WORKSPACE_OBJ        = "Workspace";
    
    // files
    public static final String IMG_HAXE_FILE        = "haxe_file.gif";
    public static final String IMG_BUILD_FILE       = "build_file.gif";
    
    // workspace obj overlays
    //public static final String IMG_WARNING          = "warning.gif";
    
    // for different node types
    public static final String IMG_CLASS            = "class_obj.png"; //$NON-NLS-1$
    public static final String IMG_ENUM             = "enum_obj.png"; //$NON-NLS-1$
    public static final String IMG_INTERFACE        = "int_obj.png"; //$NON-NLS-1$
    
    public static final String IMG_FIELD_PUBLIC     = "field_public_obj.png"; //$NON-NLS-1$
    public static final String IMG_FIELD_PRIVATE    = "field_private_obj.png"; //$NON-NLS-1$

    public static final String IMG_METHOD_PUBLIC    = "methpub_obj.png"; //$NON-NLS-1$
    public static final String IMG_METHOD_PRIVATE   = "methpri_obj.png"; //$NON-NLS-1$
    public static final String IMG_METHOD_PROTECTED = "methpro_obj.png"; //$NON-NLS-1$
    
    // for filesystem elements
    public static final String IMG_UNKNOWN          = "unknown_item.gif"; //$NON-NLS-1$

    // Set of predefined Image Descriptors.
    // workspace
    public static final ImageDescriptor DESC_FILE           = createWorkspaceObjFromKey(BASE, IMG_HAXE_FILE);
    public static final ImageDescriptor DESC_BUILD_FILE     = createWorkspaceObjFromKey(BASE, IMG_BUILD_FILE);
    // view
    public static final ImageDescriptor DESC_CLASS          = createViewObjFromKey(BASE, IMG_CLASS);
    public static final ImageDescriptor DESC_ENUM           = createViewObjFromKey(BASE, IMG_ENUM);
    public static final ImageDescriptor DESC_INTERFACE      = createViewObjFromKey(BASE, IMG_INTERFACE);
    
    public static final ImageDescriptor DESC_FIELD_PRIVATE  = createViewObjFromKey(BASE, IMG_FIELD_PRIVATE);

    public static final ImageDescriptor DESC_METHOD_PUBLIC  = createViewObjFromKey(BASE, IMG_METHOD_PUBLIC);
    public static final ImageDescriptor DESC_METHOD_PRIVATE = createViewObjFromKey(BASE, IMG_METHOD_PRIVATE);
    public static final ImageDescriptor DESC_METHOD_PROTECTED = createViewObjFromKey(BASE, IMG_METHOD_PROTECTED);
    
    public static final ImageDescriptor DESC_UNKNOWN        = create(IMG_UNKNOWN);
    
    public static void initialize(Bundle bundle, ImageRegistry reg)
    {
        // the example of how we should initialize images in registry
        /*
        IPath path = ICONS_PATH.append("haxe_default_outline_item.gif");
        ImageDescriptor imageDescriptor = createImageDescriptor(bundle, path);
        reg.put(IHaxeResources.HAXE_DEFAULT_IMAGE, imageDescriptor);*/
    }

    public static ImageDescriptor createImageDescriptor(
            final Bundle bundle,
            final IPath path) 
    {
        URL url = FileLocator.find(bundle, path, null);
        if (url != null) 
        {
            return ImageDescriptor.createFromURL(url);
        }
        return null;
    }

    private static ImageDescriptor create(String name, String[] prefixes) 
    {
        IPath path = ICONS_PATH;
        for (String prefix : prefixes)
        {
            path = path.append(prefix);
        }
        path = path.append(name);
        return createImageDescriptor(Activator.getInstance().getBundle(), path);
    }

    private static ImageDescriptor createWorkspaceObjFromKey(String prefix, String name) 
    {
        String[] prefixes = {WORKSPACE_OBJ, prefix};
        return create(name, prefixes);
    }

    private static ImageDescriptor createViewObjFromKey(String prefix, String name) 
    {
        String[] prefixes = {VIEW_OBJ, prefix};
        return create(name, prefixes);
    }
    
    private static ImageDescriptor create(String name)
    {
        return create(name, new String[0]);
    }
}
