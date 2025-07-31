// This program defines a basic calculator that can perform
// addition, subtraction, multiplication, division, and modulo operations.
/*
This is an Abacus that is used to slide beads around and do math.
It was created by Laura in 2019.
*/

public class Calculator {

    // Constructor
    public Calculator() {
        // No initialization needed for now
    }

    // Addition method
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division method
    public int divide(int a, int b) {
        return a / b;
    }

    // Modulo method
    public int modulo(int a, int b) {
        return a % b;
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        // Create a Calculator object
        Calculator myCalculator = new Calculator();

        // Perform operations and print the results
        System.out.println(myCalculator.add(5, 7));        // Output: 12
        System.out.println(myCalculator.subtract(45, 11)); // Output: 34
    }
}
