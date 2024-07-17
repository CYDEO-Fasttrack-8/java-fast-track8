package tasks;

public class T02_PalindromeString {
    public static void main(String[] args) {
        String str = "civic";

        //1) StringBuilder
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str +" is palindrome");
        } else {
            System.out.println(str +" is not palindrome");
        }

        //2) Reverse to another string then compare
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str +" is palindrome");
        } else {
            System.out.println(str +" is not palindrome");
        }

        //3) using two pointer technique  "civic"
        boolean isPalindrome = true;
        for (int i = 0, j = str.length()-1; i < j; i++,j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(str +" is palindrome? - " + isPalindrome);

        if (isPalindrome("level")) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        System.out.println(isPalindrome("java"));

    }

    public static boolean isPalindrome(String str) {

        if (str == null || str.isEmpty()) return false;

        for (int i = 0, j = str.length()-1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
