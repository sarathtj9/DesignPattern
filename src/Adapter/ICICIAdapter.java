package Adapter;

import Adapter.thirdparty.ICICIBank;

public class ICICIAdapter implements BankApiAdapter {

    ICICIBank iciciBank = new ICICIBank();
    @Override
    public void sendMoney(String from, String to, double amount) {
        iciciBank.sendMoney(amount, from, to);
    }

    @Override
    public void register(String phoneNumber) {
        iciciBank.registerAcc(phoneNumber);
    }

    @Override
    public double checkBalance(String accNumber) {
        return iciciBank.getBalance(accNumber);
    }
}
