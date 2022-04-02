package ru.skypro;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
// *************  ОБЪЕКТЫ И КЛАССЫ (СЛОЖНЫЙ УРОВЕНЬ) *************
        Book[] book = new Book [10];
        Library lib = new Library(book.length);
        lib.addBook("The Stand", "Stephen King", 1978);
        lib.addBook("Back side of Moon", "T.Bochkova", 2015);
        lib.addBook("Free musketeers", "A.Duma", 1958);
        lib.printAllBooks();
        String s = "Back side of Moon";
        int y2 = 2000;
        System.out.println("==== Проверяем, в каком объекте 'Книга' есть название " + "'" + s + "'");
        lib.printBooksInformation(s);
        System.out.println("==== Изменяем год публикации книги по названию " + "'" + s + "'" + " на " + y2);
        lib.setNewYear(s, y2);
        lib.printBooksInformation(s);
    }
}
