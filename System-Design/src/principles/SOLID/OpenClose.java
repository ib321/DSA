package principles.SOLID;

public class OpenClose {
    public static void main(String[] args) {
        System.out.println("This class demostrate the Open-Close Principle");
    }
}

// Code Without Open Closed Principle
class Rectangle2 {
    private double width;
    private double height;

    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

class AreaCalculator2 {
    public double calculateRectangleArea(Rectangle2 rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}

// Code Using Open Closed Principle
// Shape interface
interface Shape {
    double calculateArea();
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// AreaCalculator class
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
