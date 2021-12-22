package ru.mirea.task6.opt2;

import ru.mirea.task6.opt1.*;

public class TestPrice {
    public static void main(String[] args){
        System.out.println("Price");
        Priceable s[] = {new Apple(5.0), new Grape(10.0), new Orange(20.0), new WaterMelon(10.5)};
        for (int i = 0; i < 4; i++){
            System.out.println(s[i].toString() + " " + s[i].getPrice());
        }
    }
}
