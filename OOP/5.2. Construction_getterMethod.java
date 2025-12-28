//write a java  car name as a privet, and intial costuction and car method public
//This type of question helps you understand encapsulation in Java 

class Car{
    private String name;

    public Car(String CarName) {
        this.name = CarName;
    }

    public String getName(){
        return name;
    }
}
public class Main {


    public static void main(String[] args) {
        Car obj1 = new Car("Lamborghini");
        System.out.println(obj1.getName());

    }
}