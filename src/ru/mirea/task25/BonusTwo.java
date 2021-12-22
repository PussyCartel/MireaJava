package ru.mirea.task25;

public class BonusTwo extends OptionDecorator{
    public BonusTwo(Operation operation) {
        super(operation, operation.bankAccount(), 5000);
    }
}
