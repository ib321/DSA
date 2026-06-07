package principles.yagni;

public class YAGNIPrinciple {
    public static void main(String[] args) {
        System.out.println("This Code demostrate the You Aren't Gonna Need It Principle");

        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("credit_card", 100.0);
        processor.processPayment("paypal", 200.0);
        processor.processPayment("bitcoin", 300.0);
    }
}

// Over Enginnered Code: Without You Aren't Gonna Need It Principle
class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("credit_card")) {
            // ... complex credit card handling
        } else if (paymentMethod.equals("paypal")) {
            // ... PayPal integration
        } else if (paymentMethod.equals("bitcoin")) {
            // ... Bitcoin payment handling
        }
    }
}

// YAGNI aligned code
class PaymentProcessor2 {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("credit_card")) {
            // ... complex credit card handling
        }
    }
}