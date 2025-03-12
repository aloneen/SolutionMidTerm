package kz.seisen.OnlinePaymentGateway.PaymentMethods;

import kz.seisen.OnlinePaymentGateway.Exceptions.InsufficientFundsException;
import kz.seisen.OnlinePaymentGateway.Exceptions.InvalidPaymentDetailsException;

public class CryptoPayment implements PaymentMethod {
    private String walletAddress;
    private double balance;

    public CryptoPayment(String walletAddress, double balance) {
        this.walletAddress = walletAddress;
        this.balance = balance;
    }

    public CryptoPayment () {}
    @Override
    public String processPayment(double amount) throws InvalidPaymentDetailsException, InsufficientFundsException {
        if (!isValidWalletAddress()) {
            throw new InvalidPaymentDetailsException("Invalid cryptocurrency wallet address");
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds in cryptocurrency wallet");
        }
        balance -= amount;
        return String.format("Processing cryptocurrency payment of $%.2f", amount);
    }



    private boolean isValidWalletAddress() {
        return walletAddress != null && walletAddress.startsWith("0x") && walletAddress.length() == 42;
    }
}