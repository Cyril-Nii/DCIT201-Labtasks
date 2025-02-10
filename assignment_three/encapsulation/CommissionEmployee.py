class CommisisonEmployee:
    
    def __init__(self, first_name, last_name, social_security_number, gross_sales, commission_rate):
        self.first_name = first_name
        self.last_name = last_name
        self.social_security_number = social_security_number
        self.gross_sales = gross_sales
        self.commission_rate = commission_rate
        
    # Getters and Setters
    def get_first_name(self):
        return self.first_name
    
    def set_first_name(self, first_name):
        self.first_name = first_name
        
    def get_last_name(self):
        return self.last_name
    
    def set_last_name(self, last_name):
        self.last_name = last_name
        
    def get_social_security_number(self):
        return self.social_security_number
    
    def set_social_security_number(self, social_security_number):
        self.social_security_number = social_security_number
        
    def get_gross_sales(self):
        return self.gross_sales
    
    def set_gross_sales(self, gross_sales):
        self.gross_sales = gross_sales
        
    def get_commission_rate(self):
        return self.commission_rate
    
    def set_commission_rate(self, commission_rate):
        self.commission_rate = commission_rate
    
    
    def earnings(self):
        return self.gross_sales * self.commission_rate
    
    
employee = CommisisonEmployee("Cyril", "Tagoe", "234586", 5000, 0.5)

employee.set_gross_sales(3000)
employee.set_commission_rate(0.6)
print(employee.get_gross_sales())
print(employee.get_commission_rate())
print("Employee earning :",employee.earnings())
    
    
    