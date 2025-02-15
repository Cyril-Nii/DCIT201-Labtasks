<?php

require_once 'BankAccount.php';

class SavingsAccount extends BankAccount{

    private float $interestRate;

    public function __construct(string $accountHolderName, string $accountNumber, float $balance, float $interestRate){
        parent::__construct($accountHolderName, $accountNumber, $balance);
        if($interestRate<0 || $interestRate>1){
            throw new \InvalidArgumentException("Interest rate must be between 0 and 1");
        }

        $this->interestRate = $interestRate;
    }

    public function getInterestRate(): float {
        return $this->interestRate;
    }

    public function setInterestRate(float $interestRate): void {
        if($interestRate<0 || $interestRate>1){
            throw new \InvalidArgumentException("Interest rate must be between 0 and 1");
        }

        $this->interestRate = $interestRate;
    }

    public function withdraw(float $amount): void {
        if($this->getBalance() - $amount < 100){
            throw new \InvalidArgumentException("Insufficient balance. Minimum balance must be $100");
        }

        parent::withdraw($amount);
    }

    public function calculateInterest(): void {
        $interest = $this->getBalance() * $this->interestRate;
        echo "Annual interest: " . $interest;
    }

    public function displayAccountDetails(): void {
        parent::displayAccountDetails();
        echo "Interest rate: " . $this->interestRate . "\n";
    }

}