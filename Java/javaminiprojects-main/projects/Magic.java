public class Magic {
    public static void main(String[] args) {
        int myNumber = 12;  // Original number (change this to test magic)

        // Step 1: Multiply by itself
        int stepOne = myNumber * myNumber;

        // Step 2: Add original number
        int stepTwo = stepOne + myNumber;

        // Step 3: Divide by original number
        int stepThree = stepTwo / myNumber;

        // Step 4: Add 17
        int stepFour = stepThree + 17;

        // Step 5: Subtract original number
        int stepFive = stepFour - myNumber;

        // Step 6: Divide by 6
        int stepSix = stepFive / 6;

        // Final output
        System.out.println("The magic number is: " + stepSix);
    }
}
