package m07_methods;

public class MethodOverloading {

    // without any overloading:

    public static void buyByType(String type) {
        System.out.println("Looking for " + type);
    }

    public static void buyByPrice(double price) {
        System.out.println("Looking in range " + price);
    }

    public static void buyByZipcode(int zipcode) {
        System.out.println("Looking in zipcode " + zipcode);
    }

    public static void buyByRooms(byte rooms) {
        System.out.println("Looking " + rooms + " rooms");
    }

    // without overloading there is 4 separate method names that would need to be used and remembered

    // with overloading

    public static void buy(String type) {
        System.out.println("Looking for " + type);
    }

    public static void buy(double price) {
        System.out.println("Looking in range " + price);
    }

    public static void buy(int zipcode) {
        System.out.println("Looking in zipcode " + zipcode);
    }

    public static void buy(byte rooms) {
        System.out.println("Looking " + rooms + " rooms");
    }

    // taking those same method but overloading them with the same name allows the above methods to be grouped better. There is still 4 methods that can do slightly different things, but they had a similar idea so overloading allowed them to share one name and different parameters

    /*
        "".substring()
        "".indexOf()
        System.out.println()
        Arrays.toString()
     */

}