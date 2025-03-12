package kz.seisen.OnlinePaymentGateway;
import kz.seisen.OnlinePaymentGateway.Adapter.CreditCardPaymentAdapter;
import kz.seisen.OnlinePaymentGateway.FactoryMethod.*;
import kz.seisen.OnlinePaymentGateway.PaymentMethods.PaymentMethod;


public class PaymentGatewayDemo {
    public static void main(String[] args) {

        PaymentFactory factory = new ConcretePaymentFactory();


        try {
            // Factory Method Example
            PaymentMethod creditCard = factory.createPaymentMethod("creditcard", "1234-5678-9012-3456", 500.0);
            Transaction transaction1 = new Transaction(creditCard, 100.0);
            System.out.println(transaction1.process());
            System.out.println("Transaction Status: " + transaction1.getStatus());


            // Adapter Example
            PaymentMethod adapter = new CreditCardPaymentAdapter("1234-5678-9012-3456", "12/25", "123", 500.0);
            Transaction transaction2 = new Transaction(adapter, 200.0);
            System.out.println(transaction2.process());
            System.out.println("Transaction Status: " + transaction2.getStatus());



            // CryptoPayment Example
            PaymentMethod crypto = factory.createPaymentMethod("crypto", "0x1234567890123456789012345678901234567890", 1000.0);
            Transaction transaction3 = new Transaction(crypto, 300.0);
            System.out.println(transaction3.process());
            System.out.println("Transaction Status: " + transaction3.getStatus());


            // PalpalPayment Example
            PaymentMethod palpal = factory.createPaymentMethod("paypal", "dias@", 600);
            Transaction transaction4 = new Transaction(palpal, 200.0);
            System.out.println(transaction4.process());
            System.out.println("Transaction Status: " + transaction4.getStatus());


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}