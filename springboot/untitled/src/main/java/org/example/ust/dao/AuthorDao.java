package org.example.ust.dao;

import org.example.ust.dto.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDao {
    int create (Author author);

    Optional<Author> read(int authorId);

    int update(Author author);

    int delete(int authorId);


    List<Author> readAll();
}
