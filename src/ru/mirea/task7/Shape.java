package ru.mirea.task7;

public abstract class Shape {
    protected String color;
    boolean filled;

    public Shape(){}

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return true;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{}";
    }
}
