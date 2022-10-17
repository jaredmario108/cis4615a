//  Jared Sevilla
//  CIS4615 Fall 2022
//  SEI CERT Oracle Coding Standard for Java Problems - Mandatory Vulnerability 
public class R02_XP00_J {
    //  Rule 02. Expressions (EXP)
    //  XP00-J. Do not ignore values returned by methods 

    //  Correct the code as shown in the Compliant Solution below:
    public void deleteFile(){
 
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
          // Handle failure to delete the file
        }
       
      }

    //  Refer to: Rule 02. Expressions (EXP)
}
