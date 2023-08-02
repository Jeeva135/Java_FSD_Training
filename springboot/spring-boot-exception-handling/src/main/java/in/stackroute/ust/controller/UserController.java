package in.stackroute.ust.controller;

import in.stackroute.ust.domain.User;
import in.stackroute.ust.service.UserPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserPersistenceService userPersistenceService;
    // GET /api/v1/users?email=email

    @GetMapping("/search")
    public ResponseEntity<User> getUser(@RequestParam String email){
        Optional<User> findemail=userPersistenceService.findByEmail(email);
        if (findemail.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(findemail.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // GET /api/v1/users?email=email&password=password
    @GetMapping("/both")
    public ResponseEntity<User> getUserEmailandPassword(@RequestParam String email, @RequestParam String password){
        Optional<User> finduser=userPersistenceService.findByEmailAndPassword(email, password);
        if (finduser.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(finduser.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
