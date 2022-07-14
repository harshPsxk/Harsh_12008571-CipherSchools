public class programtwo {

  int candy=5;

  void makeitsweets(programtwo p2) {
    p2.candy = p2.candy + 500;
  }

  public static void main(String[] args){

   programtwo p2 = new programtwo();

   p2.candy = 10;

   p2.makeitsweets(p2);

   System.out.println(p2.candy);

  }
}
