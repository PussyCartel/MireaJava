package ru.mirea.task2.opt2;

import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ball ball = new Ball();
        System.out.println("Введите вид мяча");
        ball.setType(sc.nextLine());
        System.out.println("Введите радиус мяча");
        ball.setRadius(sc.nextDouble());
        System.out.println("Введите массу мяча");
        ball.setMass(sc.nextDouble());
        System.out.println("Вид мяча: " + ball.getTypeBall() + ", радиус мяча: " + ball.getRadius() + ", масса мяча: " + ball.getMass());
    }
}
