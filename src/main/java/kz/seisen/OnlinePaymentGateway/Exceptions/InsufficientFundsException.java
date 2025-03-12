package kz.seisen.OnlinePaymentGateway.Exceptions;


// Exception for case we don't have enough money
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
