package org.example.ust.dao;

import org.example.ust.dto.Book;

public interface BookDao {

    int create (Book book);

    Book read(int bookId);

    int update(Book book);

    int delete(int bookId);
}
