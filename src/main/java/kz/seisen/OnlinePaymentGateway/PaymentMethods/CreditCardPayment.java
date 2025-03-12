package kz.seisen.OnlinePaymentGateway.PaymentMethods;

import kz.seisen.OnlinePaymentGateway.Exceptions.InsufficientFundsException;
import kz.seisen.OnlinePaymentGateway.Exceptions.InvalidPaymentDetailsException;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private double balance;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = balance;
    }
    public CreditCardPayment() {}

    @Override
    public String processPayment(double amount) throws InvalidPaymentDetailsException, InsufficientFundsException {
        if (!isValidCardDetails()) {
            throw new InvalidPaymentDetailsException("Invalid card details");
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds on credit card");
        }
        balance -= amount;
        return String.format("Processing credit card payment of $%.2f", amount);
    }

    private boolean isValidCardDetails() {
        return cardNumber != null && !cardNumber.isEmpty() &&
                expiryDate != null && !expiryDate.isEmpty() &&
                cvv != null && !cvv.isEmpty();
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}