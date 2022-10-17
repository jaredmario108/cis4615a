//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - User Selected Vulnerability 
public class R09_LCK00_J {
    //  Rule 09. Locking (LCK)
    //  LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code

    //  Correct the code as shown in the Compliant Solution below:
    public class SomeObject {
        private static final Object lock = new Object();
       
        public static void changeValue() {
          synchronized (lock) { // Locks on the private Object
            // ...
          }
        }
      }

    //  Refer to: Rule 09. Locking (LCK)
}
