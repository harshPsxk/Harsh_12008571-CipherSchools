import java.util.Date;

class Worker_One implements Runnable {
  public void run() {
    for (int i = 0; i <= 20; i++){
      System.out.println("worker one" + new Date());
      try{Thread.sleep(1000);}catch (Exception ee){}
    }
  }
}
class Worker_Two implements Runnable {
  public void run() {
    for(int i = 1; i<=20; i++){
      System.out.println("worker two" + new Date());
      try{Thread.sleep(1000);}catch (Exception ee){}
    }
  }
}
public class thread3 {
  public static void main(String[] args){
    // this program explains creating multiple threads or multi threading in java.
    Worker_One w1 = new Worker_One();
    Worker_Two w2 = new Worker_Two();

    Thread t1 = new Thread(w1);
    Thread t2 = new Thread(w2);

    t1.start();
    t2.start();
  }
}
