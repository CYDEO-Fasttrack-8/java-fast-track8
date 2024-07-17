package m08_arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {4, 5, 12, 6};

        //1) Using arrays.toString to print in same line as String
        System.out.println(Arrays.toString(arr));

        //2) for loop
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //3) for each
        for(int n : arr) {
            System.out.println("n = " + n);
        }
        
    }
}
