package ru.mirea.task27;

public class BonusAdmin {
    Strategy strategy;
    public void post(){
        strategy.post();
    }
    public void bonusM(){
        System.out.println("бонус за месяц");
    }
    public void bonusK(){
        System.out.println("бонус за квартал");
    }
}
