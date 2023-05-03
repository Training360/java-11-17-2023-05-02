package welcome.backend.implementation;

import welcome.backend.Welcome;

public class SimpleWelcome implements Welcome {

    @Override
    public String sayHello(String name) {
        return "Welcome %s".formatted(name);
    }
}
