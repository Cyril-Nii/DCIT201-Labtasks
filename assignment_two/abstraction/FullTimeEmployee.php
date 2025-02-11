<?php

class FullTimeEmployee extends Employee {

    private float $salary;

    public function __construct(string $name,string $employeeId,float $salary) {
        parent::__construct($name, $employeeId);
        if ($salary < 0){
            throw new \InvalidArgumentException("Salary cannot be a negative value");
        }

        $this->salary = $salary;
    }

    public function getSalary():float{
        return $this->salary;
    }

    public function calculatePay():string {
        return "FullTimeEmployee Pay : " . $this->salary . "\n";
    }

    public function Details():void{
        echo "Details\nName : " . $this->getName() .
        "\nEmployee ID : " . $this->getEmployeeId() . "\n" . 
        $this->calculatePay();
    }

}