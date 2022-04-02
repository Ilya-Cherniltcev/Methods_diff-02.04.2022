package ru.skypro;

public class Library {
    private Book[] book;
    private int bookLength;
    private String [] name;


    public Library(int bookLength) {
        this.bookLength = bookLength;
        this.book = new Book[bookLength];
        this.name = new String[bookLength];
    }

    public void addBook(String title, String name, int year) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = new Book(title, name, year);
                this.name[i]= name;
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

}

