package ru.mirea.task10;

import java.util.Scanner;

public class opt10 {

    public static int rec(int n, int i) {
        return (n==0) ? i : rec( n/10, i*10 + n%10 );
    }

    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        System.out.println(rec(a,0));
    }
}
