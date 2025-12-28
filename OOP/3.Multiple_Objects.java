//Multiple Objects
class Car {
  String Name = "Range Rover";

}

public class Main {
  public static void main(String[] args) {
    Car Obj1 = new Car();
    Car Obj2 = new Car();

    Obj1.Name = "Defender";
    System.out.println(Obj1.Name);
    System.out.println(Obj2.Name);
  }
}