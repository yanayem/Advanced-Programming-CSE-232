//When Run its local Computer rename fime name Main.java
//java Class Method
class Car {
  public void name() {
    String name = "Land Rover Defender";
    System.out.println("The Car Name is " + name);
  }

  public void topspeed(int speed) {
    System.out.println(" Top Speed around " + speed + " mph.");
  }
}

public class Main {
  public static void main(String[] args) {
    Car Obj1 = new Car();
    Obj1.name();
    Obj1.topspeed(120);
  }
}