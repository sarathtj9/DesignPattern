package Structural.Adapter;

import Structural.Adapter.thirdparty.YesBank;

public class YBAdapter implements BankApiAdapter{

    YesBank yesBank = new YesBank();

    @Override
    public void sendMoney(String from, String to, double amount) {
        yesBank.transferMoney(from, to, amount);
    }

    @Override
    public void register(String phoneNumber) {
        yesBank.registerAcc(phoneNumber);
    }

    @Override
    public double checkBalance(String accNumber) {
        return yesBank.getBalance(accNumber);
    }

}
