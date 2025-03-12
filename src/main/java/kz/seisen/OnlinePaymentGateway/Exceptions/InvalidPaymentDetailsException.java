package kz.seisen.OnlinePaymentGateway.Exceptions;


// Exception for case our payment details are incorrect
public class InvalidPaymentDetailsException extends RuntimeException {
    public InvalidPaymentDetailsException(String message) {
        super(message);
    }
}
