package welcome.backend;

public class Welcome {

    public String sayHello(String name) {
        return "Welcome %s".formatted(name);
    }
}
