package ru.mirea.task23;

public class Printers {

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}
