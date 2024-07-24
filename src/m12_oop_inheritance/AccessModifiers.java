package m12_oop_inheritance;

public class AccessModifiers {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // No modifier, package-private
    private int privateVar = 4;

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println("Public Var: " + obj.publicVar);
        System.out.println("Protected Var: " + obj.protectedVar);
        System.out.println("Default Var: " + obj.defaultVar);
        System.out.println("Private Var: " + obj.privateVar); // Accessible within the same class
    }
}

class OtherClassInSamePackage {
    void testAccess() {
        AccessModifiers obj = new AccessModifiers();
        System.out.println("Public Var: " + obj.publicVar);
        System.out.println("Protected Var: " + obj.protectedVar);
        System.out.println("Default Var: " + obj.defaultVar);
        // obj.privateVar is not accessible here
    }
}