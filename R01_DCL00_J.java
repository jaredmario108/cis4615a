//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - User Selected Vulnerability 
public class R01_DCL00_J {
    //  Rule 01. Declarations and Initialization (DCL)
    //  DCL00-J. Prevent class initialization cycles

    //  Correct the code as shown in the Compliant Solution below:

    public class Cycle {
        private final int balance;
        private static final int deposit = (int) (Math.random() * 100); // Random deposit
        private static final Cycle c = new Cycle();  // Inserted after initialization of required fields
        public Cycle() {
          balance = deposit - 10; // Subtract processing fee
        }
       
        public static void main(String[] args) {
          System.out.println("The account balance is: " + c.balance);
        }
      }

    //  Refer to: Rule 01. Declarations and Initialization (DCL)

}
