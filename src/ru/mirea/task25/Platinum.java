package ru.mirea.task25;

public class Platinum implements Operation{
    private long bankAccount;
    private double money;

    public Platinum(long bankAccount, int money) {
        this.bankAccount = bankAccount;
        this.money = money;
    }

    @Override
    public long bankAccount(){
        return this.bankAccount;
    }

    @Override
    public double sendMoney() {
        return this.money+0.2*this.money;
    }
}
