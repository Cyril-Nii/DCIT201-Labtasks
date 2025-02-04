package assignment_one.encapsulation;

public class Transaction {

    private String transactionId;
    private String accountNumber;
    private String transactionType;
    private double amount;
    private String timestamp;

    public Transaction(String transactionId, String accountNumber, String transactionType, double amount, String timestamp) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        return timestamp;
    }


}
