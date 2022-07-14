import  java.io.File;
import java.io.IOException;

public class file {
  public static void main(String[] args){

    File f = new File("C:\\Users\\harsh\\ggfolder\\java.txt");

    try{
      f.createNewFile();
      System.out.println("File created");
    }catch(Exception e){
      System.out.println("runtine error");
    }
  }
}
