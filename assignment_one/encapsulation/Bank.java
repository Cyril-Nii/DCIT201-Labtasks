package assignment_one.encapsulation;

import java.util.List;
import java.util.ArrayList;


public class Bank {

    private List<Account> accounts;
    private List<Transaction> transactions;


    public Bank() {
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public Account getAccount(String accountNumber){

        for(Account account : accounts){

            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }

        }
        return null;
    }


    public void createAccount(String accountNumber, String accountHolderName, double initialDeposit, String accountType){

        Account account = new Account(accountNumber, accountHolderName, initialDeposit, accountType);

        if(accounts.contains(account)){
            System.out.println("Account number already exists.");
        } else {
            accounts.add(account);
            System.out.println("Account created successfully.");
        }
    }

    public void processTransaction(String accountNumber, String transactionType, double amount) {

        if (getAccount(accountNumber) == null) {
            System.out.println("Account not found.");
        } else {
            Account account = getAccount(accountNumber);

            if (transactionType.equals("Deposit")) {
                account.deposit(amount);

            } else if (transactionType.equals("Withdrawal")) {
                account.withdraw(amount);

            } else {
                System.out.println("Invalid transaction type. Must be 'Deposit' or 'Withdrawal'.");
            }

            Transaction transaction = new Transaction("T" + (transactions.size() + 1), accountNumber, transactionType, amount, "timestamp");
            transactions.add(transaction);
        }
    }

    public void getAccountSummary(String accountNumber){

        Account account = getAccount(accountNumber);

        if(account == null){
            System.out.println("Account not found.");

        } else {

            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Balance: " + account.getBalance());

            System.out.println("\nTransactions:");

            for(Transaction transaction : transactions){

                if(transaction.getAccountNumber().equals(accountNumber)){
                    System.out.println("\nTransaction ID: " + transaction.getTransactionId());
                    System.out.println("Transaction Type: " + transaction.getTransactionType());
                    System.out.println("Amount: " + transaction.getAmount());
                    System.out.println("Timestamp: " + transaction.getTimestamp());
                }
            }
        }
    }


    public void getBankAnalytics(){

        System.out.println("Total Accounts: " + accounts.size());

        double totalBalance = 0;

        for(Account account : accounts){
            totalBalance += account.getBalance();
        }

        System.out.println("Total Balance: " + totalBalance);

        System.out.println("Total Transactions: " + transactions.size());

        int depositCount = 0;
        int withdrawalCount = 0;

        for(Transaction transaction : transactions){

            if(transaction.getTransactionType().equals("Deposit")){
                depositCount++;
            } else {
                withdrawalCount++;
            }

        }

        System.out.println("Deposit Transactions: " + depositCount);

        System.out.println("Withdrawal Transactions: " + withdrawalCount);
    }

    public void getTopAccounts(int n) {
        if (n > accounts.size()) {
            System.out.println("Invalid number of accounts.");
        } else {
            accounts.sort((a1, a2) -> Double.compare(a2.getBalance(), a1.getBalance()));
            for (int i = 0; i < n; i++) {
                System.out.println("Account Number: " + accounts.get(i).getAccountNumber());
                System.out.println("Account Holder Name: " + accounts.get(i).getAccountHolderName());
                System.out.println("Account Type: " + accounts.get(i).getAccountType());
                System.out.println("Balance: " + accounts.get(i).getBalance());
            }
        }
    }
}
