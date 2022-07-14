public class thread1 extends Thread {

  public void run() {
    System.out.println("hi i am thread");
  }

  public static void main(String[] args){
    
    thread1 thr = new thread1();
    thr.start();  






      // what is a thread 
      // thread is a lightweight process 
      // a thread is primarly used for 2 reasons
            // thread increase the application performance or makes it faster.
            // thread are used to implement the parallel work or multitasking in a software program.
      // there are 2 methods by which we can create thread
          // step1 : Inherit from thread class
          // step2 : defind Run() method: run is precondfigured method in thread which is used to speicify the action/task/job to be done by thread.
          // step 3: create the object of your class.
          // step 4: call the start method : start method calls the run () directly(automatically)
  }
}
