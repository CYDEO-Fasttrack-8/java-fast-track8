package m14_encapsulation;

public class Color {
    private String name;

    //SETTER method
    public void setName(String name) {
        if (name.isBlank()) {
            throw new RuntimeException("Color name is empty");
        }
        this.name = name;
    }

    //GETTER method
    public String getName() {
        return name;
    }
}

class ColorObjects {
    public static void main(String[] args) {
        Color color1 = new Color();
        //color1.name = "red";
        color1.setName("red");
        System.out.println(color1.getName());
    }
}