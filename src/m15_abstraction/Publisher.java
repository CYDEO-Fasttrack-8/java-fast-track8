package m15_abstraction;

public interface Publisher {
    public static final int sizeLimit = 500;
    public abstract void publish(String item);
}
