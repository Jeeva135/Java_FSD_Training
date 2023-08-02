package in.stackroute.ust.controller;

import in.stackroute.ust.domain.Todo;
import in.stackroute.ust.dto.TodoDto;
import in.stackroute.ust.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private Logger logger= LoggerFactory.getLogger(TodoController.class);

    //    @Autowired
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    private TodoDto convertToDto(Todo todo) {
        return new TodoDto(todo.getId(), todo.getReminder(), todo.isCompleted());
    }

    private Todo convertToEntity(TodoDto todoDto) {
        return new Todo(todoDto.id(), todoDto.reminder(), todoDto.completed());
    }

    // POST     /api/v1/todos
    @PostMapping("")
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto) {
        final var todo = convertToEntity(todoDto);
        final var createdTodo = todoService.save(todo);
        final var dto = convertToDto(createdTodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    // GET      /api/v1/todos
    @GetMapping("")
    public ResponseEntity<List<TodoDto>> getAllTodos() {
        logger.trace("Trace Message");
        final var todos = todoService.findAll();
        if (todos.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        final var todoDtos = todos.stream().map(todo -> convertToDto(todo)).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(todoDtos);
    }

    // GET      /api/v1/todos/{id}
    @GetMapping("/{id}")
    public ResponseEntity<TodoDto> getTodoById(@PathVariable int id) {
        final Optional<Todo> todo = todoService.findById(id);
        if (todo.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        final var todobyId = todo.get();
        final var dto = convertToDto(todobyId);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
//        return  ResponseEntity.ok(convertToDto(todo.get()));
    }

    // PUT      /api/v1/todos/{id}
    @PutMapping("/{id}")
    public ResponseEntity<TodoDto> updateTodo(@PathVariable int id, @RequestBody TodoDto dto){
        final var todoOptional = todoService.findById(id);
        if(todoOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        final var todo = todoOptional.get();
        todo.setCompleted(dto.completed());
        todo.setReminder(dto.reminder());

        final var updatedTodo = todoService.save(todo);
        final var updatedDto = convertToDto(updatedTodo);
        return ResponseEntity.status(HttpStatus.OK).body(updatedDto);
    }


    // DELETE   /api/v1/todos/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<TodoDto> deleteTodoById(@PathVariable int id){
        final var todoOptional = todoService.findById(id);
        if(todoOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        todoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
