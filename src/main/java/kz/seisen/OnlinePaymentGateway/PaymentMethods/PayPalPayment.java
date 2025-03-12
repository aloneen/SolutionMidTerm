package kz.seisen.OnlinePaymentGateway.PaymentMethods;


import kz.seisen.OnlinePaymentGateway.Exceptions.InsufficientFundsException;
import kz.seisen.OnlinePaymentGateway.Exceptions.InvalidPaymentDetailsException;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private double balance;

    public PayPalPayment(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }

    public PayPalPayment() {}

    @Override
    public String processPayment(double amount) throws InvalidPaymentDetailsException, InsufficientFundsException {
        if (!isValidEmail()) {
            throw new InvalidPaymentDetailsException("Invalid PayPal email");
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds in PayPal account");
        }
        balance -= amount;
        return String.format("Processing PayPal payment of $%.2f", amount);
    }

    private boolean isValidEmail() {
        return email != null && email.contains("@");
    }
}