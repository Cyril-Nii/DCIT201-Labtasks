# Vehicle Rental Management System

# Parent Vehicle class
class Vehicle:
    
    def __init__(self, vehicle_id:str, brand:str, model:str, is_available:bool = True):
        self.__vehicle_id = vehicle_id
        self.__brand = brand
        self.__model = model
        self.__is_available = is_available
        
    def get_vehicle_id(self):
        return self.__vehicle_id
    
    def set_vehicle_id(self, vehicle_id:str):
        self.__vehicle_id = vehicle_id
        
    def get_brand(self):
        return self.__brand 
    
    def set_brand(self, brand:str):
        self.__brand = brand
        
    def get_model(self):
        return self.__model

    def set_model(self, model:str):
        self.__model = model
        
    def get_is_availbale(self):
        return self.__is_available
    
    def set_is_available(self, is_available:bool):
        self.__is_available = is_available
    
      
    def rent_vehicle(self):
        if self.__is_available:
            self.__is_available = False
            print("Vehicle rented successfully")
        else:
            print("Vehicle is not available")
            
    
    def return_vehicle(self):
        self.__is_available = True
        print("Vehicle returned successfully")
         