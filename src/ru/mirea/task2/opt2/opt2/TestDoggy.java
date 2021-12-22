package ru.mirea.task2.opt2.opt2;

public class TestDoggy {
    public static void main(String[] args) {
        System.out.println("Собачки");
        Doggy doggy1 = new Doggy("Д'артаньян", "французский дог", 5, 10.5);
        Doggy doggy2 = new Doggy("Ричард", "английский дог", 2, 8.5);
        Doggy doggy3 = new Doggy("Виктор", "мопс", 20, 8.0);
        System.out.println(doggy1.output());
        System.out.println(doggy2.output());
        System.out.println(doggy3.output());
    }
}
