from abc import ABC, abstractmethod
#Payroll system

class Employee:
    
    __name:str
    __employee_id:str
    
    # Constructor
    def __init__(self, name:str, employee_id:str):
        self.__name = name
        self.__employee_id = employee_id
    
    # Getters and Setters
    def get_name(self):
        return self.__name

    def get_employee_id(self):
        return self.__employee_id
 
    @abstractmethod
    def calculate_pay(self):
        pass
    
class FullTimeEmployee(Employee):
    
    __salary:float
    
    def __init__(self, name:str, employee_id:str, salary:float):
        super().__init__(name, employee_id)
        self.__salary = salary
        
    def get_salary(self):
        return self.__salary
    
    def calculate_pay(self):
        print(f"FullTimeEmployee Pay: {self.get_salary()}")


ftemployee = FullTimeEmployee("Joshua Yawson", "22241994", 4000.00)

print(ftemployee.get_name())
print(ftemployee.get_employee_id())
print(ftemployee.get_salary())

    
    
        