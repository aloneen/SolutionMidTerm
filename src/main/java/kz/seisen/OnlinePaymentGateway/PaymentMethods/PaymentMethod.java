package kz.seisen.OnlinePaymentGateway.PaymentMethods;




public interface PaymentMethod {
    String processPayment(double amount);
}