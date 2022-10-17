//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - Mandatory Vulnerability 
public class R04_STR03_J {
    //  Rule 04. Characters and Strings (STR) 
    //  STR03-J. Do not encode noncharacter data as a string 

    //  Correct the code as shown in the Compliant Solution below:
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString();  // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray); 
    x = new BigInteger(ns);

    //  Refer to: Rule 04. Characters and Strings (STR)
}
