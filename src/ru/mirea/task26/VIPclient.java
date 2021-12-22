package ru.mirea.task26;

public class VIPclient implements Operation {
    private long bankAccount;
    private double money;

    public VIPclient(long bankAccount, int money) {
        this.bankAccount = bankAccount;
        this.money = money;
    }

    @Override
    public long bankAccount(){
        return this.bankAccount;
    }

    @Override
    public double sendMoney() {
        return this.money+0.15*this.money;
    }
}
