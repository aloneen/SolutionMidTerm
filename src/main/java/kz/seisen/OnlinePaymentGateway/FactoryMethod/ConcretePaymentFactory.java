package kz.seisen.OnlinePaymentGateway.FactoryMethod;

import kz.seisen.OnlinePaymentGateway.PaymentMethods.CreditCardPayment;
import kz.seisen.OnlinePaymentGateway.PaymentMethods.CryptoPayment;
import kz.seisen.OnlinePaymentGateway.PaymentMethods.PayPalPayment;
import kz.seisen.OnlinePaymentGateway.PaymentMethods.PaymentMethod;

public class ConcretePaymentFactory extends PaymentFactory {
    public PaymentMethod createPaymentMethod(String method, String identifier, double balance) {
        switch (method.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(identifier, "12/25", "123", balance); // Simulated card details
            case "paypal":
                return new PayPalPayment(identifier, balance);
            case "crypto":
                return new CryptoPayment(identifier, balance);
            default:
                throw new IllegalArgumentException("Unknown payment method: " + method);
        }
    }
}
