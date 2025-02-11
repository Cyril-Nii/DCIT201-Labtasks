<?php

require_once 'Employee.php';
require_once 'FullTimeEmployee.php';

$ftemployee = new FullTimeEmployee("Aliko Dangote", "22241994", 1200.00);

$ftemployee->Details();

$ftemployee->calculatePay();