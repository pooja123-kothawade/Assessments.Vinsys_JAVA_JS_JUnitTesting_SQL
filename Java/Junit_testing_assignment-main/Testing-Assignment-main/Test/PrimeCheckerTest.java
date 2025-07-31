package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import Codes.PrimeChecker;

public class PrimeCheckerTest {

    @Test
    public void testIsPrime() {
        PrimeChecker checker = new PrimeChecker();
        assertTrue(checker.isPrime(5));    // prime
        assertFalse(checker.isPrime(4));   // not prime
        assertFalse(checker.isPrime(1));   // edge case
        assertFalse(checker.isPrime(0));   // zero
        assertFalse(checker.isPrime(-7));  // negative
    }
}
