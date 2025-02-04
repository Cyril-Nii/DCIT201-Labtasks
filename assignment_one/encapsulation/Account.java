package assignment_one.encapsulation;

public class Account {

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public Account(String accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if(accountType == "Savings" || accountType == "Current"){
            this.accountType = accountType;
        } else {
            System.out.println("Invalid account type. Must be 'Savings' or 'Current'.");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful. New balance: " + getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}
