package ru.mirea.task27;

import java.util.Scanner;

public class Input {
    int a;
    String str;
    Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        try{
            a = scanner.nextInt();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        try{
            str = scanner.nextLine();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        this.str = str;
    }
}
