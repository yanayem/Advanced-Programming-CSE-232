public class Main {
    static int[] Solve(int[] num, int l){
        int sum = 0; 
        int max = num[0];
        int cntE = 0; 
        
       for(int i = 0; i < l; i++){
           sum+=num[i];
           if(num[i] > max){
               max = num[i];
           }
           
           if(num[i] % 2 == 0){
               cntE++;
           }
       }
       
       return new int[]{sum, max, cntE};

    }
    public static void main(String[] args) {
        int[] num = { 4, 1, 6, 7, 9, 3, 6, 8};
        int l = num.length;
        
        int[] result = Solve(num, l);
         System.out.println("Sum = " + result[0]);
         System.out.println("Maximum = " + result[1]);
         System.out.println("Total Even Number = " + result[2]);
        
    }
}
