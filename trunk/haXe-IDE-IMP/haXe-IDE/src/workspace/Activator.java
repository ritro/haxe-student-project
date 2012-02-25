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

	public static final String kPluginID = "haXe_IDE";
	public static final String kLanguageID = "haxe";
	
	protected static Activator sPlugin;	
	
	private HashMap<String, HaxeProject> projects;

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
	
	public HaxeProject getProject(String name)
	{
	    return projects.get(name);
	}
	
	public HashMap<String, HaxeProject> getProjects()
	{
	    return projects;
	}
	
	/**
	 * Adds Haxe Project to a list of all projects in current
	 * workspace.
	 * @param project - instance of Haxe project.
	 */
	public void addProject(HaxeProject project)
	{
	    projects.put(project.getName(), project);
	}

	@Override
	public String getID() {
		return kPluginID;
	}

	@Override
	public String getLanguageID() {
		return kLanguageID;
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

	// Definitions for image management

	/** The Constant ICONS_PATH. */
	public static final IPath ICONS_PATH = new org.eclipse.core.runtime.Path(
			"icons/");

	@Override
	protected void initializeImageRegistry(
			final org.eclipse.jface.resource.ImageRegistry reg) {
		org.osgi.framework.Bundle bundle = getBundle();
		org.eclipse.core.runtime.IPath path = ICONS_PATH
				.append("haxe_default_image.gif");
		org.eclipse.jface.resource.ImageDescriptor imageDescriptor = createImageDescriptor(
				bundle, path);
		reg.put(IHaxeResources.HAXE_DEFAULT_IMAGE, imageDescriptor);

		path = ICONS_PATH.append("haxe_default_outline_item.gif");
		imageDescriptor = createImageDescriptor(bundle, path);
		reg.put(IHaxeResources.HAXE_DEFAULT_OUTLINE_ITEM, imageDescriptor);

		path = ICONS_PATH.append("haxe_file.gif");
		imageDescriptor = createImageDescriptor(bundle, path);
		reg.put(IHaxeResources.HAXE_FILE, imageDescriptor);

		path = ICONS_PATH.append("haxe_file_warning.gif");
		imageDescriptor = createImageDescriptor(bundle, path);
		reg.put(IHaxeResources.HAXE_FILE_WARNING, imageDescriptor);

		path = ICONS_PATH.append("haxe_file_error.gif");
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
        }
	}
	
	private void parseProjects()
	{
	    for (HaxeProject p : projects.values())
	    {
	        if (!p.isOpen())
            {
                continue;
            }
	        
	        
	    }
	}

}
