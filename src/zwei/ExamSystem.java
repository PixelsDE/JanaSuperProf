package zwei;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExamSystem {

    public static String hashFile(String file, Hashing hash) {

        return hash.hashDocument(new ExamSystem().readFile(file));

    }

    public String readFile(String file) {
        try {
            return new BufferedReader(new FileReader(file)).lines().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
