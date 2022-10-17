//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - User Selected Vulnerability 
public class R05_OBJ01_J {
    //  Rule 05. Object Orientation (OBJ)
    //  OBJ01-J. Limit accessibility of fields
    
    //  Given the non-compliant code below:
    public class Widget {
        public int total; // Number of elements
       
        void add() {
          if (total < Integer.MAX_VALUE) {     
            total++;
            // ...
          } else {
            throw new ArithmeticException("Overflow");
          }
        }
       
        void remove() { 
          if (total > 0) {     
            total--;
            // ...
          } else {
            throw new ArithmeticException("Overflow");
          }
        }
      }

    //  Refer to: Rule 05. Object Orientation (OBJ)
}
