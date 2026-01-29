package Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import  org.junit.Test;
import Codes.NumberUtils;
public class TestNumberUtils {

    @Test
    public void testIsEven() {
        NumberUtils utils = new NumberUtils();
         assertTrue(utils.isEven(4));    // even
        assertFalse(utils.isEven(5));   // odd
        assertTrue(utils.isEven(0));    // zero
   // zero
    }
}
