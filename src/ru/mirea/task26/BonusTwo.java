package ru.mirea.task26;

public class BonusTwo extends OptionDecorator {
    public BonusTwo(Operation operation) {
        super(operation, operation.bankAccount(), 5000);
    }
}
