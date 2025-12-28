// write a code use Polymorphism where car name private and child class use rafereacne class 
class Car {
  private String brand;

  public Car() {
    brand = "Ferrari";
  }

  String getCarName() {
    return brand;
  }

  void drive() {
    System.out.println("The car is driving...");
  }
}

class SportsCar extends Car {
  public int speed = 200;

  void turboMode() {
    System.out.println("Turbo mode ON!");
  }
}

public class Main {
  public static void main(String[] args) {
    SportsCar obj = new SportsCar();
    System.out.println("The car name : " + obj.getCarName());
    obj.drive();
    System.out.println("Max Speed: " + obj.speed + " mph.");
    obj.turboMode();
  }
}