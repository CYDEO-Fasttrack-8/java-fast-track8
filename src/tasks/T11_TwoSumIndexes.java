package tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
            array,           target -> need to return 2 indexes that sum to the target
            [3, 5, 1, 2, 9] -> 10 -> 2, 4
         */
public class T11_TwoSumIndexes {
    public static void main(String[] args) {
        int[] nums1 = {3, 5, 1, 2, 9};
        int[] indexes = find2Sum(nums1, 10);
        System.out.println(Arrays.toString(indexes));

        int[] result = findTwoSum(nums1, 10);
        System.out.println(Arrays.toString(result));

    }
    //nested loops
    public static int[] find2Sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];//0,0
    }
        //[3, 5, 1, 2, 9] -> 10
    public static int[] findTwoSum(int[] nums, int target) {
        // arr value, index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff) , i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }

}
