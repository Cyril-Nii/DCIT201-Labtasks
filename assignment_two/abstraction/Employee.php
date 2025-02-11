<?php

abstract class Employee {

    private string $name;
    private string $employeeId;

    public function __construct(string $name, string $employeeId){
        $this->name = $name;
        $this->employeeId = $employeeId;
    }

    public function getName():string {
        return $this->name;
    }

    public function getEmployeeId():string{
        return $this->employeeId;
    }

    public abstract function calculatePay();
}