package com.ust.books.service;

import com.ust.books.domain.Author;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements  BookService{
    @Override
    public Optional<Author> findAuthorByName(String author) {
        return null;
    }
}
