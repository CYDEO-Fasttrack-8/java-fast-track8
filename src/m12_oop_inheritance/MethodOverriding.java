package m12_oop_inheritance;

public class MethodOverriding {

    class Sport {
        void perform() {
            System.out.println("Performing sport");
        }

        @Override
        public String toString() {
            return "Sports " + super.getClass().getSimpleName();
        }
    }

    class Golf extends Sport{
        @Override
        void perform() {
            System.out.println("Swinging club");
        }
    }
    class Soccer extends Sport{
        @Override
        void perform() {
            System.out.println("Kicking ball");
        }
    }
}
