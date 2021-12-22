package ru.mirea.task27;

import ru.mirea.task26.Operation;
import ru.mirea.task26.OptionDecorator;

public class BonusOne extends OptionDecorator {
    public BonusOne(Operation operation) {
        super(operation, operation.bankAccount(), 1500);
    }
}
