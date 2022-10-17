//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - User Selected Vulnerability 
public class R07_ERR00_J {
    //  Rule 07. Exceptional Behavior (ERR)
    //  ERR00-J. Do not suppress or ignore checked exceptions

    //  Correct the code as shown in the Compliant Solution below:
    boolean validFlag = false;
    do {
      try {
        // ...
        // If requested file does not exist, throws FileNotFoundException
        // If requested file exists, sets validFlag to true
        validFlag = true;
      } catch (FileNotFoundException e) {
        // Ask the user for a different file name
      }
    } while (validFlag != true);
        // Use the file

    //  Refer to: Rule 07. Exceptional Behavior (ERR)
}
