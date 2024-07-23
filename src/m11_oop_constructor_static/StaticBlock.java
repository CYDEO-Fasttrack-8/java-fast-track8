package m11_oop_constructor_static;
/*
static block/static initializer block.
- runs only once before everything else when class is used
- used to initialize static variables or load data(ConfigReader class)
 */
public class StaticBlock {
    public static int num;

    static {
        System.out.println("Static block");
        num = 100;
    }
}

class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlock st = new StaticBlock();
        StaticBlock stb = new StaticBlock();

        System.out.println(StaticBlock.num);
    }
}