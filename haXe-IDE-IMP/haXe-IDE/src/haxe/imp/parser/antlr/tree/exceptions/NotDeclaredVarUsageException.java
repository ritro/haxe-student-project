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
package haxe.imp.parser.antlr.tree.exceptions;

import haxe.imp.parser.antlr.tree.specific.VarUsage;

// TODO: Auto-generated Javadoc
/**
 * The Class NotDeclaredVarUsageException.
 * 
 * @author kondratyev
 */
public class NotDeclaredVarUsageException extends Exception {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -573859182870312543L;

    /** The usage. */
    private VarUsage usage;

    /**
	 * Gets the usage.
	 * 
	 * @return the usage
	 */
    public VarUsage getUsage() {
        return usage;
    }

    /**
	 * Sets the usage.
	 * 
	 * @param usage
	 *            the usage to set
	 */
    public void setUsage(VarUsage usage) {
        this.usage = usage;
    }

    /**
	 * Instantiates a new not declared var usage exception.
	 * 
	 * @param usage
	 *            the usage
	 */
    public NotDeclaredVarUsageException(VarUsage usage) {
        this.usage = usage;
    }

}
