package kz.seisen.OnlinePaymentGateway.Adapter;

import kz.seisen.OnlinePaymentGateway.Adapter.LegacyCreditCardValidator;
import kz.seisen.OnlinePaymentGateway.Exceptions.InsufficientFundsException;
import kz.seisen.OnlinePaymentGateway.Exceptions.InvalidPaymentDetailsException;
import kz.seisen.OnlinePaymentGateway.PaymentMethods.PaymentMethod;



// Example of Adapter
public class CreditCardPaymentAdapter implements PaymentMethod {
    private LegacyCreditCardValidator validator;
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private double balance;

    public CreditCardPaymentAdapter(String cardNumber, String expiryDate, String cvv, double balance) {
        this.validator = new LegacyCreditCardValidator();
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = balance;
    }

    public CreditCardPaymentAdapter() {
    }



    @Override
    public String processPayment(double amount) throws InvalidPaymentDetailsException, InsufficientFundsException {
        if (!validator.validateCard(cardNumber, expiryDate, cvv)) {
            throw new InvalidPaymentDetailsException("Invalid card details");
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds on credit card");
        }
        balance -= amount;
        return String.format("Processing credit card payment of $%.2f using adapter", amount);
    }
}