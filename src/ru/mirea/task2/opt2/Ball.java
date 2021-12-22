package ru.mirea.task2.opt2;

import java.lang.*;

public class Ball {
    private  String type;
    private  double radius;
    private  double mass;
    public Ball(){
        type = "your mum";
        radius = 0;
    }
    public void setType(String typeBall){
        this.type = typeBall;
    }
    public  void setMass(double m){
        this.mass = m;
    }
    public  void setRadius(double r){
        this.radius = r;
    }
    public String getTypeBall(){
        return type;
    }
    public double getRadius(){
        return radius;
    }
    public double getMass() {
        return mass;
    }
}
