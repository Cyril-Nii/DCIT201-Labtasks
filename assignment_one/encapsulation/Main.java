package assignment_one.encapsulation;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount("A101", "Alice Johnson", 5000.0, "Savings");
        bank.createAccount("A102", "Bob Smith", 2000.0, "Current");
        bank.createAccount("A103", "Charlie Brown", 3000.0, "Savings");

        bank.processTransaction("A101", "Deposit", 1000.0);
        bank.processTransaction("A102", "Withdrawal", 2500.0);
        bank.processTransaction("A103", "Withdrawal", 4000.0);

        bank.getAccountSummary("A101");

        bank.getBankAnalytics();
    }

}
