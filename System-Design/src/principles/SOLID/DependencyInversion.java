package principles.SOLID;

public class DependencyInversion {
    public static void main(String[] args) {
        System.out.println("This Code demostrate the Dependency Inversion Principle");
        EmailService2 emailService = new EmailService2();
        emailService.sendEmail("example@example.com", "Hello", "This is a test email.");
    }
}

// ---------- Without Dependency Inversion Principle ----------
// Low-level module
class GmailClient2 {
    public void sendEmail(String to, String subject, String body) {
        // Logic to send email using Gmail API
        System.out.println("Sending email to " + to + " via Gmail: " + subject);
    }
}

// High-level module
class EmailService2 {
    private GmailClient2 gmailClient;

    public EmailService2() {
        this.gmailClient = new GmailClient2();
    }

    public void sendEmail(String to, String subject, String body) {
        gmailClient.sendEmail(to, subject, body);
    }
}

// ---------- Using Dependency Inversion Principle ----------

// Abstraction for email clients
interface EmailClient {
    void sendEmail(String to, String subject, String body);
}

// Low-level module: GmailClient
class GmailClient implements EmailClient {
    @Override
    public void sendEmail(String to, String subject, String body) {
        // Logic to send email using Gmail API
        System.out.println("Sending email to " + to + " via Gmail: " + subject);
    }
}

// Low-level module: OutlookClient
class OutlookClient implements EmailClient {
    @Override
    public void sendEmail(String to, String subject, String body) {
        // Logic to send email using Outlook API
        System.out.println("Sending email to " + to + " via Outlook: " + subject);
    }
}

// High-level module: EmailService
class EmailService {
    private EmailClient emailClient;

    // Constructor injection
    public EmailService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }
    public void sendEmail(String to, String subject, String body) {
        emailClient.sendEmail(to, subject, body);
    }
}

class DependencyInversion2 {
    public static void main(String[] args) {
        // Using GmailClient
        EmailClient gmailClient = new GmailClient();
        EmailService emailServiceGmail = new EmailService(gmailClient);
        emailServiceGmail.sendEmail("example@example.com", "Hello", "email via Gmail.");

        // Using OutlookClient
        EmailClient outlookClient = new OutlookClient();
        EmailService emailServiceOutlook = new EmailService(outlookClient);
        emailServiceOutlook.sendEmail("example@example.com", "Hello", "email via Outlook.");
    }
}

