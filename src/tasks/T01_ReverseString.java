package tasks;

public class T01_ReverseString {
    public static void main(String[] args) {
        String str = "hi all";

        //1) using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed = " + reversed);
        
        //2) using a for loop
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println("rev = " + rev);

        String reversedStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("reversedStr = " + reversedStr);
    }
}
