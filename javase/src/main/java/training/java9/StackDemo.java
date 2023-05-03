package training.java9;

public class StackDemo {

    private void m1() {
        m2();
    }

    private void m2() {
        m3();
    }

    private void m3() {
        StackWalker.getInstance().forEach(
                frame -> System.out.println("file: %s, line number: %s".formatted(frame.getFileName(), frame.getLineNumber()))
        );
    }

    public static void main(String[] args) {
        new StackDemo().m1();
    }
}
