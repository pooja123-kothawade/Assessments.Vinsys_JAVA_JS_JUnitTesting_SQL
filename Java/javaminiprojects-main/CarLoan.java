// This program calculates the monthly car loan payment
// based on loan amount, interest rate, loan duration, and down payment

public class CarLoan {
  public static void main(String[] args) {
    
    // Step 1–4: Define variables
    int carLoan = 10000;
    int loanLength = 3; // in years
    int interestRate = 5; // 5%
    int downPayment = 2000;

    // Step 5–8: Check for invalid loan conditions
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      // Step 9–15: Perform calculations
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;

      System.out.println("Your monthly payment is: " + monthlyPayment);
    }
  }
}
