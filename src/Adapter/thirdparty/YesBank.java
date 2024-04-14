package Adapter.thirdparty;

public class YesBank {

    public void transferMoney(String from,String to, double amount){
        System.out.println("Yes Bank transfering");
    }

    public double getBalance(String accountNumber){
        System.out.println("Yes Bank get balance");
        return 100.0;
    }

    public void registerAcc(String phone){
        System.out.println("Yes Bank Registered");
    }
}
