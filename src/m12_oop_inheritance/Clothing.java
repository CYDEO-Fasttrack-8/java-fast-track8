package m12_oop_inheritance;
/*
    Constructors in Inheritance.
    Super class constructor is called first then sub class constructor
    super() is used to call parent class constructor
 */
public class Clothing {
    String company;
    public Clothing() {
        System.out.println("Clothing no args constructor");
    }

    public Clothing(String company) {
        System.out.println("Clothing 1 arg constructor");
        this.company = company;
    }

}

//class Shirt extends Clothing{
//
//    public Shirt(String company) {
//        super(company);
//    }
//}

class Jacket extends Clothing {
    public Jacket() {
        super(); //calling parent class constructor
        //super("HM"); can either call args constructor
        System.out.println("Jacket no args constructor");
    }

    public Jacket(String company) {
        super(company);
        System.out.println("Jacket 1 arg constructor");
    }
}

class ClothingObjects {
    public static void main(String[] args) {
        Jacket jk = new Jacket();
        Jacket jacket = new Jacket("Gap");
        System.out.println("jacket.company = " + jacket.company);
    }
}