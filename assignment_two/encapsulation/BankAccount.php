<?php

namespace banking_system;

class BankAccount {
<<<<<<< HEAD
/* -  accountNumber (string): The account number of the bank account 
-  accountHolder (string): The name of the account holder. 
-  balance (float): The current balance in the account (must be ≥ 0.0). 
-  interestRate (float): The annual interest rate for the account (must be between 0.0 and 
1.0).*/
=======
>>>>>>> f247f56 (Some corrections made)

private string $accountNumber;
private string $accountHolder;
private float $balance;
private float $interestRate;


// Constructor: Initializes all class attributes.
public function __construct(string $accountNumber, string $accountHolder, float $balance, float $interestRate){
    
    if($accountNumber == null || strlen($accountNumber) != 9) {
        throw new \InvalidArgumentException("Account number must be 9 characters");
    }

    if($accountHolder == null) {
        throw new \InvalidArgumentException("Account holder is required");
    }
    
    if($balance < 0.0 || $balance == null) {
        throw new \InvalidArgumentException("Balance must be greater than or equal to 0.0");
    }

    if($interestRate < 0.0 || $interestRate > 1.0 || $interestRate == null) {
        throw new \InvalidArgumentException("Interest rate must be between 0.0 and 1.0");
    }

    $this->accountNumber = $accountNumber;
    $this->accountHolder = $accountHolder;
    $this->balance = $balance;
    $this->interestRate = $interestRate;
}

// Getters and Setters
public function getAccountNumber(): string {
    return $this->accountNumber;
}

public function getAccountHolder(): string {
    return $this->accountHolder;
}

public function getBalance(): float {
    return $this->balance;
}

public function getInterestRate(): float {
    return $this->interestRate;
}

public function setAccountHolder(string $accountHolder): void {
    if($accountHolder == null) {
        throw new \InvalidArgumentException("Account holder is required");
    }
    $this->accountHolder = $accountHolder;
}


public function setInterestRate(float $interestRate): void {
    if($interestRate < 0.0 || $interestRate > 1.0 || $interestRate == null) {
        throw new \InvalidArgumentException("Interest rate must be between 0.0 and 1.0");
    }
    $this->interestRate = $interestRate;
}


<<<<<<< HEAD
// deposit(float $amount): Adds the specified amount to the balance.
=======

>>>>>>> f247f56 (Some corrections made)
public function deposit(float $amount): void{
    $this->balance += $amount;
}

<<<<<<< HEAD
// withdraw(float $amount): Deducts the specified amount from the balance(if sufficient funds are available)
=======

>>>>>>> f247f56 (Some corrections made)
public function withdraw(float $amount): void{
    if($this->balance >= $amount) {
        $this->balance -= $amount;
    }
    else {
        echo "Insufficient funds";
    }
}

<<<<<<< HEAD
// calculateInterest: Returns the annual interest earned using the formula: balance * interestRate.
=======

>>>>>>> f247f56 (Some corrections made)
public function calculateInterest(): float{
    return $this->balance * $this->interestRate;
}




}

<<<<<<< HEAD
/* A. Implement the BankAccount class with encapsulation in PHP. 
B. Create an instance of the BankAccount class. 
C. Update the account balance and display updated details 
D. Calculate and display annual interest earned
*/

// New instance of the Bank 
=======
// New instance of the BankAccount class
>>>>>>> f247f56 (Some corrections made)
$account = new BankAccount("223505990", "Cyril Tagoe", 1000.0, 0.05);

// Updating the account balance
$account->deposit(500.0);
$account->withdraw(200.0);

// Displaying the updated details
echo "Account Number: " . $account->getAccountNumber() . "\n";
echo "Account Holder: " . $account->getAccountHolder() . "\n";
echo "Balance: " . $account->getBalance() . "\n";
echo "Interest Rate: " . $account->getInterestRate() . "\n";

// Calculating and displaying annual interest earned
$interest = $account->calculateInterest();
echo "Annual Interest Earned: " . $interest . "\n";

