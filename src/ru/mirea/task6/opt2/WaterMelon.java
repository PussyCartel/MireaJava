package ru.mirea.task6.opt2;

public class WaterMelon implements Priceable{
    private double price;

    public WaterMelon(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "WaterMelon";
    }
}
