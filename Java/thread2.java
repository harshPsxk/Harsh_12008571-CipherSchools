class Worker implements Runnable {
  public void run() {
    System.out.println("hi i am thread");
  }
}
public class thread2 {
  public static void main(String[] args){

    Worker w = new Worker();

    Thread t1 = new Thread(w);

    t1.start();


    // this  program explains alterantive method of creating threads in java using runnable interface.
  //STEP 1: create a class and implement Runnable interface.
  //STEP 2: define run() method.
  //STEP 3: create the object of thread class 
  //STEP 4: call start method
  }
}
