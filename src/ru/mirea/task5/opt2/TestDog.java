package ru.mirea.task5.opt2;

import ru.mirea.task2.opt2.opt2.Doggy;

public class TestDog {
    public static void main(String[] args) {
        System.out.println("Собачки");
        Pug pug = new Pug("Вася", 5, 25.0);
        GreateDane greateDane = new GreateDane("Женя", 6, 13.0);
        Poodle poodle = new Poodle("Артемон", 5, 10.6);
        pug.getInf();
        greateDane.getInf();
        poodle.getInf();
    }
}
