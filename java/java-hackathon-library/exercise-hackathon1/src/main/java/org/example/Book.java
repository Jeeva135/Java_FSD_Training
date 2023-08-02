package org.example;

public class Book {
    private int bookIsbnNumber;
    private String author;
    private String publisher;

    public Book(int bookIsbnNumber, String author, String publisher) {
        this.bookIsbnNumber = bookIsbnNumber;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(int bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
