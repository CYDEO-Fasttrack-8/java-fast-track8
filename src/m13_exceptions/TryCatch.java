package m13_exceptions;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("execution started");

        String word = "java";

        try {
            System.out.println(word.charAt(5));
        }catch (RuntimeException e) {
            System.out.println("Exception caught and handled");
        }

        System.out.println("after word.charAt");

        try {
            System.out.println(10 / 0);
        }catch(ArithmeticException e){
            System.out.println("Cannot / by zero");
        }

        System.out.println("After try catch of / by zero");

        try {
            int[] nums = {3, 6, 1, 5};
            System.out.println(nums[20]);
        }catch (Exception e) {
            System.out.println("Exception caught with message = " + e.getMessage());
        }finally {
            System.out.println("Finally block");
        }
    }
}
