//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - User Selected Vulnerability 
public class R05_OBJ01_J {
    //  Rule 05. Object Orientation (OBJ)
    //  OBJ01-J. Limit accessibility of fields
    
    //  Correct the code as shown in the Compliant Solution below:
    public class Widget {
        private int total; // Declared private
       
        public int getTotal () {
          return total;
        }
       
        // Definitions for add() and remove() remain the same
      }

    //  Refer to: Rule 05. Object Orientation (OBJ)
}
