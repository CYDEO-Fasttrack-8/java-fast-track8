package m15_abstraction;

public abstract class App {
    //regular . non-abstract method
    public void build() {
        System.out.println("building an app using java");
    }

    //abstract method. No implementation. no method body
    public abstract void launch();
}
