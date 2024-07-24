package m13_exceptions;

import java.nio.file.Files;
import java.nio.file.Path;

public class ThrowVsThrows {

    public static String readFile(String filePath) {
        return Files.readAllLines(Path.of(filePath)).toString();
    }

}
