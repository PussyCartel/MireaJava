package ru.mirea.task26;

public class BonusOne extends OptionDecorator {
    public BonusOne(Operation operation) {
        super(operation, operation.bankAccount(), 1500);
    }
}
