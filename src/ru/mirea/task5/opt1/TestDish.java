package ru.mirea.task5.opt1;

public class TestDish {
    public static String heatMicrowave(int a){
        if(a == 1){
            return "нельзя";
        }
        else return "можно";
    }

    public static void main(String[] argv){
        GlassDish glassDish1 = new GlassDish("cup",0, 10);
        GlassDish glassDish2 = new GlassDish("plate",0, 5);
        PorcelainDish porcelainGlass1 = new PorcelainDish("plate", 1, 5);
        PorcelainDish porcelainGlass2 = new PorcelainDish("vase", 0, 30);
        glassDish1.outputInfo();
        System.out.println(heatMicrowave(glassDish1.getMetal_ornament()));
        glassDish2.outputInfo();
        System.out.println(heatMicrowave(glassDish2.getMetal_ornament()));
        porcelainGlass1.outputInfo();
        System.out.println(heatMicrowave(porcelainGlass1.getMetal_ornament()));
        porcelainGlass2.outputInfo();
        System.out.println(heatMicrowave(porcelainGlass2.getMetal_ornament()));
    }
}
