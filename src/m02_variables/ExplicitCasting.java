package m02_variables;

//converting from larger to smaller manually

public class ExplicitCasting {
    public static void main(String[] args) {
        double num1 = 100.5789;

        short num2 = (short) num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = 25;

        byte num4 = (byte) num3;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);


    }
}
