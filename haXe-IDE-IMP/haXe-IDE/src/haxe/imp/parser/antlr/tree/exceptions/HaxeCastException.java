/**
 * 
 */
package haxe.imp.parser.antlr.tree.exceptions;

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;

/**
 * @author kondratyev
 * 
 */
public class HaxeCastException extends ClassCastException {
    private static final long serialVersionUID = -4817818239298337408L;

    private ExtendedCommonTree nodeWithException;

    /**
     * 
     */
    public HaxeCastException() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the nodeWithException
     */
    public ExtendedCommonTree getNodeWithException() {
        return nodeWithException;
    }

    /**
     * @param nodeWithException
     *            the nodeWithException to set
     */
    public void setNodeWithException(ExtendedCommonTree nodeWithException) {
        this.nodeWithException = nodeWithException;
    }

    public HaxeCastException(ExtendedCommonTree commonTree) {
        super();
        this.nodeWithException = commonTree;
    }

    /**
     * @param arg0
     */
    public HaxeCastException(String arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

}
