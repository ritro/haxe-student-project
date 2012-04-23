package tree;

/**
 * @author Savenko Maria
 *
 */
public enum Modifiers
{
    /*
     * the field belongs to the Class itself 
     * and not to instances of this class
     */
    STATIC,
    /*
     * the field can be dynamically rebound
     */
    DYNAMIC,
    /*
     * the field is being overridden in a subclass
     */
    OVERRIDE,
    /*
     * the field can be accessed from outside of the class
     */
    PUBLIC,
    /*
     * the field access is restricted to the class itself 
     * and to classes that subclass or extends - 
     * "protected" analog
     * By default, all fields are private
     */
    PRIVATE
}
