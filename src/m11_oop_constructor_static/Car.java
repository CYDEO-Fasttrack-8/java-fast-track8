package m11_oop_constructor_static;
/*
data and behaviour
//instance variables
- instance Method:
    -toString()
    -drive()
 */
public class Car {
    //instance/object variables: Each object has own copy of instance variables
    String make;
    String model;
    int year;

    //static variables. shared variables, one copy only
    static String purpose;
    static int count;

    //no-args constructor
    public Car() {
        this("unknown","unknown", 0);//call overloaded 3 args constructor for reusability
        System.out.println("No-args constructor");
//        make = "unknown";
//        model = "unknown";
//        year = 0;
        count++;
    }

    //overload the constructor.
    //constructor is special method, with same name as class name
    //and no return type. runs automatically when we create an object
    public Car(String make, String model, int year) {
        System.out.println("In overloaded. 3 args constructor");
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //instance/object method. Need to create object to access. Provides behaviour/action
    public void drive() {
        System.out.println("Driving " + make +" - " + model);
    }

    /*
    static method can be called using classname. belongs to class
     */
    public static void build() {
        System.out.println("building a car for " + purpose);
    }
}

class CarObjects {
    public static void main(String[] args) {
        //Car.make = "Kia"; make is object variable. need object to access
        Car car1 = new Car();
        car1.make = "Kia";
        car1.model = "Sorento";
        car1.year = 2022;

        System.out.println(car1.make);

        //static variable does not need object to be accessed
        Car.purpose = "transportation";
        System.out.println("Purpose of cars is " + Car.purpose);

        Car.count = 1000;
        System.out.println("Count of cars = " + Car.count);

        //===========================
        //create car object using overloaded constructor with 3 parameters
        Car honda = new Car("Honda","Accord", 2024);
        System.out.println(honda.year);
        System.out.println("honda purpose = " + honda.purpose);
        System.out.println("car1 make = " + car1.make);
        //=============================
        honda.drive();//calling instance method using object

        //=============================
        Car.build(); //static method call.

        System.out.println(car1.purpose);
        System.out.println(honda.purpose);
        System.out.println(Car.purpose);

        Car.purpose = "taxi/uber";

        System.out.println(car1.purpose);
        System.out.println(honda.purpose);
        System.out.println(Car.purpose);

        System.out.println(Math.max(10, 5));
        //Math math = new Math(); private constructor will prevent from creating objects
    }
}