//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - User Selected Vulnerability 
public class R08_VNA00_J {
    //  Rule 08. Visibility and Atomicity (VNA)
    //  VNA00-J. Ensure visibility when accessing shared primitive variables

    //  Correct the code as shown in the Compliant Solution below:
    final class ControlledStop implements Runnable {
        private volatile boolean done = false;
        
        @Override public void run() {
          while (!done) {
            try {
              // ...
              Thread.currentThread().sleep(1000); // Do something
            } catch(InterruptedException ie) {
              Thread.currentThread().interrupt(); // Reset interrupted status
            }
          }   
        }
       
        public void shutdown() {
          done = true;
        }
      }

    //  Refer to: Rule 08. Visibility and Atomicity (VNA)
}
