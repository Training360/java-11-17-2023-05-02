package training.java9;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        String name = null;

        System.out.println(Stream.ofNullable(name).count());
        System.out.println(Optional.ofNullable(name).stream().count());
    }
}
