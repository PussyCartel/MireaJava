package ru.mirea.task5.opt1;

public class PorcelainDish extends Dish{

    public PorcelainDish(String type, int metal_ornament, int heigth) {
        super(type, metal_ornament, heigth);
    }

    public void outputInfo(){
        System.out.print("Тип посуды: " + super.getType() + ", материал: " + " фарфор, "+ "высота: " + this.getHeigth() + ", греть в микроволновке: ");
    }
}
