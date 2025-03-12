package kz.seisen.OnlinePaymentGateway;
import kz.seisen.OnlinePaymentGateway.FactoryMethod.ConcretePaymentFactory;
import kz.seisen.OnlinePaymentGateway.FactoryMethod.PaymentFactory;
import kz.seisen.OnlinePaymentGateway.PaymentMethods.PaymentMethod;
import kz.seisen.OnlinePaymentGateway.Exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentGatewayConsole {
    static PaymentFactory factory = new ConcretePaymentFactory();
    private static List<String> transactionHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display main menu
            System.out.println("\n=== Online Payment Gateway ===");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Crypto");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    processCreditCardPayment(scanner);
                    break;
                case 2:
                    processPayPalPayment(scanner);
                    break;
                case 3:
                    processCryptoPayment(scanner);
                    break;
                case 4:
                    viewTransactionHistory();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void processCreditCardPayment(Scanner scanner) {
        System.out.println("\n=== Credit Card Payment ===");
        System.out.print("Enter card number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        try {
            PaymentMethod paymentMethod = factory.createPaymentMethod("creditcard", cardNumber, 1000.0); // Simulated balance
            Transaction transaction = new Transaction(paymentMethod, amount);
            String result = transaction.process();
            transactionHistory.add(result);
            System.out.println("Payment Result: " + result);
        } catch (InvalidPaymentDetailsException | InsufficientFundsException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }

    private static void processPayPalPayment(Scanner scanner) {
        System.out.println("\n=== PayPal Payment ===");
        System.out.print("Enter PayPal email: ");
        String email = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        try {
            PaymentMethod paymentMethod = factory.createPaymentMethod("paypal", email, 500.0); // Simulated balance
            Transaction transaction = new Transaction(paymentMethod, amount);
            String result = transaction.process();
            transactionHistory.add(result);
            System.out.println("Payment Result: " + result);
        } catch (InvalidPaymentDetailsException | InsufficientFundsException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }

    private static void processCryptoPayment(Scanner scanner) {
        System.out.println("\n=== Crypto Payment ===");
        System.out.print("Enter wallet address: ");
        String walletAddress = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        try {
            PaymentMethod paymentMethod = factory.createPaymentMethod("crypto", walletAddress, 2000.0); // Simulated balance
            Transaction transaction = new Transaction(paymentMethod, amount);
            String result = transaction.process();
            transactionHistory.add(result);
            System.out.println("Payment Result: " + result);
        } catch (InvalidPaymentDetailsException | InsufficientFundsException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }

    private static void viewTransactionHistory() {
        System.out.println("\n=== Transaction History ===");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String entry : transactionHistory) {
                System.out.println(entry);
            }
        }
    }
}
