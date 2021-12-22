package ru.mirea.task27;

import ru.mirea.task26.Strategy;

public class PostClerk implements Strategy {
    @Override
    public void post(){
        System.out.println("Это клерк");
    }
}
