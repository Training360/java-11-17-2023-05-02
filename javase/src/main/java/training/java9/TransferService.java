package training.java9;

//@Service
public class TransferService {

    public void doTransfer(int sourceId, int destinationId, int amount) {
        Account source = null; // repo.findById(sourceId);
        Account destination = null; // repo.findById(destinationId);
        Transfer transfer = new Transfer(source, destination);
        transfer.doTransfer(amount);
    }
}
