package stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.*;

public class streamfourth {
  public static void main(String[] args){
    List<String> persons = new ArrayList<String>();

    persons.add("emily");
    persons.add("danny");
    persons.add("d");
    persons.add("jony");
    persons.add("sins");
    persons.add("abacus");
    persons.add("aby");
    persons.add("adnerson");
    persons.add("ada");
    

    Stream<String> members = persons.stream();
    
    members.filter(name -> name.startsWith("a")).forEach(n -> System.out.println(n));

    Stream<String> members1 = persons.stream();

    String[] people = members1.filter(name -> name.startsWith("a")).toArray(String[] :: new);

    for(String p : people) {
      System.out.println(p);
    }
    
  }
}
