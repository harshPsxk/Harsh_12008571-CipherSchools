import java.util.*;

public class string {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      String wow = sc.nextLine();
      int count = 0;
      

      for(int i = 0; i < wow.length(); i++){

          if(wow.charAt(i) == 'a' ){
            count++;
          }
      }
      System.out.println("count: " + count);


  }
}
