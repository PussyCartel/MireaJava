package ru.mirea.task5.opt2;

public class Pug extends Dog{
    private String name;
    private Integer age;
    private Double weight;

    public Pug(String name, Integer age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String getBreed() {
        return "pug";
    }

    public void getInf(){
        System.out.println("Имя " + name + " возраст " + age + " вес " + " порода " + this.getBreed());
    }
}
