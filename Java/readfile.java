import java.io.BufferedReader;
import java.io.FileReader;

public class readfile {
  public static void main(String[] args)throws Exception {
    FileReader fr =new FileReader("C:\\Users\\harsh\\ggfolder\\java.txt");

    BufferedReader br = new BufferedReader(fr);

    String line;

    while((line = br.readLine()) != null){
      System.out.println(line);
    }
    br.close();
    fr.close();
  }
}
