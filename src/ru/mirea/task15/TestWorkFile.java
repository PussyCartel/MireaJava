package ru.mirea.task15;

import java.util.Scanner;

public class TestWorkFile {

    public static void main(String[] args){
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя создаваемого файла");
        str = scanner.nextLine();
        FilePoss filePoss = new FilePoss(str);

        System.out.println("Ввод информации в файл");
        str = scanner.nextLine();
        filePoss.writeToFile(str, false);

        System.out.println("Вывод содержимого файла");
        filePoss.readFromFile();
        System.out.println();

        System.out.println("Замена информации в файле");
        str = scanner.nextLine();
        filePoss.writeToFile(str, false);

        System.out.println("Вывод содержимого файла после замены информации");
        filePoss.readFromFile();
        System.out.println();

        System.out.println("Добавление информации в конец файла");
        str = scanner.nextLine();
        filePoss.writeToFile(str, true);

        System.out.println("Вывод содержимого файла после добавления информации");
        filePoss.readFromFile();
        System.out.println();
    }
}
