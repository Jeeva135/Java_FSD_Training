package in.stackroute.ust.controller;

import in.stackroute.ust.domain.User;
import in.stackroute.ust.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    //private List<User> user=new ArrayList<>();
    private User user;

    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody User user){
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @GetMapping("")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.status(HttpStatus.FOUND).body(userRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getOne(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(userRepository.findById(id).get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user){
        var updated=userRepository.findById(id).get();
        updated.setId(user.getId());
        updated.setName(user.getName());
        updated.setEmail(user.getEmail());
        updated.setPassword(user.getPassword());
        userRepository.save(updated);

        return ResponseEntity.status(HttpStatus.OK).body(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<User>> deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(userRepository.findAll());
    }


}
