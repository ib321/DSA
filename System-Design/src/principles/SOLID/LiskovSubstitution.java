package principles.SOLID;

public class LiskovSubstitution {
    public static void main(String[] args) {
        Bird2 sparrow2 = new Sparrow2();
        Bird2 ostrich2 = new Ostrich2();
        // This works fine
        sparrow2.fly();
        // This will throw an exception, violating LSP
        ostrich2.fly();

        Flyable sparrow = new Sparrow();
        sparrow.fly();
        // Ostrich does not implement Flyable, so it cannot be used where Flyable is expected
    }
}

// Base class
class Bird2 {
    public void fly() {
        System.out.println("Flying...");
    }
}

// Subclass that adheres to LSP
class Sparrow2 extends Bird2 {
    @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

// Subclass that violates LSP
class Ostrich2 extends Bird2 {
    @Override
    public void fly() {
        // Ostriches can't fly, so to follow LSP: either don't override this method or rethink design
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}

// Code following the Liskov Substitution Principle ------------
// Interface for flying birds
interface Flyable {
    void fly();
}

// Base class
class Bird {
    // Common bird properties and methods
    String name;
}

// Subclass that adheres to LSP
class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

// Subclass that adheres to LSP
class Ostrich extends Bird {
    // Ostrich-specific properties and methods
}
