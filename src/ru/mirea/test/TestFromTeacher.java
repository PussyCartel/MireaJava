package ru.mirea.test;

import java.util.Scanner;

public class TestFromTeacher {

    public static void main(String[] args) {
	    Cardstest cardstest = new Cardstest();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int a = scanner.nextInt();
            cardstest.inputPlayerCard(1, a);
        }
        for (int i = 0; i < 5; i++){
            int a = scanner.nextInt();
            cardstest.inputPlayerCard(2, a);
        }
        //cardstest.output();
        System.out.println(cardstest.playGame());
    }
}