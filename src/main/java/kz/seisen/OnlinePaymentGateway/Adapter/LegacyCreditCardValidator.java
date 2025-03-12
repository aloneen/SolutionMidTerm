package kz.seisen.OnlinePaymentGateway.Adapter;


public class LegacyCreditCardValidator {

    public boolean validateCard(String cardNumber, String expiryDate, String cvv) {
        System.out.printf("Validating card: %s, Expiry: %s, CVV: %s%n", cardNumber, expiryDate, cvv);
        return true;
    }
}