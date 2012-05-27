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

import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.imp.runtime.PluginBase;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	public static final String libsPath = "lib/LightHaxeLib.jar";
	public static final Logger logger = LoggerFactory.getLogger("FILE");
	public static final IResourceChangeListener resChangeListener = null;	
	
	private static ProjectManager projectManager = null;
	
	protected static Activator sPlugin;
	
	//public static boolean DEBUG =
	//        sPlugin.isDebugging() && "true".equalsIgnoreCase(
	//                   Platform.getDebugOption("org.eclipse.faq.examples/debug/option2"));
	
	public static Activator getInstance() 
	{
		if (sPlugin == null) 
		{
			sPlugin = new Activator();
		}
		return sPlugin;
	}

	@Override
	public String getID() {
		return kPluginID;
	}

	@Override
	public String getLanguageID() {
		return kLanguageID;
	}
	
	public static ProjectManager getProjectManager()
	{
	    return projectManager;
	}	

	/**
	 * Instantiates a new activator.
	 */
	public Activator() 
	{ 
		super();
		sPlugin = this;
		
		initializeListeners();		
	}

	@Override
	public void start(final BundleContext context) throws Exception 
	{
		super.start(context);
		
		projectManager = new ProjectManager();
		projectManager.updateProjects();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception
	{
	    if (resChangeListener != null)
	    {
	        IWorkspace workspace = ResourcesPlugin.getWorkspace();
	        workspace.removeResourceChangeListener(resChangeListener);
	    }
	    super.stop(context);
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) 
	{
		//org.osgi.framework.Bundle bundle = getBundle();
        //IPath path = SharedImages.ICONS_PATH.append("haxe_default_outline_item.gif");
        //ImageDescriptor imageDescriptor = SharedImages.createImageDescriptor(bundle, path);
        //reg.put(IHaxeResources.HAXE_DEFAULT_IMAGE, imageDescriptor);
	}
	
	private void initializeListeners()
	{
	    IWorkspace workspace = ResourcesPlugin.getWorkspace();
	    IResourceChangeListener listener = new ResourceChangeListener();
	    workspace.addResourceChangeListener(listener);
	}
}
