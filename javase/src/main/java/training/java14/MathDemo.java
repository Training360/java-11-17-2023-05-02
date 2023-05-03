package training.java14;

public class MathDemo {

    public static void main(String[] args) {
        var i = Integer.MAX_VALUE;
        System.out.println(i);
//        i++;
//        System.out.println(i);

        Math.incrementExact(i);
    }
}
