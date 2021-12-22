package ru.mirea.task10;

import java.util.Scanner;

public class opt14 {
    public static String rec(Integer n)
    {
        if (n < 10) {
            return n.toString();
        }
        else {
            return rec(n / 10) + " " + n % 10;
        }
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(rec(num));
    }
}
