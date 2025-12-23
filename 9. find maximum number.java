public class Main {
    public static void main(String[] args) {
        int[] num = {40, 10, 25, 70, 35, 65, 50, 80, 15, 45};
        int l = num.length;
        int temp = num[0];
        for(int i = 0; i < l; i++){
            if(num[i] > temp){
                temp = num[i];
            }
        }
        System.out.println("Maximum number is: " + temp);
        
    }
}
