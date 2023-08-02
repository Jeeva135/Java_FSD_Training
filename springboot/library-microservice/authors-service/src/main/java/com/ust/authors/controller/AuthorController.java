package com.ust.authors.controller;

import com.ust.authors.domain.Author;
import com.ust.authors.domain.Book;
import com.ust.authors.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {


    @Autowired
    private AuthorService authorService;


    private Author author;

    List<Author> authors = new ArrayList<>();


    @PostMapping("")
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author){
        authors.add(author);
        return ResponseEntity.ok(author);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Author> getAuthor(@PathVariable String name){
        return ResponseEntity.ok(authors.stream()
                .filter(author -> author.getName().equals(name))
                .findFirst()
                .orElseThrow());
    }

    @GetMapping("/{name}/books")
    public ResponseEntity<List<Book>> getBooksByAuthor(@PathVariable String name){
        final var books=authorService.findBooksByAuthor(name);
        if (books.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(books);
        }
    }

    // POST /authors
    // GET  /authors/{name}
    // GET  /authors/{name}/books





