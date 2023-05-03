package training.java9;

public class Transfer {

    private Account source;

    private Account destination;

    public Transfer(Account source, Account destination) {
        this.source = source;
        this.destination = destination;
    }

    public void doTransfer(int amount) {
        // Megsérti: Demeter törvénye
//        source.setBalance(source.getBalance() - amount);
//        destination.setBalance(destination.getBalance() + amount);
        source.withdraw(amount);
        destination.increase(amount);
    }
}
