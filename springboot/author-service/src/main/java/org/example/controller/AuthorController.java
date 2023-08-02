package org.example.controller;


import org.example.domain.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {

    private List<Author> authors = List.of(new Author("abc@gmail.com","Abc","Fiction"));

    @GetMapping()
    public List<Author> getAll(){
        return authors;
    }

    @PostMapping
    public Author create(Author author){
        authors.add(author);
        return author;
    }
}
