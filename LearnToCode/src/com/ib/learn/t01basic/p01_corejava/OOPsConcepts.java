package com.ib.learn.t01basic.p01_corejava;

/**
 * - Classes in Java
 * - Objects in Java
 * - Constructors and Types
 * - This Reference
 * - Access Specifiers
 * - Static and Final
 */
public class OOPsConcepts {

    // Static variable
    static int staticCounter = 0;

    // Final variable
    final int finalValue;

    // Instance variables
    private String name;
    private int age;

    // Default constructor
    public OOPsConcepts() {
        this("Unknown", 0);
    }

    // Parameterized constructor
    public OOPsConcepts(String name, int age) {
        this.name = name;
        this.age = age;
        this.finalValue = 100; // Final variable must be initialized
        staticCounter++;
    }

    // This reference
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Access specifiers
    public String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    // Static method
    public static int getStaticCounter() {
        return staticCounter;
    }

    // Final method
    public final void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects
        OOPsConcepts obj1 = new OOPsConcepts();
        OOPsConcepts obj2 = new OOPsConcepts("Alice", 30);

        // Using this reference
        obj1.setName("Bob");
        obj1.setAge(25);

        // Accessing instance methods and variables
        System.out.println("Object 1: " + obj1.getName() + ", " + obj1.getAge());
        System.out.println("Object 2: " + obj2.getName() + ", " + obj2.getAge());

        // Accessing static method
        System.out.println("Static Counter: " + OOPsConcepts.getStaticCounter());

        // Displaying information using final method
        obj1.displayInfo();
        obj2.displayInfo();

        //------------------------------------------

    }
}


class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    void area() {
        System.out.println("Calculating area of circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

class Polymorphism {
    public static void main(String[] args) {

        Shape[] shapes = { new Shape(), new Circle(), new Square() };
        for (Shape s : shapes) {
            s.draw();  // Which draw() runs depends on the actual object
        }

        Shape s1 = new Shape();
        Shape s2 = new Circle();
        Circle c1 = new Circle();

        s1.draw();   // ✅ "Drawing a shape"
        s2.draw();   // ✅ "Drawing a circle" (runtime decides)
        c1.draw();   // ✅ "Drawing a circle"

        // c1 can call area() because reference type is Circle
        c1.area();   // ✅ "Calculating area of circle"

        // s2 is a Shape reference, even though object is Circle
        // Compiler only sees Shape type, which has no area() method
        // s2.area(); ❌ Compile-time ERROR
    }
}