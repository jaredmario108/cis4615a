//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - Mandatory Vulnerability 
public class R04_STR03_J {
    //  Rule 04. Characters and Strings (STR) 
    //  STR03-J. Do not encode noncharacter data as a string 
    
    //  Given the non-compliant code below:
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);

    //  Refer to: Rule 04. Characters and Strings (STR)
}
