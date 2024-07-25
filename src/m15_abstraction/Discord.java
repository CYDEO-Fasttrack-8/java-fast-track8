package m15_abstraction;
/*
Discord is CONCRETE class since it is extending
abstract class. and must override abstract methods
 */
public class Discord extends App {
    @Override
    public void launch() {
        System.out.println("Launching discord server..");
    }
}

class AppObjects {
    public static void main(String[] args) {
        Discord discord = new Discord();
        discord.build();
        discord.launch();

        //App app = new App(); ERROR: Cannot create object of abstract class
    }
}