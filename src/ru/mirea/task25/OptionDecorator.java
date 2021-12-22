package ru.mirea.task25;

public class OptionDecorator implements Operation{
    private Operation operation;
    private long bankAcc;
    private double money;

    public OptionDecorator(Operation operation, long bankAcc, double money) {
        this.operation = operation;
        this.bankAcc = bankAcc;
        this.money = money;
    }

    public long bankAccount() {
        return this.bankAcc;
    }

    public double sendMoney() {
        return this.money + operation.sendMoney();
    }
}
