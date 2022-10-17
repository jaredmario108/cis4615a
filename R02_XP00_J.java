//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - Mandatory Vulnerability 
public class R02_XP00_J {
    //  Rule 02. Expressions (EXP)
    //  XP00-J. Do not ignore values returned by methods 
    
    //  Given the non-compliant code below:
    public void deleteFile(){
 
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();
       
      }

    //  Refer to: Rule 02. Expressions (EXP)
}
