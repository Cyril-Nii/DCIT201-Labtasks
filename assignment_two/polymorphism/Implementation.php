<?php

require_once 'SavingsAccount.php';
require_once 'BankAccount.php';

$saccount = new SavingsAccount("Alice", "SA123", 500, 0.03);

$saccount->deposit(34.7);
$saccount->depositWithNote(200, "From a friend");
$saccount->withdraw(10);
$saccount->displayAccountDetails();
