//In the given Java program, why is the name field declared as private, and how does the getName() method allow access to it from the Main class?
//This type of question helps you understand encapsulation in Java 

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