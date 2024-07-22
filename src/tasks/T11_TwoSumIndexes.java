package tasks;

public class T11_TwoSumIndexes {
    public static void main(String[] args) {
        /*
            array,           target -> need to return 2 indexes that sum to the target
            [3, 5, 1, 2, 9] -> 10 -> 2, 4
         */
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

}
