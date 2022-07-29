from account import Account
from car import Car

if __name__=="__main__":
    print("Hola mundo")

    car = Car("AMS543345", Account("Juanito", "COND1"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("VneVNEo89", Account("Pedrito", "COND2"))
    print(vars(car2))
    print(vars(car2.driver))
