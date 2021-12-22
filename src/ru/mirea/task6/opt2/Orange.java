package ru.mirea.task6.opt2;

public class Orange implements Priceable{
    private double price;

    public Orange(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
