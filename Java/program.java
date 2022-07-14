import java.lang.*;
import java.util.*;
public class program {
  public static void main(String[] args)
  {
    String scientists="Zhang Heng,Robert Boyle,Issac Newton";
       
        // in the below we separated the fullNames  using , 
        String[] strArray=scientists.split(",");
      
     
        for(String str:strArray) 
        {
            str=str.trim(); // this is for removing spaces from left and right of string.

            // substring funtion to extract the characters from fullname 
            // the extraction of characters will start from ' ' space 
            // eg. Zhang Heng  then substring will extract character from index of space ''
            // i.e Heng.
          String lname=str.substring(str.indexOf(' ')).trim();
          
          // here i am pringing Dear Mr, lname +"."+ character at 0 Index.
          // Heng.Z
          System.out.println("Dear Mr. "+lname+"."+str.charAt(0));
        }

    
  }
}
