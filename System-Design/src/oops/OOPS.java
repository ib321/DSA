package oops;

// Class And Object
class Phone {
    String brand;
    int launchYear;
    String model;

    Phone(String brand, int launchYear, String model) {
        this.brand = brand;
        this.launchYear = launchYear;
        this.model = model;
    }

    void turnOn() {
        System.out.println(brand + " " + model + " (" + launchYear + ") is now ON.");
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Class And Object
        Phone phone2 = new Phone("OnePlus", 2024, "12");
        phone2.turnOn();
        Phone phone3 = new Phone("Apple", 2025, "iPhone 15");
        phone3.turnOn();

        //Encapsulation
        BankAccount account = new BankAccount("123456", 100);
        account.deposit(50);
        account.withdraw(30);
        System.out.println("Account balance: " + account.getBalance() + "Account Number: " + account.getAccountNumber());

        // Inheritance
        Car myCar = new Car("Red", 50); // Create a Car object
        System.out.println("Car color: " + myCar.color); // Access inherited color
        System.out.println("Initial speed: " + myCar.speed + " km/h"); // Access Car-specific speed
        myCar.startEngine();
        myCar.accelerate();

        // Polymorphism
        Document[] documents = {new Pdf(), new Word()};
        for (Document doc : documents) {
            doc.show();
        }

        // Abstraction
        Shape[] shapes = {new Rectangle(5, 3), new Circle(4)};
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}

class BankAccount {
    private double balance;
    private String accountNumber;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}

// Inheritance Example
// Parent class: Vehicle
class Vehicle {
    String color;
    Vehicle(String color) {
        this.color = color;
    }
    // Method to start the engine
    void startEngine() {
        System.out.println("The engine has started.");
    }
}

// Child class: Car
class Car extends Vehicle {
    int speed; // Speed of the car
    Car(String color, int speed) {
        super(color); // Call the constructor of the parent class
        this.speed = speed;
    }

    void accelerate() {
        speed += 10; // Increase speed by 10
        System.out.println("The car accelerates. New speed: " + speed + " km/h");
    }
}

// Polymorphism Example
class Document {
    void show() {
        System.out.println("Showing document");
    }
}

class Pdf extends Document {
    @Override
    void show() {
        System.out.println("Showing PDF document");
    }
}

class Word extends Document {
    @Override
    void show() {
        System.out.println("Showing Word document");
    }
}

// Abstraction Example
interface Shape {
    double area();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
