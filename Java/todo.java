import java.util.*;
public class todo {
  public static void main(String[] args){

    System.out.println("WELCOME TO TODOLIST");
    System.out.println("PLEASE SELECT AN OPTION");
    System.out.println("PRESS 1 for adding stuff in todo list");
    System.out.println("PRESS 2 for listing all todo");
    System.out.println("PRESS 3 for searching in todo");
    System.out.println("PRESS 4 for deleting todo");
    

    int c;
    Scanner sc = new Scanner(System.in);
    c = sc.nextInt();
    switch (c){
      case 1:
      int count;
      int attempt = 1;
      System.out.println("How many tasks you want to add");
      count = sc.nextInt();
      ArrayList<String> LIST = new ArrayList<String>();
      while(attempt <= count){
        while(sc.hasNextLine()){
          String a = sc.nextLine();
          LIST.add(a);
        
          
        }
        attempt++;
      }

  }
}
}
