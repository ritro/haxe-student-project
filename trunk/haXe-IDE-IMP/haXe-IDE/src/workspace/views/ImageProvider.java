package workspace.views;

import org.eclipse.swt.graphics.Image;

import tree.Function;
import tree.HaxeTree;
import tree.Modifiers;
import tree.expression.Declaration;
import tree.type.Class;
import tree.type.Enum;
import workspace.SharedImages;

public class ImageProvider
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
            Modifiers modifier = ((Function)node).getModifier();
            if (modifier == Modifiers.PRIVATE)
            {
                return SharedImages.DESC_METHOD_PRIVATE.createImage();
            }
            return SharedImages.DESC_METHOD_PUBLIC.createImage();
        }
        else if (node instanceof Enum)
        {
            return SharedImages.DESC_ENUM.createImage();
        }
        else if (node instanceof Class)
        {
            return SharedImages.DESC_CLASS.createImage();
        }
        else if (node instanceof Declaration)
        {
            return SharedImages.DESC_FIELD_PRIVATE.createImage();
        }
        return SharedImages.DESC_UNKNOWN.createImage();
    }
}