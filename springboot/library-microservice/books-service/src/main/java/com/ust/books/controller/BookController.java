package com.ust.books.controller;

import com.ust.books.domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class BookController {

    List<Book> books=new ArrayList<>();



    @PostMapping("")
    public ResponseEntity<Book> saveAuthor(@RequestBody Book book){
        books.add(book);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/{title}")
    public ResponseEntity<Book> getBookByTitle(@PathVariable String title){
        return ResponseEntity.ok(books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElseThrow());
    }

    @GetMapping("/books/{author}")
    public ResponseEntity<List<Book>>  getByAuthor(@PathVariable String author){
        final var bookList=books.stream().filter(book1 ->book1.getAuthor().equals(author)).toList();
        if (bookList.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.ok(bookList);
    }
}
