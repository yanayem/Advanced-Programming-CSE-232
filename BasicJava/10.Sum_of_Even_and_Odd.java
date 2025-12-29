
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};


        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                sumEven+=array[i];
            }
            else{
                sumOdd+=array[i];
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

    }
}