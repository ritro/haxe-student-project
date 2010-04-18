/**
 * 
 */
package test.haxe.utils;

import main.haxe.utils.HaxeType;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author kondratyev
 * 
 */
public class TestHaxeType {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * Test method for
     * {@link main.haxe.utils.HaxeType#isExtendedClass(main.haxe.utils.HaxeType, main.haxe.utils.HaxeType)}
     * .
     */
    @Test
    public void testIsExtendedClass() {
        Assert.assertTrue("Type Float should be parent of Int", HaxeType.isExtendedClass(
                HaxeType.haxeFloat, HaxeType.haxeInt));
    }

}
