package m15_abstraction;

public class Facebook extends App implements Publisher {
    @Override
    public void launch() {
        System.out.println("Logging into facebook using face recognition");
    }

    @Override
    public void publish(String item) {
        System.out.println("posting " + item + " to facebook");
    }
}

class FacebookObject {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.launch();
        facebook.publish("image");
    }
}