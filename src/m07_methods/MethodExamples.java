package m07_methods;

public class MethodExamples {
    // void method

    public static void method1(){
        System.out.println("Hello World");
    }

    // return method
    public static String method2(){
        return "Hello Universe";
    }

    // parameters

    public static void method3(String s) {
        System.out.println(s.length());
    }

    public static int method4(String s) {
        return s.length(); // can be any int type
    }

    // instance method
    public void method5(){
        System.out.println("Java is fun");
    }

    // return in void
    public static void method6(int n){

        if(n < 0){
            return;
        }

        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

}
