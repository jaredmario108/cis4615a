//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - Mandatory Vulnerability 
public class R00_IDS03_J {
    //  Rule 00. Input Validation and Data Sanitization (IDS)
    //  IDS03-J. Do not log unsanitized user input 
    
    //  Given the non-compliant code below:
    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + username);
      } else {
        logger.severe("User login failed for: " + username);
      }

    //  Refer to: Rule 00. Input Validation and Data Sanitization (IDS)
}
