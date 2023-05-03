package training.java9;

import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {

    public static void main(String[] args) {
//        Map<Integer, String> names = Map.of(1, "John", 2, "Jack", 3, "Jane");

//        Map<Integer, String> names = new HashMap<>() {{
//            put(1, "John");
//            put(2, "Jack");
//            put(3, "Jane");
//        }};

        Map<Integer, String> names = Map.ofEntries(
                Map.entry(1, "John"), Map.entry(2, "Jack"), Map.entry(3, "Jane")
        );

        System.out.println(names);

        // Fail fast
    }
}
