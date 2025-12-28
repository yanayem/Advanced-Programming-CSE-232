//write a java  car name as a privet, and intial costuction and car method public
class Car{
    private String name;

    public Car() {
        name = "Land Rover";
    }

    public String getName(){
        return name;
    }
}
public class Main {


    public static void main(String[] args) {
        Car obj1 = new Car();
        System.out.println(obj1.getName());

    }
}