class Power{
    int base;
    int power;
    public Power(int b, int p){
        base = b;
        power = p;
    }
    int result = 1;
    void calculatePower(){
        result = (int) Math.pow(base,power);
    }
    int showResult(){
        return result;
    }
}
public class Main{
   public static void main(String[] args) {
       Power obj = new Power(2,3);
       obj.calculatePower();
        System.out.println("Result: " + obj.showResult());
    }
}
