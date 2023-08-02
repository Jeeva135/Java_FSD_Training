package org.example.service;

import org.example.domain.Book;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

//    public List<Book> getAllBooks(){
//        return bookRepository.findAll();
//    }

    public Optional<List<Book>> getByLanguage(String language){
        return bookRepository.findByLanguage(language);
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
}
