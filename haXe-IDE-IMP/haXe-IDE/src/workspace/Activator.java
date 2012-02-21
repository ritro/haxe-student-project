/*******************************************************************************
 * Copyright (c) 2009 Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU General Public License, version 2
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Contributors:
 *    Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 *******************************************************************************/
package workspace;

import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.imp.runtime.PluginBase;
import org.osgi.framework.BundleContext;

import workspace.elements.BuildFile;
import workspace.elements.HaxeProject;
import workspace.elements.IHaxeResources;

/**
 * The Class Activator.
 * 
 * Activator of the plugin
 * 
 * @author Anatoly Kondratyev
 */
public class Activator extends PluginBase {

	/** The Constant kPluginID. */
	public static final String kPluginID = "haXe_IDE";

	/** The Constant kLanguageID. */
	public static final String kLanguageID = "haxe";

	/** The unique instance of this plugin class. */
	protected static Activator sPlugin;

	/**
	 * Gets the single instance of Activator.
	 * 
	 * @return single instance of Activator
	 */
	public static Activator getInstance() {
		if (sPlugin == null) {
			sPlugin = new Activator();
		}
		return sPlugin;
	}
	
	private HashMap<String, HaxeProject> projects;
	
	public HashMap<String, HaxeProject> getProjects()
	{
	    return projects;
	}

	/**
	 * Instantiates a new activator.
	 */
	public Activator() { 
		super();
		sPlugin = this;
		
		projects = new HashMap<String, HaxeProject>();
	}

	@Override
	public void start(final BundleContext context) throws Exception 
	{
		super.start(context);
		
		findProjectsInWorkspace();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.imp.runtime.PluginBase#getID()
	 */
	@Override
	public String getID() {
		return kPluginID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.imp.runtime.PluginBase#getLanguageID()
	 */
	@Override
	public String getLanguageID() {
		return kLanguageID;
	}

	// Definitions for image management

	/** The Constant ICONS_PATH. */
	public static final org.eclipse.core.runtime.IPath ICONS_PATH = new org.eclipse.core.runtime.Path(
			"icons/"); //$NON-NLS-1$("icons/"); //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#initializeImageRegistry(org.eclipse
	 * .jface.resource.ImageRegistry)
	 */
	@Override
	protected void initializeImageRegistry(
			final org.eclipse.jface.resource.ImageRegistry reg) {
		org.osgi.framework.Bundle bundle = this.getBundle();
		org.eclipse.core.runtime.IPath path = ICONS_PATH
				.append("haxe_default_image.gif");//$NON-NLS-1$
		org.eclipse.jface.resource.ImageDescriptor imageDescriptor = createImageDescriptor(
				bundle, path);
		reg.put(IHaxeResources.HAXE_DEFAULT_IMAGE, imageDescriptor);

		path = ICONS_PATH.append("haxe_default_outline_item.gif");//$NON-NLS-1$
		imageDescriptor = createImageDescriptor(bundle, path);
		reg.put(IHaxeResources.HAXE_DEFAULT_OUTLINE_ITEM, imageDescriptor);

		path = ICONS_PATH.append("haxe_file.gif");//$NON-NLS-1$
		imageDescriptor = createImageDescriptor(bundle, path);
		reg.put(IHaxeResources.HAXE_FILE, imageDescriptor);

		path = ICONS_PATH.append("haxe_file_warning.gif");//$NON-NLS-1$
		imageDescriptor = createImageDescriptor(bundle, path);
		reg.put(IHaxeResources.HAXE_FILE_WARNING, imageDescriptor);

		path = ICONS_PATH.append("haxe_file_error.gif");//$NON-NLS-1$
		imageDescriptor = createImageDescriptor(bundle, path);
		reg.put(IHaxeResources.HAXE_FILE_ERROR, imageDescriptor);
	}

	/**
	 * Creates the image descriptor.
	 * 
	 * @param bundle
	 *            the bundle
	 * @param path
	 *            the path
	 * @return the org.eclipse.jface.resource. image descriptor
	 */
	public static org.eclipse.jface.resource.ImageDescriptor createImageDescriptor(
			final org.osgi.framework.Bundle bundle,
			final org.eclipse.core.runtime.IPath path) {
		java.net.URL url = org.eclipse.core.runtime.FileLocator.find(bundle,
				path, null);
		if (url != null) {
			return org.eclipse.jface.resource.ImageDescriptor
					.createFromURL(url);
		}
		return null;
	}

	private void findProjectsInWorkspace()
	{
        for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects())
        {
            HaxeProject pr = new HaxeProject(p);
            projects.put(p.getName(), pr);
            List<IFile> ff = findBuildFiles(p);
            for (IFile f : ff)
            {
                IPath path = f.getRawLocation().makeAbsolute();
                BuildFile b = new BuildFile(path.toFile());
                pr.addBuildFile(b);
            }
        }
	}
	
	private List<IFile> findBuildFiles(IProject p)
	{
	    ProjectVisitor visitor = new ProjectVisitor();
	    try
        {
	        for (IResource r : p.members())
            {
	            visitor.visit(r);
            }
	        return visitor.getBuildFileList();
        }
        catch (CoreException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	    
	    return null;
	}

}
