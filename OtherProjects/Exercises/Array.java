import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] arr = {5, 11, 2, 9, 1, 7, 3, 8, 6, 4, 10, 12};
        Arrays.sort(arr);
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        double average = (double) sum / arr.length;
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

