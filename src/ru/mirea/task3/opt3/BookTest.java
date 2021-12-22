package ru.mirea.task3.opt3;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.setAuthor("нет");
        book1.setGenre("русская народная сказка");
        book1.setPageSize(10);
        book2.setAuthor("Артур Конан Дойл");
        book2.setGenre("Приключения Шерлока Холмса");
        book2.setPageSize(320);
        book3.setAuthor("Н. В. Зорина");
        book3.setGenre("методическое указание");
        book3.setPageSize(65);
        System.out.println(book1.output());
        System.out.println(book2.output());
        System.out.println(book3.output());
    }
}
