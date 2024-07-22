package tasks;

import java.util.ArrayList;
import java.util.List;

public class T12_ShiftZerosInList {
    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>(List.of(0,0,3,1,0,9,0,8));
        System.out.println(moveZeros(numsList));
        System.out.println(move0s(numsList));
    }
    //[0,0,3,1,0,9,0,8] => [3,1,9,8,0,0,0]
    public static List<Integer> moveZeros(List<Integer> nums) {
        List<Integer> nonZeros = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();
        for (int each : nums) {
            if (each == 0) {
                zeros.add(each);
            }else{
                nonZeros.add(each);
            }
        }
        nonZeros.addAll(zeros);
        return nonZeros;
    }

    public static List<Integer> move0s(List<Integer> nums) {
        //get size of list with all 0s
        int sizeA = nums.size();
        //remove all 0s
        nums.removeIf(n -> n == 0);
        //get size after removing 0s
        int sizeB = nums.size();
        //get count of 0s
        int count = sizeA - sizeB;
        //add zeros to the list
        for (int i = 1; i <= count ; i++) {
            nums.add(0);
        }

        return nums;
    }

}
