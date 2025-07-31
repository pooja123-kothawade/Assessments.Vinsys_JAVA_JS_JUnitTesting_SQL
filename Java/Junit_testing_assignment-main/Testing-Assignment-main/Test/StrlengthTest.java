package Test;

import Codes.Strlength;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class StrlengthTest {
    Strlength strlength = new Strlength();
    @Test
    public void testStrlength(){
        assertEquals(strlength.getStringLength("Hello"),5);
        assertEquals(strlength.getStringLength(""),0);

    }
    
}
