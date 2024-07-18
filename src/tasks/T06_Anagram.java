package tasks;

import java.util.Arrays;

public class T06_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc","cab"));
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("Dormitory", "Dirty Room"));
    }

    public static boolean isAnagram(String s1, String s2) {

        //remove spaces, and convert to lowercase
        s1 = s1.replace(" ","").toLowerCase();
        s2 = s2.replace(" ","").toLowerCase();

        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

}
