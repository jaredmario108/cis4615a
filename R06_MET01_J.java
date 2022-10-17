//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - Mandatory Vulnerability 
public class R06_MET01_J {
    //  Rule 06. Methods (MET) 
    //  MET01-J. Never use assertions to validate method arguments 

    //  Correct the code as shown in the Compliant Solution below:
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
          throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
          throw new IllegalArgumentException();
        }
        return absX + absY;
      }

    //  Refer to: Rule 06. Methods (MET)
}
