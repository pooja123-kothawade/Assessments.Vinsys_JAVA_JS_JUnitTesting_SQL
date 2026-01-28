package Test;
import Codes.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test 
    public void testAdd(){
        assertEquals(calculator.add(2,3 ),5);
    }
    
}
