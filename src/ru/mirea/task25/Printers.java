package ru.mirea.task25;

public class Printers {

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}
