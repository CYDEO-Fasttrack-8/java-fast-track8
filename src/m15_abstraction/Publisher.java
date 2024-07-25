package m15_abstraction;

public interface Publisher {
    public static final int sizeLimit = 500;

    public abstract void publish(String item);

    public default void unpublish(String item) {
        System.out.println("Unpublishing " + item);
    }

    public static void describe() {
        System.out.println("this is a posting");
    }
}
