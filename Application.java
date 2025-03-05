// Car.java - Simple Java Program with OOP

class Car {
    // Attributes
    private String brand;
    private int speed;

    // Constructor
    public Car(String brand) {
        this.brand = brand;
        this.speed = 0; // Default speed
    }

    // Method to accelerate the car
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " is now going at " + speed + " km/h");
    }

    // Method to brake
    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) speed = 0;
        System.out.println(brand + " slowed down to " + speed + " km/h");
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Current Speed: " + speed + " km/h");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.displayInfo();
        myCar.accelerate(50);
        myCar.brake(20);
    }
}
