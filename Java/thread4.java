import java.io.File;
public class thread4 extends Thread {
  
  

  public void run(){
    for(int i = 1; i < 10; i++){
      File f = new File("C://Users//harsh//ggfolder"+String.valueOf(i));
      //f.mkdir(); // this function create directory

      f.delete(); // commenting line number 7 and writing this will delete all the directories.



      System.out.println(" Directory created");

      try{ Thread.sleep(2000);}catch(Exception e){}
    }
  }
  public static void main(String[] args){

    thread4 p4 = new thread4();
    p4.start();
    // this program explains using thread for general purpose 
    // in this program we will crete 10 directories using a single thread
  }
}
