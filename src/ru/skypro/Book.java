package ru.skypro;

public class Book {
    private String title;
    private int year;
    private String author;


    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " by " + author + " was published in " + year;
    }
}
