package ru.mirea.task26;

public class PostClerk implements Strategy{
    @Override
    public void post(){
        System.out.println("Это клерк");
    }
}
