package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Fyodor", "Dostoevsky");
        Author author3 = new Author("Anton", "Chekhov");
        Author author4 = new Author("Alexander", "Pushkin");
        Author author5 = new Author("Mikhail", "Lermontov");

        Book book1 = new Book("War and Peace", new Author[]{author1});
        Book book2 = new Book("Crime and Punishment", new Author[]{author2});
        Book book3 = new Book("The Cherry Orchard", new Author[]{author3});
        Book book4 = new Book("Eugene Onegin", new Author[]{author4});
        Book book5 = new Book("A Hero of Our Time", new Author[]{author5});

        Book[] books = {book1, book2, book3, book4, book5};

        for (Book book : books) {
            System.out.println(book);
        }
    }
}