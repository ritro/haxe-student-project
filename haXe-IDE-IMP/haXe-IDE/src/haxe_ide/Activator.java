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
package haxe_ide;

import org.eclipse.imp.runtime.PluginBase;
import org.osgi.framework.BundleContext;

// TODO: Auto-generated Javadoc
/**
 * The Class Activator.
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
		if (sPlugin == null)
			new Activator();
		return sPlugin;
	}

	/**
	 * Instantiates a new activator.
	 */
	public Activator() {
		super();
		sPlugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
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
}
