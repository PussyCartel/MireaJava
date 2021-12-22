package ru.mirea.task3.opt3;

public class Book {
    private String genre;
    private String author;
    private Integer pageSize;

    public Book() {
        this.genre = "";
        this.author = "";
        this.pageSize = 0;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String output(){
        return ("genre: " + genre + " author: " + author + " page size: " + pageSize.toString());
    }
}
