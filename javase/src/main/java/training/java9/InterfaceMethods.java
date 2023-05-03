package training.java9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterfaceMethods {

    public static void main(String[] args) {
        // Statikus metódus:
        // Példány létrehozására

//        List<String> names = new ArrayList<>();
//        names.add("John");
//        names.add("Jack");
//        names.add("Jane");

        List<String> names = List.of("John", "Jack", "Jane");
        names.add("John");

        //System.out.println(names.getClass().getName());

//        List<String> names = Arrays.asList("John", "Jack", "Jane");
        // Mit keres itt az array?
        // Util osztály - rossz, antipattern
        // https://www.elegantobjects.org/

//        names.add("John");
//        names.set(1, "John");
//        System.out.println(names);

        // Java 5-ig java.io.File -
        //Path file = Paths.get("src/main/resources/names.txt");
        Path file = Path.of("src/main/resources/names.txt");
        System.out.println(file.getClass().getName());


        try {
            String content = null;
            content = Files.readString(file);
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Java 8-tól java.util.Date-et sose használjuk
        LocalDate date = LocalDate.of(2000, 1, 1);
    }
}
