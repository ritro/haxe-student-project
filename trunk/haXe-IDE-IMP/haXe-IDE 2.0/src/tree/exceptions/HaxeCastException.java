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
package tree.exceptions;

import tree.HaxeTree;

/**
 * The Class HaxeCastException.
 * 
 * @author kondratyev
 */
public class HaxeCastException extends ClassCastException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4817818239298337408L;

	/** The node with exception. */
	private HaxeTree nodeWithException;

	/**
	 * Instantiates a new haxe cast exception.
	 */
	public HaxeCastException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the node with exception.
	 * 
	 * @return the nodeWithException
	 */
	public HaxeTree getNodeWithException() {
		return this.nodeWithException;
	}

	/**
	 * Sets the node with exception.
	 * 
	 * @param nodeWithException
	 *            the nodeWithException to set
	 */
	public void setNodeWithException(final HaxeTree nodeWithException) {
		this.nodeWithException = nodeWithException;
	}

	/**
	 * Instantiates a new haxe cast exception.
	 * 
	 * @param commonTree
	 *            the common tree
	 */
	public HaxeCastException(final HaxeTree commonTree) {
		super();
		this.nodeWithException = commonTree;
	}

	/**
	 * Instantiates a new haxe cast exception.
	 * 
	 * @param arg0
	 *            the arg0
	 */
	public HaxeCastException(final String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
