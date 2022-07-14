interface DriveMode{
  void selectterrain();
}
abstract class Autmobile{
  public abstract void wheel();
}
class Car extends Autmobile implements DriveMode{
  public void wheel(){
    System.out.println("I have 4 wheels");
  }
  public void selectterrain(){
    System.out.println("ECONOMY | CITY | SPORTS");
    
  }
}
class Truck extends Autmobile{
  public void wheel(){
    System.out.println("I have 6 wheels");
  }
  
}
public class program3 {
  public static void main(String[] args){
   Car harrier = new Car();
   harrier.selectterrain();
  }
}
