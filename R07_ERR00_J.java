//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - User Selected Vulnerability 
public class R07_ERR00_J {
    //  Rule 07. Exceptional Behavior (ERR)
    //  ERR00-J. Do not suppress or ignore checked exceptions

    //  Given the non-compliant code below:
    try {
        //...
      } catch (IOException ioe) {
        ioe.printStackTrace();
      }

    //  Refer to: Rule 07. Exceptional Behavior (ERR)
}
