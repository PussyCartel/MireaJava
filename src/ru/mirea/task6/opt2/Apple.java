package ru.mirea.task6.opt2;

public class Apple implements Priceable{
    private double price;

    public Apple(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
