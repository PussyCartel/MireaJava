package ru.mirea.task6.opt2;

public class Grape implements Priceable{
    private double price;

    public Grape(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Grape";
    }
}
