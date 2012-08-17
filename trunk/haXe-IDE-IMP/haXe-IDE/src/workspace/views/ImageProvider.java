package workspace.views;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import tree.Function;
import tree.HaxeTree;
import tree.INodeWithModifier;
import tree.Modifiers;
import tree.expression.Declaration;
import tree.expression.Usage;
import tree.type.Class;
import tree.type.Enum;
import workspace.SharedImages;
import workspace.SharedImages.Overlays;

public class ImageProvider
{    
    public static Image getImageForTreeNode(final HaxeTree node)
    {
        Object stub = node;
        ArrayList<Modifiers> modifiers = null;
        if (stub instanceof INodeWithModifier)
        {
            modifiers = ((INodeWithModifier)stub).getModifiers();
        }
        if (node instanceof Function)
        {
            if (modifiers.contains(Modifiers.PRIVATE))
            {
                return SharedImages.DESC_METHOD_PRIVATE.createImage();
            }
            return SharedImages.DESC_METHOD_PUBLIC.createImage();
        }
        if (node instanceof Enum)
        {
            return SharedImages.DESC_ENUM.createImage();
        }
        if (node instanceof Class)
        {
            return SharedImages.DESC_CLASS.createImage();
        }
        if (node instanceof Declaration)
        {
            ImageDescriptor descriptor = SharedImages.DESC_FIELD_PRIVATE;
            if (modifiers.contains(Modifiers.PUBLIC))
            {
                descriptor = SharedImages.DESC_FIELD_PUBLIC;
            }
            if (modifiers.contains(Modifiers.STATIC))
            {
                return SharedImages.createImageDescriptorWithOverlay(descriptor, Overlays.STATIC).createImage();
            }
            return descriptor.createImage();
        }
        if (node instanceof Usage)
        {
            HaxeTree decl = ((Usage)node).getDeclarationNode();
            if (decl instanceof Class)
            {
                return getImageForTreeNode(decl);
            }
        }
        return SharedImages.DESC_UNKNOWN.createImage();
    }
}