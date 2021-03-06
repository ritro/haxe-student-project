package imp.utils.outline;

import imp.parser.antlr.HaxeLexer;

import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.Token;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.imp.editor.ModelTreeNode;
import org.eclipse.imp.services.ILabelProvider;
import org.eclipse.imp.utils.MarkerUtils;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import tree.Function;
import tree.HaxeTree;
import tree.expression.Declaration;
import tree.expression.Usage;
import tree.statement.BlockScope;
import tree.type.Class;
import tree.type.Enum;
import workspace.Activator;
import workspace.SharedImages;
import workspace.views.ImageProvider;

public abstract class AbstractLabelProvider implements ILabelProvider 
{
    protected final Set<ILabelProviderListener> fListeners = new HashSet<ILabelProviderListener>();

    protected static ImageRegistry sImageRegistry = Activator.getInstance().getImageRegistry();


    // ---------- IBaseLabelProvider implementations ----------------

    public void addListener(final ILabelProviderListener listener) 
    {
        fListeners.add(listener);
    }

    public void dispose() 
    {
        for (ILabelProviderListener listener : fListeners)
        {
            removeListener(listener);
        }
        sImageRegistry = null;
    }

    public boolean isLabelProperty(final Object element, final String property) 
    {
        return false;
    }

    public void removeListener(final ILabelProviderListener listener) 
    {
        fListeners.remove(listener);
    }
    // ------------------------end------------------------------------
    
    public Image getImage(final Object element) 
    {
        if (element instanceof IFile) 
        {
            IFile file = (IFile) element;
            int sev = MarkerUtils.getMaxProblemMarkerSeverity(file, IResource.DEPTH_ONE);

            switch (sev) 
            {/*
                case IMarker.SEVERITY_ERROR:
                    return sImageRegistry.get(IHaxeResources.HAXE_FILE_ERROR);
                case IMarker.SEVERITY_WARNING:
                    return sImageRegistry.get(IHaxeResources.HAXE_FILE_WARNING);*/
                default:
                    return SharedImages.DESC_FILE.createImage();
            }
        }
        HaxeTree n = (element instanceof ModelTreeNode) 
                ? (HaxeTree) ((ModelTreeNode) element).getASTNode()
                : (HaxeTree) element;
        return ImageProvider.getImageForTreeNode(n);
    }
    
    /**
     * Generating label for tree structure in correspond to passed node.
     * ( outline, call hierarchy and the rest)
     * 
     * @param n - passed node
     * @return the label for node in tree
     */
    public static String getLabelForTreeNode(final HaxeTree n) 
    {
        // START_HERE
        if (n == null)
        {
            return "<??unknown??>";
        }
        Token token = n.token;
        if (token != null && token.getType() == HaxeLexer.MODULE) 
        {
            return "Module";
        }  
        if (n instanceof BlockScope) 
        {
            return "Block";
        } 
        if (n instanceof Enum) 
        {
            return n.getText();
        } 
        if (n instanceof Class) 
        {
            return ((Class) n).getClassName();
        } 
        if (n instanceof Function) 
        {
            Function hdr = (Function) n;
            return hdr.getFullNameWithParameters();
        } 
        if (n instanceof Declaration) 
        {
            Declaration varDeclaration = (Declaration) n;
            return varDeclaration.getText();
        }        
        if (n instanceof Usage)
        {
            HaxeTree decl = ((Usage)n).getDeclarationNode();
            if (decl instanceof Declaration)
            {
                return n.getText();                
            }
            if (decl instanceof Class)
            {
                return getLabelForTreeNode(decl);
            }
        }
        
        return "<??unknown??>" + n.getText();
    }
}
