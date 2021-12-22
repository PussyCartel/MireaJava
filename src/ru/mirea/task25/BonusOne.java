package ru.mirea.task25;

public class BonusOne extends OptionDecorator{
    public BonusOne(Operation operation) {
        super(operation, operation.bankAccount(), 1500);
    }
}
