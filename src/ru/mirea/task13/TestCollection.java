package ru.mirea.task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestCollection {

    public static void arrayList(){
        ArrayList al = new ArrayList();
        System.out.println("Изначальный размер al: " + al.size());

        // Добавляем элементы в ArrayList
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Размер al после добавлений: " + al.size());

        // Выводим на экран элементы ArrayList
        System.out.println("Содержимое al: " + al);

        // Удаляем элементы из ArrayList
        al.remove("F");
        al.remove(2);
        System.out.println("Размер al после удалений: " + al.size());
        System.out.println("Содержимое al: " + al);
    }

    public static void linkedList(){
        // Создаём LinkedList
        LinkedList ll = new LinkedList();

        // Добавляем элементы в LinkedList
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Изначальное содержание ll: " + ll);

        // Удаляем элементы из LinkedList
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержание ll после удаления: " + ll);

        // Удаляем первый и последний элементы
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll после удаления первого и последнего: " + ll);

        // Получаем и устанавливаем значение
        Object val = ll.get(2);
        ll.set(2, (String) val + " Изменено");
        System.out.println("ll после изменения: " + ll);
    }

    public static void myArrayList(){
        System.out.println("Использовал в task12");
    }
    public static void main(String[] args){
        arrayList();
        linkedList();
        myArrayList();
    }
}
