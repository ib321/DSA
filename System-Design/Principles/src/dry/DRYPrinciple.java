package dry;
public class DRYPrinciple {
    public static void main(String[] args) {
        System.out.println("This Code demostrate the Don't Repeat Yourself Principle");
    }
}

// Code without Don't Repeat Yourself Principle
class TaxCalculator {
    public double calculateTaxForFood(double price) {
        double taxRate = 0.05;
        return price * taxRate;
    }

    public double calculateTaxForClothing(double price) {
        double taxRate = 0.10;
        return price * taxRate;
    }

    public double calculateTaxForElectronics(double price) {
        double taxRate = 0.18;
        return price * taxRate;
    }

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        System.out.println("Food tax: " + calculator.calculateTaxForFood(100));
        System.out.println("Clothing tax: " + calculator.calculateTaxForClothing(100));
        System.out.println("Electronics tax: " + calculator.calculateTaxForElectronics(100));
    }
}

// Code using Don't Repeat Yourself Principle
class TaxCalculators {
    public double calculateTax(double price, double taxRate) {
        return price * taxRate;
    }

    public static void main(String[] args) {
        TaxCalculators calculator = new TaxCalculators();
        System.out.println("Food tax: " + calculator.calculateTax(100, 0.05));
        System.out.println("Clothing tax: " + calculator.calculateTax(100, 0.10));
        System.out.println("Electronics tax: " + calculator.calculateTax(100, 0.18));
    }
}
