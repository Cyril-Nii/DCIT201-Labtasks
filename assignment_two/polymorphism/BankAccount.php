<?php

class BankAccount {
    private string $accountHolderName;
    private string $accountNumber;
    private float $balance;

    public function __construct(string $accountHolderName, string $accountNumber, float $balance){
    if($balance < 0){
        throw new \InvalidArgumentException("Balance must be greater than 0");
    }

    $this->accountHolderName = $accountHolderName;
    $this->accountNumber = $accountNumber;
    $this->balance = $balance;
}

    public function getAccountHolderName():string{
        return $this->accountHolderName;
    }

    public function setAccuontHolderName(string $accountHolderName){
        $this->accountHolderName = $accountHolderName;
    }

    public function getAccountNumber(): string {
        return $this->accountNumber;
    }

    public function setAccountNumber(string $accountNumber): void {
        $this->accountNumber = $accountNumber;
    }

    public function getBalance(): float {
        return $this->balance;
    }

    public function setBalance(float $balance): void {
        if ($balance < 0) {
            throw new \InvalidArgumentException("Balance must be greater than 0");
        }
        $this->balance = $balance;
    }

    public function deposit(float $amount):void {

        if ($amount <= 0) {
            throw new \InvalidArgumentException("Deposit amount must be greater than 0");
        }

        $this->balance += $amount;
        print "Deposit successful. Updated balance: " . $this->balance . "\n";
    }

    public function depositWithNote(float $amount, string $note):void{

        $this->deposit($amount);
        echo "Note: " . $note . "\n";

    }

    public function withdraw(float $amount):void {
        if ($amount <= 0) {
            throw new \InvalidArgumentException("Withdrawal amount must be greater than 0");
        }

        if ($amount > $this->balance) {
            throw new \InvalidArgumentException("Insufficient funds");
        }

        $this->balance -= $amount;
        echo "Withdrawal successful. Updated balance: " . $this->balance;
    }

    public function displayAccountDetails():void {
        echo "\nAccount Holder Name: " . $this->accountHolderName . "\n";
        echo "Account Number: " . $this->accountNumber . "\n";
        echo "Balance: " . $this->balance . "\n";
    }


}