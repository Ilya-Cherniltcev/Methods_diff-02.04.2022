package ru.skypro;



public class Main {

    public static void main(String[] args) {
// *************  ОБЪЕКТЫ И КЛАССЫ (СЛОЖНЫЙ УРОВЕНЬ) *************
        Book[] book = new Book [12];
        Author author1 = new Author("Stephen King");
        Author author2 = new Author("T.Bochkova");
        Author author3 = new Author("A.Duma");
        Book book1 = new Book("The Stand", author1, 1978);
        Book book2 = new Book("Back side of Moon", author2, 2015);
        Book book3 = new Book("Free musketeers", author3, 1958);

        Library lib = new Library(book.length);
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.printAllBooks();
        String s = "Back side of Moon";
        int y2 = 2000;
        System.out.println("==== Проверяем, в каком объекте 'Книга' есть название " + "'" + s + "'");
        lib.printBooksInformation(s);
        System.out.println("==== Изменяем год публикации книги по названию " + "'" + s + "'" + " на " + y2);
        lib.setNewYear(s, y2);
        lib.printBooksInformation(s);
        System.out.println("*****************       задача следующая   **************************");
        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen King");
        Author stephenKing2 = new Author("Stephen King");
        Author levTolstoy = new Author("Lev Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);


        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);

        System.out.println(library);
    }
}
