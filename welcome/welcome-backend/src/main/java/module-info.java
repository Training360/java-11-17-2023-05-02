import welcome.backend.Welcome;
import welcome.backend.implementation.SimpleWelcome;

module welcome.backend {

    exports welcome.backend;

    provides Welcome with SimpleWelcome;
}