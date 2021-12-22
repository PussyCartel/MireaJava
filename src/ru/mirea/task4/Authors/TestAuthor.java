package ru.mirea.task4.Authors;

public class TestAuthor {
    public static void main(String[] argv){
        Author a1 = new Author("Лев Толстой", "levtolstoi@mail.ru", 'M');
        Author a2 = new Author("Агния Барто", "agniabarto@yandex.ru", 'Ж');
        System.out.println("До смены почты");
        System.out.println(a1.getName() + " " + a1.toString() + " " + a1.getEmail());
        System.out.println(a2.getName() + " " + a2.toString() + " " + a2.getEmail());
        a2.setEmail("agniabarto@mail.ru");
        System.out.println("После смены почты");
        System.out.println(a1.getName() + " " + a1.toString() + " " + a1.getEmail());
        System.out.println(a2.getName() + " " + a2.toString() + " " + a2.getEmail());
    }
}
