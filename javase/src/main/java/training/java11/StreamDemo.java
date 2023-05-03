package training.java11;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo {

    public static void main(String[] args) {
        var random = new Random();
        var result = IntStream.generate(() -> random.nextInt(10))
                .filter(i -> i % 2 ==0).max();
        if (result.isEmpty()) {
            throw new IllegalStateException("No random number has been generated");
        }

        System.out.println(result.getAsInt());
    }
}
