from abc import ABC, abstractmethod

# Abstract class Robber
class Robber(ABC):

    # Abstract method
    @abstractmethod
    def RobbingClass(self):
        pass

    # Default method
    def MachineLearning(self):
        print("I love MachineLearning.")

# Class JAVAProfessionalRobber inheriting from Robber
class JAVAProfessionalRobber(Robber):

    # Implementing the abstract method from the base class
    def RobbingClass(self):
        print("MScAI&ML")

    # Implementing additional abstract methods
    def RowHouses(self):
        print("Robbing row houses")

    def RoundHouses(self):
        print("Robbing round houses")

    def SquareHouse(self):
        print("Robbing square houses")

    def RectangleHouse(self):
        print("Robbing rectangle houses")

# Example usage
if __name__ == "__main__":
    # Create an instance of the derived class
    java_professional = JAVAProfessionalRobber()

    # Call the implemented and inherited methods
    java_professional.RobbingClass()
    java_professional.RowHouses()
    java_professional.RoundHouses()
    java_professional.SquareHouse()
    java_professional.RectangleHouse()

    # Call the default method from the abstract class
    java_professional.MachineLearning()
