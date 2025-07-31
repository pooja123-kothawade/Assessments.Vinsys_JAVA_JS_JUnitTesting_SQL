/*
Q: Write a program that takes an integer input from
 the user and tries to divide 100 by the entered number.
  If the user enters 0, catch the ArithmeticException.
   If the user enters a non-integer value, catch the InputMismatchException. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    


        
    }

    
}
