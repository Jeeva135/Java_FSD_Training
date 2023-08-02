package org.example;

import org.example.ust.dao.AuthorDao;
import org.example.ust.dao.AuthorDaoMysqlImpl;
import org.example.ust.dto.Author;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        readAll();

        //System.out.println("Hello world!");
    }
    static void readAll(){
        AuthorDao authorDao = new AuthorDaoMysqlImpl();
        List<Author> authors = authorDao.readAll();
        if(authors.isEmpty()){
            System.out.println("No authors found");
            return;
        }
        for (Author author : authors) {
            System.out.println(author);
        }
    }

    static void readById() {
        AuthorDao authorDao = new AuthorDaoMysqlImpl();
        Optional<Author> optionalAuthor = authorDao.read(10);
        if (optionalAuthor.isEmpty()) {
            System.out.println("Author not found");
            return;
        }
        System.out.println(optionalAuthor.get());
    }

    static void insertData() {
        Author tolkien = new Author(1, "J.R.R. Tolkien", "Male",
                "j.r.r.tolkien", LocalDate.of(1960, 10, 10));

        System.out.println("Saving author: " + tolkien);

        AuthorDao authorDao = new AuthorDaoMysqlImpl();
        int updated = authorDao.create(tolkien);

        System.out.format("%d row(s) updated", updated);

    }

}