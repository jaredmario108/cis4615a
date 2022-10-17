//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - User Selected Vulnerability 
public class R09_LCK00_J {
    //  Rule 09. Locking (LCK)
    //  LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code

    //  Given the non-compliant code below:
    public class SomeObject {
        //changeValue locks on the class object's monitor
        public static synchronized void changeValue() {
          // ...
        }
      }
       
      // Untrusted code
      synchronized (SomeObject.class) {
        while (true) {
          Thread.sleep(Integer.MAX_VALUE); // Indefinitely delay someObject
        }
      }

    //  Refer to: Rule 09. Locking (LCK)
}
