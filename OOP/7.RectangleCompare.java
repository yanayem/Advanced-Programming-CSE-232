/*Define a class Rectangle
The class should have two data members: length and width (both integers).
Overload the relational operator > to compare two Rectangle objects based on their area.
The operator should return true if the area of the first rectangle is greater than the second, and false 
otherwise.*/

class Rectangle{

    private int length;
    private int width;


    public Rectangle(int len, int wid){
        length = len;
        width = wid;
    }
public int getArea(){
        return length * width;
}
   public boolean isGreaterThan(Rectangle others){
        return this.getArea() > others.getArea();
   }
}

public class Main {
    static void main(String[] args) {
        Rectangle R1 = new Rectangle(18,18);
        Rectangle R2 = new Rectangle(12, 16);

      if(R1.isGreaterThan(R2)){
          System.out.println("First Rectangle greater then Second Rectangle");
      }
      else{
          System.out.println("Second Rectangle greater then first Rectangle");
      }
    }
}
