public class SingleResponsibility {
    public static void main(String[] args) {
        System.out.println("This Code demostrate the Single Responsibility Principle");
    }
}

// Code without Single Responsibility Principle
class UserManager {
    public boolean authUser(String username, String password) {
        // Authentication logic here
        return false;
    }

    public void updateUserProfile(String username, String newProfileData) {
        // Update user profile logic here
    }

    public void sendEmailNotification(String email, String message) {
        // Email sending logic here
    }
}

// Code using Single Responsibility Principle
class UserAuthenticator {
    public boolean authUser(String username, String password) {
        // Authentication logic here
        return false;
    }
}

class UserProfileManager {
    public void updateUserProfile(String username, String newProfileData) {
        // Update user profile logic here
    }
}

class EmailNotifier {
    public void sendEmailNotification(String email, String message) {
        // Email sending logic here
    }
}
