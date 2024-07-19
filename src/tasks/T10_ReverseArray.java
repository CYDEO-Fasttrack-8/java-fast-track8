package tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T10_ReverseArray {
    public static void main(String[] args) {
        int[] nums1={5,3,2,5,99};
        System.out.println(Arrays.toString(reverse(nums1)));

        int[] nums2={57,3,24,5,99, 33};
        int[] rev = reverseV2(nums2);
        System.out.println("rev = " + Arrays.toString(rev));

        //================================
        List<Integer> numsList = new ArrayList<>(Arrays.asList(57,3,24,5,99, 33));
        System.out.println("numsList = " + reverseList(numsList));


    }

    public static int[] reverse(int[] nums) {
        for (int i = 0, j = nums.length-1; i < j; i++,j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public static int[] reverseV2(int[] nums) {
        int[] reversed = new int[nums.length];

        for (int i = nums.length-1, j=0; i >= 0; i--, j++) {
            reversed[j] = nums[i];
        }

        return reversed;
    }

    public static List<Integer> reverseList(List<Integer> nums) {
        //Collections.reverse(nums);
        List<Integer> reversed = new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            reversed.add(nums.get(i));
        }
        return reversed;
    }

}
