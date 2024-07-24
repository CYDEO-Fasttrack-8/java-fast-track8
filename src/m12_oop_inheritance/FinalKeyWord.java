package m12_oop_inheritance;

public class FinalKeyWord {
}

/*
FINAL class cannot be inherited
 */
final class IPhone15{}
//class MyPhone extends IPhone15{ //ERROR: Cannot extend final class
//}

/*
FINAL method, cannot be overridden
 */
class School {
    public final void study() {
        System.out.println("You come to school for studying");
    }
}
class Elementary extends School {
//    public void study() { //ERROR: Final method cannot be overriden
//    }
}

/*
FINAL variable: cannot change the value
Constant variable
 */
class Desktop {
    public static void main(String[] args) {
        final int maxCount = 10;
        //maxCount = 44; Cannot change value for final variable.
    }
}