// File: Book.java
package book.bookapi;

import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private String author;
    private int publicationYear;

    public Book() {
        this.id = UUID.randomUUID().toString();
    }

    public Book(String title, String author, int publicationYear) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}