package Structural.Adapter;

public interface BankApiAdapter {

    void sendMoney(String from, String to, double amount);

    void register(String phoneNumber);

    double checkBalance(String accountNumber);
}
