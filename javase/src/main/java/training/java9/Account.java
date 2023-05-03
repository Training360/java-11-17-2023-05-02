package training.java9;

public class Account {

    private int balance;

    public void withdraw(int amount) {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Can not withdraw: %d".formatted(balance));
        }
        balance -= amount;
    }

    public void increase(int amount) {
        balance += amount;
    }
}
