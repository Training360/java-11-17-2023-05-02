package training.java14;

import static training.java14.SwitchDemo.Fruit.*;

public class SwitchDemo {

    public enum Fruit {APPLE, PEAR, ORANGE, AVOCADO, RASPBERRY}

    public static void main(String[] args) {
        var fruit = APPLE;
        var name = switch (fruit) {
            case APPLE -> "APPLE";
            case PEAR -> "PEAR";
            case ORANGE -> "ORANGE";
            case AVOCADO -> "AVOCADO";
            default -> "unknown";
        };
        System.out.println(name);
    }
}
