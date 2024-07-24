package m12_oop_inheritance;

public class MethodOverriding {
    public static void main(String[] args) {
        new Sport().perform();
        new Golf().perform();
        new Soccer().perform();
        System.out.println(new Soccer());
        System.out.println(new Golf());

        System.out.println("------------------------------");
        Building.open();
        Shed.open();

        System.out.println(Building.a);
        System.out.println(Shed.a);
    }
}

class Sport extends Object{
    void perform() {
        System.out.println("Performing sport");
    }

    public void perform(String action) {
        System.out.println("Performing " + action);
    }

    @Override
    public String toString() {
        return "Sports " + super.getClass().getSimpleName();
    }
}

class Golf extends Sport{
    @Override
    protected void perform() {
        System.out.println("Swinging club");
    }
}

class Soccer extends Sport{
    @Override
    public void perform() {
        System.out.println("Kicking ball");
    }
}


// static methods cannot be overridden. static method and variables are HIDDEN
class Building {
    public static int a = 10;
    public static void open() {
        System.out.println("Opening Building");
    }
}
class Shed extends Building{
    public static int a = 30;

    public static void open() {
        System.out.println("Opening Shed");
    }
}