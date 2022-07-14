package stream;

import java.util.stream.Stream;

public class streamfirst {
  // This program exaplins stream processing in Java.
	// what is a stream.?
	// a stream is a sequence of elements from a source.
	// here the source of data can be a collection or array that provides 
	// data to stream.
	
	// using stream processing we can create a chain of actions or stream pipeline.
	
	// java stream also provides features for data aggregation. 
	// here data aggregation means finding statistacal facts from data such as 
	// max, min , sum, etc.
	
	// there is a differemce in collection and stream.
	// a collection is an in memory data structure which hol all the values.
	
	// stream is conceptually a pipeline, in which elements are computed on demand.
	
	// a stream is the best practice of processing data in java.
	
	// let us learn how to create a stream in java.
  public static void main(String[] args){
    Stream<Integer> mystream = Stream.of(10,20,30,40,50,60,80);

    mystream.forEach(number -> System.out.println(number));
  }
}
