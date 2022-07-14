import java.util.*;
public class fifth {
  public static void main(String[] args)
  {
    //concat function in strings

    String s1 = "Avengers";
    String s2 = "End game";

    String s3 = s1.concat(s2);
    System.out.println(s3);

    System.out.println("the letter n is at index"+ s3.indexOf("n"));

        //Using charat and char array
        String msg="Live Life to Fullest";
        // Let us learn how to Access  a Particular Character in a string using charAt(index)
        System.out.println(msg.charAt(2));
        // Let us Convert a  String into a Char Array using toCharArray()
        char[] characters = msg.toCharArray();
        System.out.println(Arrays.toString(characters));
        // Let us Convert charArray into STRING. 
        characters[1]='o';
        String newStr=  new String(characters);
        System.out.println(newStr);

  //using .contains method to check if the string contains the given substring

  String secret = "the diamon in here";

  System.out.println("the diamond is here:"+ secret.contains("diamon"));

    // splitting string using.split() method

    String ice_creme = "chocolate-vanilla-stawberry-rum raisin";

    String[] flavors = ice_creme.split("-");

    System.out.println(Arrays.toString(flavors));

    for(String f1: flavors){
      System.out.println(f1);
    }

    

    

  }
}
