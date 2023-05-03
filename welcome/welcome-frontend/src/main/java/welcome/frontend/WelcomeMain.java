package welcome.frontend;

import welcome.backend.Welcome;

import java.util.ServiceLoader;

public class WelcomeMain {

    public static void main(String[] args) {
        Welcome welcome = ServiceLoader.load(Welcome.class)
                        .findFirst().orElseThrow();
        System.out.println(welcome.getClass().getName());
        System.out.println(welcome.sayHello("Trainer"));
    }
}
