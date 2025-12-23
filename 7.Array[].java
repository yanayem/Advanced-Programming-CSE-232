public class Main {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50 };
        String[] name ={"Nayem", "Yeasin", "Arafat", "Bhuiyan"};
        System.out.println("His Name is " + name[0] + " " + name[3] + " and " + "his age is " + num[1]);
        
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}
