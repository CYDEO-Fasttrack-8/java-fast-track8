package m04_conditionals;

public class ConditionalExample {
    public static void main(String[] args) {

        int day = 5;

        if (day < 1 || day > 7) {
            System.out.println("Invalid day");
        }

        if(day >= 1 && day <= 7) {
            System.out.println("Valid day");
        } else {
            System.out.println("Invalid day");
        }

        /*
        without brackets
        if(day < 1 || day > 7)
            System.out.println("Invalid day");
         */

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }

        System.out.println("------------------------------------------------------");

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        System.out.println("------------------------------------------------------");

        System.out.println( day == 1 ? "Monday" : day == 2 ? "Tuesday" : day == 3 ? "Wednesday" : day == 4 ? "Thursday" : day == 5 ? "Friday" : day == 6 ? "Saturday" : "Sunday");

        String result = day >= 1 && day <= 7 ? "valid" : "invalid";
    }
}

