
# Product
class Car:
    def __init__(self):
        self.engine = None
        self.wheels = None
        self.color = None
        self.airbags = None

    def __str__(self):
        return f"Car(engine={self.engine}, wheels={self.wheels}, color={self.color}, airbags={self.airbags})"

# Builder
class CarBuilder:
    def __init__(self):
        self.car = Car()

    def set_engine(self, engine):
        self.car.engine = engine
        return self

    def set_wheels(self, wheels):
        self.car.wheels = wheels
        return self

    def set_color(self, color):
        self.car.color = color
        return self

    def set_airbags(self, airbags):
        self.car.airbags = airbags
        return self

    def build(self):
        return self.car

# Director (Optional)
class Director:
    @staticmethod
    def construct_sports_car():
        return CarBuilder().set_engine("V8").set_wheels(4).set_color("Red").set_airbags(True).build()

# Client code
# Using Director
sports_car = Director.construct_sports_car()
print(sports_car)

# Without Director
custom_car = CarBuilder().set_engine("V6").set_wheels(4).set_color("Blue").build()
print(custom_car)


