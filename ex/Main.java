import java.lang.reflect.Field;
import java.util.Scanner;

class EmailMessage {
    public String receiver, message;
    public EmailMessage(String receiver, String message) {
        this.receiver = receiver;
        this.message = message;
    }
}

class SMSMessage {
    public String receiver, message;
    public SMSMessage(String receiver, String message) {
        this.receiver = receiver;
        this.message = message;
    }
}

class MessageProcessor<X> {
    private X message;
    public MessageProcessor(X a1) {
        message = a1;
    }

    public void printResult() {
        try {
            Field receiverField = message.getClass().getDeclaredField("receiver");
            Object receiverValue = receiverField.get(message);
            Field messageField = message.getClass().getDeclaredField("message");
            Object messageValue = messageField.get(message);
            System.out.println("________________________________________");
            System.out.println("Message: " + messageValue + " sent to " + receiverValue + " was submitted for processing at " + new java.util.Date().toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

public class Main {
    public void getSMSDetails() {
        Scanner sc = new Scanner(System.in);
        String contact, message;
        System.out.println("____________________________________________");
        System.out.print("Enter the contact no: ");
        contact = sc.nextLine();
        System.out.print("\nEnter the message: ");
        message = sc.nextLine();
        SMSMessage sObj = new SMSMessage(contact, message);
        MessageProcessor<SMSMessage> message1 = new MessageProcessor<>(sObj);
        message1.printResult();
    }

    public void getEmailDetails() {
        Scanner sc = new Scanner(System.in);
        String email, message;
        System.out.println("____________________________________________");
        System.out.print("Enter the email id: ");
        email = sc.nextLine();
        System.out.print("\nEnter the message: ");
        message = sc.nextLine();
        EmailMessage eObj = new EmailMessage(email, message);
        MessageProcessor<EmailMessage> message2 = new MessageProcessor<>(eObj);
        message2.printResult();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Send SMS");
            System.out.println("2. Send Email");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine(); 
            switch (option) {
                case 1:
                    main.getSMSDetails();
                    break;
                case 2:
                    main.getEmailDetails();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
