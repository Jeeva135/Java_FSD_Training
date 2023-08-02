package in.stackroute.ust.controllers;

import in.stackroute.ust.domain.ToDo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class ToDoController {
    private List<ToDo> toDos=new ArrayList<>(
            List.of(new ToDo(1,"Learn Java",true))
    );

    @GetMapping("")
    public List<ToDo> getAll(){
        return toDos;
    }

    @GetMapping("/{id}")
    public ToDo getOne(@PathVariable int id){
        return toDos.stream().
                filter(toDo -> toDo.id()==id).
                findFirst().
                orElseThrow();
    }


    @PostMapping("")
    public ToDo create(@RequestBody ToDo toDo){
        toDos.add(toDo);
        return toDo;
    }

    @PutMapping("/{id}")
    public ToDo update(@PathVariable int id,@RequestBody ToDo toDo){
        ToDo existing=toDos.stream().
                filter(t->t.id()==id).
                findFirst().
                orElseThrow();
        toDos.remove(existing);
        toDos.add(toDo);
        return toDo;
    }

    @DeleteMapping("/{id}")
    public List<ToDo> delete(@PathVariable int id){
        toDos.removeIf(toDo -> toDo.id()==id);
        return toDos;
    }


}
