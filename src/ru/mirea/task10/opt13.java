package ru.mirea.task10;

import java.util.ArrayList;
import java.util.Scanner;

public class opt13 {
    public static void main(String[] args){
        Integer a,b;
        Scanner sc = new Scanner(System.in);
        b= sc.nextInt();
        ArrayList<Integer> first = new ArrayList<>();
        for (int i = 0; i < b; i++){
            if(i != b-1) {
                a = sc.nextInt();
                first.add(i, a);
            }
            else first.add(i, 0);
        }
        for (int i = 0; i < b; i++){
            if(i % 2 == 1) {
                System.out.print(first.get(i) + " ");
            }
        }
    }
}
