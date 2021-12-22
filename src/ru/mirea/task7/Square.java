package ru.mirea.task7;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
    }
    public void setSide(double side){
        this.width = side;
    }
    public double getSide(){
        return this.width;
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
