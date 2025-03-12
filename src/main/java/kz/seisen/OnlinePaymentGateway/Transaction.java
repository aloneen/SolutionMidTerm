package kz.seisen.OnlinePaymentGateway;

import kz.seisen.OnlinePaymentGateway.PaymentMethods.PaymentMethod;



public class Transaction {
    private PaymentMethod paymentMethod;
    private double amount;
    private String status;

    public Transaction(PaymentMethod paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = "pending";
    }



    public String process() {
        try {
            String result = paymentMethod.processPayment(amount);
            this.status = "completed";
            return result;
        } catch (Exception e) {
            this.status = "failed";
            return "Payment failed: " + e.getMessage();
        }
    }

    public String getStatus() {
        return status;
    }
}