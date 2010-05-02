/**
 * 
 */
package haxe.imp.parser.antlr.tree.exceptions;

import haxe.imp.parser.antlr.tree.specific.VarUsage;

/**
 * @author kondratyev
 * 
 */
public class NotDeclaredVarUsageException extends Exception {
    private static final long serialVersionUID = -573859182870312543L;

    private VarUsage usage;

    /**
     * @return the usage
     */
    public VarUsage getUsage() {
        return usage;
    }

    /**
     * @param usage
     *            the usage to set
     */
    public void setUsage(VarUsage usage) {
        this.usage = usage;
    }

    /**
     * @param usage
     */
    public NotDeclaredVarUsageException(VarUsage usage) {
        this.usage = usage;
    }

}
