package workspace;

import org.eclipse.ui.ISharedImages;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

import tree.HaxeTree;
import tree.specific.Declaration;
import tree.specific.Function;
import tree.specific.type.ClassNode;
import tree.specific.type.EnumNode;

public class HaxeElementImageProvider
{    /*
    public static ImageDescriptor getImageDescriptorFromShared(String desctiption)
    {
        ISharedImages shared = PlatformUI.getWorkbench().getSharedImages();
        return shared.getImageDescriptor(desctiption);
    }
    
    public static Image getImage(final Object element) 
    {
        ImageDescriptor descriptor = getImageDescriptorFromShared(ISharedImages.IMG_TOOL_UP);
                //Activator.getInstance().getImageRegistry().getDescriptor(key);
        return descriptor.createImage();
    }*/
    
    public static Image getImageForTreeNode(final HaxeTree node)
    {
        if (node instanceof Function)
        {
            return SharedImages.DESC_METHOD_PUBLIC.createImage();
        }
        else if (node instanceof EnumNode)
        {
            return SharedImages.DESC_ENUM.createImage();
        }
        else if (node instanceof ClassNode)
        {
            return SharedImages.DESC_CLASS.createImage();
        }
        else if (node instanceof Declaration)
        {
            return SharedImages.DESC_FIELD_PUBLIC.createImage();
        }
        return SharedImages.DESC_UNKNOWN.createImage();
    }
}