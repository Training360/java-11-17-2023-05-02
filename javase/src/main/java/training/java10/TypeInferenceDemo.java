package training.java10;

import java.util.function.Function;

public class TypeInferenceDemo {

    public static void main(String[] args) {
//        Object o = "hello";
//        System.out.println(o.);

        var o = "hello";
        System.out.println(o.toUpperCase());

        var i = 10;
        System.out.println(i);


        var function = (Function<Integer, String>) number -> "12";
    }
}
