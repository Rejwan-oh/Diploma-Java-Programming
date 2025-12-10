//super class & sub-class

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

public class unit8_03{
    public static void main(String[] args) {
        Car c = new Car();

        c.start();
        c.drive();
    }
}
