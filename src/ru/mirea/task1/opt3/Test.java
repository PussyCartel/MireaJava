package ru.mirea.task1.opt3;

import java.util.Arrays;

public class Test {

    public static void main(String[] args){
        double a[] = {1.0, 2.2, 3.3, 4.2 ,5.1};
        int b[] = {6, 7, 8, 9, 10};
        int k =0;
        char s[] = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'c', 'o', 'o', 'l'};
        for(int i = 0; i < 5; i++){
            System.out.println(a[i]);
        }
        System.out.println(' ');

        do{
            System.out.println(b[k]);
            k++;
        }
        while (k!=4);
        System.out.println(' ');
        k = 0;

        while(k!=12) {
            System.out.println(s[k]);
            k++;
        }
        for(int i = 1; i <= 10; i++){
            System.out.println("1/"+i);
        }
        System.out.println();
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = (int)(Math.random()*6);
        }

        for(int i = 0; i < 10; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        Arrays.sort(array);

        for(int i = 0; i < 10; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
