//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - Mandatory Vulnerability 
public class R00_IDS03_J {
    //  Rule 00. Input Validation and Data Sanitization (IDS)
    //  IDS03-J. Do not log unsanitized user input 

    //  Correct the code as shown in the Compliant Solution below:
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
    public String sanitizeUser(String username) {
      return Pattern.matches("[A-Za-z0-9_]+", username))
          ? username : "unauthorized user";
    }

    //  Refer to: Rule 00. Input Validation and Data Sanitization (IDS)
}
