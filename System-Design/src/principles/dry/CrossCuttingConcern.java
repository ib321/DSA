package principles.dry;

import java.util.function.Consumer;

// Functional interface for logging
@FunctionalInterface
interface Logger {
    void log(String message);
}

// Class with methods that need logging
class Service {
    public void performTask() {
        System.out.println("Performing task...");
    }

    public void executeAction() {
        System.out.println("Executing action...");
    }
}

// Decorator method for logging
public class CrossCuttingConcern {
    public static void main(String[] args) {
        Service service = new Service();
        Logger logger = message -> System.out.println("LOG: " + message);

        // Decorator for logging method calls
        Consumer<Runnable> logDecorator = (Runnable method) -> {
            logger.log("Method " + method + " is called");
            method.run();
        };

        // Applying the decorator to methods
        logDecorator.accept(service::performTask);
        logDecorator.accept(service::executeAction);
    }
}
