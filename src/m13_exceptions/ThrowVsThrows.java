package m13_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/*
For checked exceptions to compile:
    1) HANDLE - using try..catch..finally
    2) DECLARE - using THROWS keyword in method signature
Throws keyword is used to DECLARE that method might throw exception
In checked exceptions, it will help our code to compile, without using try/catch

THROW new ExceptionType() is used to create exception. and make code to stop
 */
public class ThrowVsThrows {
    public static void main(String[] args) throws IOException {
        String data = readFile("src/m13_exceptions/data.txt");
        System.out.println("data = " + data);

        checkEligible(22);
    }

    public static String readFile(String filePath) throws IOException{ //DECLARE this method throws an Exception
        return Files.readAllLines(Path.of(filePath)).toString();
    }

    public static void checkEligible(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age is not valid");
        }

        if (age >= 18) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }

}
