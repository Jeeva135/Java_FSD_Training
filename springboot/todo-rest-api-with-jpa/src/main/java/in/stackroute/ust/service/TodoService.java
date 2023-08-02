package in.stackroute.ust.service;

import in.stackroute.ust.domain.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    Todo save(Todo todo);

    Todo update(Todo todo);

    void deleteById(int id);

    Optional<Todo> findById(int id);

    List<Todo> findAll();
}

