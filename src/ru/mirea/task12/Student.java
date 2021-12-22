package ru.mirea.task12;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    protected ArrayList<Integer> idNumber;
    Scanner scanner1 = new Scanner(System.in);

    public Student() {

        this.idNumber = new ArrayList<>();
    }

    public int getSize(){

        return idNumber.size();
    }

    public int getIdNumber(int i) {
        return idNumber.get(i);
    }

    public void inputArray(){
        System.out.println("Количество студентов");
        int a = scanner1.nextInt();
        int b;
        System.out.println("Введите ID студентов");
        for (int i = 0; i < a; i++){
            b = scanner1.nextInt();
            idNumber.add(i, b);
        }
    }
    public void insertionSort(){
        for (int left = 0; left < idNumber.size(); left++){
            int v = idNumber.get(left);
            int i = left - 1;
            for (; i >=0; i--){
                if(v < idNumber.get(i)) {
                    idNumber.set(i+1, idNumber.get(i));
                }
                else{
                    break;
                }
            }
            idNumber.set(i+1, v);
        }
    }
    public void outputArray(){
        for (int i = 0; i < idNumber.size(); i++){
            System.out.print(idNumber.get(i) + " ");
        }
        System.out.println();
    }
}
