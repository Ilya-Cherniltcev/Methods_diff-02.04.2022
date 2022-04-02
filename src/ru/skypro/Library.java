package ru.skypro;

import java.util.Arrays;

public class Library {
    private Book[] book;
    private int bookLength;
    private Author [] name;


    public Library(int bookLength) {
        this.bookLength = bookLength;
        this.book = new Book[bookLength];
        this.name = new Author[bookLength];
    }

    public void addBook(String title, Author name, int year) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = new Book(title, name, year);
                this.name[i]= name;
                return;
            }
        }
        throw new RuntimeException("Все ячейки массива заполнены");
    }
    public void addBook2(Book b) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = b;
              //  this.name[i]= name;
                return;
            }
        }
        throw new RuntimeException("Все ячейки массива заполнены");
    }

    public void printAllBooks() {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                System.out.println(book[i]);
            }
        }
    }

    public void printBooksInformation(String title) {
        int number = getYear(title);
        if (number != -1) {
            System.out.println(book[getYear(title)]);
        }
                }


    public void setNewYear(String title, int year) {
        // 1 - определяем порядковый номер книги с названием title
        int number = getYear(title);
        // 2 - заменяем год книги на "новый" год, принятый в параметрах вызова метода
        if (number != -1) {
            book[number] = new Book(title, this.name[number], year);
        }
    }



    public int getYear (String title) {
        for (int i = 0; i < book.length; i++) {
            String temp;
            if (book[i] != null) {
                temp = book[i].toString();
                if (temp.contains(title)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String out = "Library:" + "\n";
        for ( int i = 0; i < book.length; i++ ) {
            out += book[i];
            out += "\n";
        }
        return out;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(book, library.book) && Arrays.equals(name, library.name);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(book);
        result = 31 * result + Arrays.hashCode(name);
        return result;
    }
}

