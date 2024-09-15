package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Book {
    private String title;
    private Author[] authors;

    public Book(String title, Author[] authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        for (Author author : authors) {
            authorsString.append(author.toString()).append(", ");
        }
        if (authors.length > 0) {
            authorsString.setLength(authorsString.length() - 2); // удаляем лишнюю запятую
        }
        return "Title: " + title + ", Authors: " + authorsString;
    }
}