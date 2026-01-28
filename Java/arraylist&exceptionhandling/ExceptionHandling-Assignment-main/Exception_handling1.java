/*Q: Write a program that takes two numbers as input
 from the user and divides them. Use a try-catch block 
 to handle the ArithmeticException if the user tries to 
 divide by zero. */

import java.util.Scanner;

public class Exception_handling1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :- ");
        int num1 =sc.nextInt();
        System.out.print("Enter num2 :- ");
        int num2 =sc.nextInt();

        try{
            int result = num1/num2;
            System.out.println("Result :- " +result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

    }
    
}
