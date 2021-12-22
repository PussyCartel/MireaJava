package ru.mirea.task27;

public class Printers {

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}
