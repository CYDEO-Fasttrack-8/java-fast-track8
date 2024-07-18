package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class T08_RemoveDuplicatedFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 7, 5, 0, 2, 4, 2, 0, 3, 3));

        //1) using stream
        List<Integer> unique = nums.stream().distinct().toList(); //earlier java.collect(Collectors.toList());
        System.out.println("unique = " + unique);

        //2) add to set. set is collection of unique values
        Set<Integer> uniqueSet = new LinkedHashSet<>(nums);
        System.out.println("uniqueSet = " + uniqueSet);

        //3) use a loop and add to another list
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int num : nums) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        System.out.println("uniqueNumbers = " + uniqueNumbers);
    }
}
