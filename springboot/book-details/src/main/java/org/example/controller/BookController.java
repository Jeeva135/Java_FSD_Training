package org.example.controller;

import org.example.domain.Book;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping()
    public ResponseEntity<Book> create(@RequestBody Book book){
        if (book==null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        Book savedBook=bookService.saveBook(book);
        return ResponseEntity.status(HttpStatus.OK).body(savedBook);
    }

    @GetMapping("/{language}")
    public ResponseEntity<Optional<List<Book>>> getABooksByLanguage(@PathVariable String language){
        Optional<List <Book>> bookList=bookService.getByLanguage(language);
        if (bookList==null){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(bookList);
    }
}
