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

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.imp.runtime.PluginBase;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import workspace.elements.HaxeFile;
import workspace.elements.HaxeLibProject;
import workspace.elements.HaxeProject;

/**
 * Plug-in Activator. Actually this is the plugin and after the 
 * creation you can take take a static instance of itself from
 * here.
 * 
 * @author Anatoly Kondratyev,
 *         Maria Savenko
 */
public class Activator extends PluginBase{

	public static final String kPluginID = "haXe_IDE";
	public static final String kLanguageID = "haxe";
	public static final String libsPath = "lib/LightHaxeLib.jar";//"lib/haXeLib.jar";
	public static final Logger logger = LoggerFactory.getLogger("FILE");
	
	protected static Activator sPlugin;	
	//public static boolean DEBUG =
	//        sPlugin.isDebugging() && "true".equalsIgnoreCase(
	//                   Platform.getDebugOption("org.eclipse.faq.examples/debug/option2"));
	
	private HaxeFile                       activeFile      = null;
	private HashMap<String, HaxeProject>   projects        = null;
	private HaxeLibProject                 libraries       = null;
	private HaxeProject                    currentProject  = null;
	
	/**
	 * Gets the single instance of Activator.
	 * 
	 * @return single instance of Activator
	 */
	public static Activator getInstance() 
	{
		if (sPlugin == null) {
			sPlugin = new Activator();
		}
		return sPlugin;
	}
	
	public void setCurrentHaxeProject(String project)
	{
	    currentProject = getProject(project);
	}
	
	public HaxeProject getCurrentHaxeProject()
	{
	    return currentProject;
	}
	
	public HaxeFile getCurrentFile()
	{
	    return activeFile;
	}
	
	public void setCurrentProject(final IFile file)
	{
	    currentProject = null;
	    activeFile = null;
	    if (file != null)
	    {
	        currentProject = projects.get(file.getProject().getName());	    
	        activeFile = currentProject.getFile(file);
	    }
	}
	
	public void setCurrentProject(HaxeProject proj)
    {
        currentProject = proj; 
    }
	
	public HaxeProject getProject(String name)
	{
	    return projects.get(name);
	}
	
	public HashMap<String, HaxeProject> getProjects()
	{
	    return projects;
	}
	
	public HaxeLibProject getHaxeLib()
	{
	    return libraries;
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
		
		connectLibs();
		findProjectsInWorkspace();
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) 
	{
		//org.osgi.framework.Bundle bundle = getBundle();
        //IPath path = SharedImages.ICONS_PATH.append("haxe_default_outline_item.gif");
        //ImageDescriptor imageDescriptor = SharedImages.createImageDescriptor(bundle, path);
        //reg.put(IHaxeResources.HAXE_DEFAULT_IMAGE, imageDescriptor);
	}

	private void findProjectsInWorkspace()
	{
        for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects())
        {
            HaxeProject pr = new HaxeProject(p);
            projects.put(p.getName(), pr);
        }
	}
	
	private void connectLibs() throws URISyntaxException, IOException
	{        
	    libraries = new HaxeLibProject(libsPath);
	    libraries.linkLib();
	}
}
