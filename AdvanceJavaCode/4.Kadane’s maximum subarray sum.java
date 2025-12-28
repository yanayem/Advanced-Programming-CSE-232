public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, -8, 7, -1, 2, 3};

        int currentsum = 0;
        int maxsum = array[0];
        int start = 0, end = 0, tempStart = 0;

        // Kadane’s Algorithm with index tracking
        for (int i = 0; i < array.length; i++) {
            currentsum += array[i];

            if (currentsum > maxsum) {
                maxsum = currentsum;
                start = tempStart;
                end = i;
            }

            if (currentsum < 0) {
                currentsum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxsum);

        // Print values of subarray that gives max sum
        System.out.print("Subarray values: ");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
    }
}