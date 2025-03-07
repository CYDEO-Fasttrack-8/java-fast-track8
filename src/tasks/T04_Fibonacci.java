package tasks;

import java.util.Arrays;

//0, 1, 1, 2, 3, 5, 8
public class T04_Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i <= 6 ; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }

        //2) second way using array
        int[] fib = new int[7];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= 6; i++) {
            fib[i] = fib[i-2] + fib[i-1];
        }
        System.out.println(Arrays.toString(fib));

    }
}
