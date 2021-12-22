package ru.mirea.task29;

import ru.mirea.task27.Bank;

import java.io.*;

public class Test29 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Bank bank = new Bank( 1000, null, null);
        // сохранение тысячи
        FileOutputStream outputStream = new FileOutputStream("savemybank.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(bank);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("savemybank.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Bank bank2 = (Bank) objectInputStream.readObject();
        // получение сохраненной тысячи
        bank2.calculateTotalMoney();
    }
}
