import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class wirtefile  {
  public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("C:\\users\\harsh\\ggfolder\\java.txt");

    BufferedWriter bw = new BufferedWriter(fw);

    bw.write("I am harsh ");
    bw.write("I am lazy ");

    bw.flush();
    bw.close();
    fw.close();

    System.out.println("File written in ");
  }
}
