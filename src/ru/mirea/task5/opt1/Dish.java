package ru.mirea.task5.opt1;

abstract class Dish {

    private String type;
    private int metal_ornament;
    private int heigth;

    Dish(String type, int metal_ornament, int heigth) {
        this.type = type;
        this.metal_ornament = metal_ornament;
        this.heigth = heigth;
    }

    public String getType() {
        return type;
    }

    public int getMetal_ornament() {
        return metal_ornament;
    }

    public int getHeigth() {
        return heigth;
    }
}
