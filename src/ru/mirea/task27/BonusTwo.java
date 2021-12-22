package ru.mirea.task27;

import ru.mirea.task26.Operation;
import ru.mirea.task26.OptionDecorator;

public class BonusTwo extends OptionDecorator {
    public BonusTwo(Operation operation) {
        super(operation, operation.bankAccount(), 5000);
    }
}
