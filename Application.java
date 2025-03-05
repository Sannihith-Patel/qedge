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
#feature202 changes by Rahul on October 25th 2024 on payment gateway module
public class NumberCheck {
    // Method to check if a number is even or odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(10); // Output: 10 is Even
        checkEvenOdd(15); // Output: 15 is Odd
    }
}
#end of feature202

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.displayInfo();
        myCar.accelerate(50);
        myCar.brake(20);
    }
}
