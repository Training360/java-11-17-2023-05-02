package training.java11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class IoDemo {

    public static void main(String[] args) {
//        var file = Path.of("src/main/resources/names.txt").toFile();

        // new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))

//        var file = Path.of("src/main/resources/names.txt");
//        try (var reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException ioe) {
//            throw new RuntimeException("Can not read file", ioe);
//        }

        var file = Path.of("src/main/resources/names.txt");
        try (var lines = Files.lines(file)) {
            lines.forEach(System.out::println);
        } catch (IOException ioe) {
            throw new RuntimeException("Can not read file", ioe);
        }
    }
}
