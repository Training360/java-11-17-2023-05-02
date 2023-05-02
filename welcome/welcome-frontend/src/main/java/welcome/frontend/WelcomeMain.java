package welcome.frontend;

import welcome.backend.Welcome;

public class WelcomeMain {

    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        System.out.println(welcome.sayHello("Trainer"));
    }
}
