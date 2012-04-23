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
package imp.parser.antlr.tree.exceptions;

import tree.specific.VarUsageNode;

/**
 * The Class NotDeclaredVarUsageException.
 * 
 * @author kondratyev
 */
public class NotDeclaredVarUsageException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -573859182870312543L;

	/** The usage. */
	private VarUsageNode usage;

	/**
	 * Gets the usage.
	 * 
	 * @return the usage
	 */
	public VarUsageNode getUsage() {
		return this.usage;
	}

	/**
	 * Sets the usage.
	 * 
	 * @param usage
	 *            the usage to set
	 */
	public void setUsage(final VarUsageNode usage) {
		this.usage = usage;
	}

	/**
	 * Instantiates a new not declared var usage exception.
	 * 
	 * @param usage
	 *            the usage
	 */
	public NotDeclaredVarUsageException(final VarUsageNode usage) {
		this.usage = usage;
	}

}
