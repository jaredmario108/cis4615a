//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - Mandatory Vulnerability 
public class R03_NUM03_J {
    //  Rule 03. Numeric Types and Operations (NUM) 
    //  NUM03-J. Use integer types that can fully represent the possible range of unsigned data

    //  Given the non-compliant code below:
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt(); 
      }

    //  Refer to: Rule 03. Numeric Types and Operations (NUM)
}
