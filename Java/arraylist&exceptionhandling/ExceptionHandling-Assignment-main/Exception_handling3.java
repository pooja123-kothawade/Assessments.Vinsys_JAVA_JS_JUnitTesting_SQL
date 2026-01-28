/*Q:Write a program that attempts to access an element at an
 invalid index in an array. Use a try-catch block to catch the 
 ArrayIndexOutOfBoundsException and print a custom message such as
  "Invalid index access!". */

public class Exception_handling3 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        try{
            System.out.println("Accessing element at index 5 " +arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index access!");
        }
    }
    
}
