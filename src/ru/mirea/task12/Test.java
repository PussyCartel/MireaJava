package ru.mirea.task12;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        student.inputArray();
        student.outputArray();
        student.insertionSort();
        student.outputArray();
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        for(int i = 0; i < student.getSize(); i++){
            System.out.println("Для студента ID" + student.getIdNumber(i) + " введите количество баллов");
            int a = scanner.nextInt();
            sortingStudentsByGPA.inputValue(student.getIdNumber(i), a);
        }
        System.out.println("Вывод студентов и баллов");
        sortingStudentsByGPA.outputMap();
        System.out.println("Сортировка студентов по баллам");
        sortingStudentsByGPA.fastSort();
    }
}
