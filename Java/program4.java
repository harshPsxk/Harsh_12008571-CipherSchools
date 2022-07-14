import java.util.ArrayList;
import java.util.Collections;

public class program4 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();

      list.add(5);
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);

      System.out.println(Collections.max(list));
      System.out.println(Collections.min(list));

      Collections.sort(list);//sort in ascending order

      for(int num : list) {
        System.out.println(num);
      }

      Collections.sort(list,Collections.reverseOrder());//sort in descending order

      for(int num : list) {
        System.out.println(num);
      }
      
    }
}
