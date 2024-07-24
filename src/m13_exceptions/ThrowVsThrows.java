package m13_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/*
Throws keyword is used to DECLARE that method might throw exception
In checked exceptions, it will help our code to compile, without using try/catch
 */
public class ThrowVsThrows {
    public static void main(String[] args) throws IOException {
        String data = readFile("src/m13_exceptions/data.txt");
        System.out.println("data = " + data);
    }

    public static String readFile(String filePath) throws IOException{ //DECLARE this method throws an Exception
        return Files.readAllLines(Path.of(filePath)).toString();
    }

}
