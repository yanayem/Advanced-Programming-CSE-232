import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------USER INPUT----------------");
        
        System.out.println("Enter Your name");
        String name = sc.nextLine();

        System.out.println("Enter Your Id: ");
        long long ID = sc.nextLong();

        System.out.println("Enter Your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your SGPA: ");
        float sgpa = sc.nextFloat();

        System.out.println("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        
        System.out.println("--------------------Output----------------");

        System.out.println("My name is " + name + "\nMy Id is " + ID + "\nMy age is " + age + "\nMy SGPA " + numf + "\nMy CGPA " + numD );
        sc.close();
    }
}
