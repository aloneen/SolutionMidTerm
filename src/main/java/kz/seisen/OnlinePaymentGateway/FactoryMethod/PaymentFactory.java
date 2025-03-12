package kz.seisen.OnlinePaymentGateway.FactoryMethod;

import kz.seisen.OnlinePaymentGateway.PaymentMethods.PaymentMethod;

public abstract class PaymentFactory {
    public abstract PaymentMethod createPaymentMethod(String method, String identifier, double balance);
}
