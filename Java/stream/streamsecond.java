package stream;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

public class streamsecond {
  public static void main(String[] args) throws Exception {
  List<Integer> myList = new ArrayList<Integer>();

  for(int i = 1; i<=10; i++) {
    myList.add(i*100);
  }

  Stream<Integer> mystream = myList.stream();

  mystream.forEach(nummber -> System.out.println(nummber));



}
}