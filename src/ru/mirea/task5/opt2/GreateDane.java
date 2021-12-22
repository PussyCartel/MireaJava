package ru.mirea.task5.opt2;

public class GreateDane extends Dog{
    private String name;
    private Integer age;
    private Double weight;

    public GreateDane(String name, Integer age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String getBreed() {
        return "greate dane";
    }

    public void getInf(){
        System.out.println("Имя " + name + " возраст " + age + " вес " + " порода " + this.getBreed());
    }
}
