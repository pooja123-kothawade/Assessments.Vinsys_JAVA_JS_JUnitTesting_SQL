/*Q4: Write a program that takes a string from the
 user and tries to convert it into an integer. Use a 
 try-catch block to handle NumberFormatException and print
  "Invalid number format" if an error occurs.
 */

import java.util.Scanner;

public class Exception_handling4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in string format :- ");
        String  input = sc.nextLine();
        try{
            int num =Integer.parseInt(input);
            System.out.println("Converted num :-"+ num);
        }catch(NumberFormatException e){
            System.out.println("Invalid number format");
        }
    }
    
}
