package stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.*;

public class streamchar {
  public static void main(String[] args){
    
    IntStream mystream = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars();

    mystream.forEach(c -> System.out.println(c));

    List<Integer> mylist = new ArrayList<Integer>();

    for(int i = 1; i<=20; i++){
      mylist.add(i);
    }

    Stream<Integer> mystream1 = mylist.stream();

    List<Integer> evennumbers = mystream1.filter(num -> num%2 == 0).collect(Collectors.toList());

    evennumbers.forEach(num -> System.out.println(num));
  }
}
