package org.example.domain;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue
    @Column(name="bookid")
    private int bookId;
    @Column(name="bookname")
    private String bookName;
    @Column(name="language")
    private String language;
    @Column(name="price")
    private double price;

    public Book() {
    }

    public Book(int bookId, String bookName, String language, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.language = language;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
