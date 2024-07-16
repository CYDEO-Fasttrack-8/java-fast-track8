package m02_variables;

//Automatic conversion from small to larger type

public class ImplicitCasting {
    public static void main(String[] args) {
        int n1 = 44;
        int n2 = n1;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        byte num1 = 25;
        int num2 = num1; // implicit casting

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        double num3;
        int num4 = 10;

        num3 = num4; // 10.0

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }
}
