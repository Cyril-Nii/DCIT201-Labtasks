from Vehicle import Vehicle

class Car(Vehicle):
    
    def __init__(self, vehicle_id:str, brand:str, model:str, seating_capacity:int, is_available:bool = True):
        super().__init__(vehicle_id, brand, model, is_available)
        self.__seating_capacity = seating_capacity
        
    def get_seating_capacity(self):
        return self.__seating_capacity
    
    def set_seating_capacity(self, seating_capacity:int):
        self.__seating_capacity = seating_capacity
        
    def calculate_rental_cost(self, days:int):
        rental_cost = 1000 * days + self.get_seating_capacity() * 50
        print(f"Rental cost for {days} days: {rental_cost}")
        