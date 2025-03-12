package kz.seisen.OnlinePaymentGateway.Exceptions;

public class InvalidPaymentDetailsException extends RuntimeException {
    public InvalidPaymentDetailsException(String message) {
        super(message);
    }
}
