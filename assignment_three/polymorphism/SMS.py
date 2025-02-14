# Staff Management System

from abc import ABC, abstractmethod

class StaffMember(ABC):
    
    __name:str
    __id:str
    
    def __init__(self, name:str, id:str):
        self.__name = name
        self.__id = id
        
    def get_name(self):
        return self.__name
    
    def set_name(self, name:str):
        self.__name = name
    
    def get_id(self):
        return self.__id
    
    def set_id(self, id:str):
        self.__id = id
    
    @abstractmethod
    def get_Annual_Salary(self):
        pass
    
    def toString(self):
        return f"Name: {self.__name}, ID: {self.__id}"
    
    
class Staff(StaffMember):
        
    StaffMembers = []
    
    def __init__(self, name:str, id:str):
        super().__init__(name, id)
        
        
        
    # Adds a staff member to the list
    def add_Staff(self):
        self.StaffMembers.append(self)
        
        
    def get_Annual_Salary(self, monthly_salary: int):
        return monthly_salary * 12
    
    def display_Staff(self):
        print(self.toString())
        
    

staff1 = Staff("Cyril Nii Teiko Tagoe", "22241994")
staff1.display_Staff()
print(staff1.get_Annual_Salary(5000))

    
    
    
    
        
        
    