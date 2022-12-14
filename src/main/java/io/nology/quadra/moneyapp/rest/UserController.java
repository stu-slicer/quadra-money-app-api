package io.nology.quadra.moneyapp.rest;

import io.nology.quadra.moneyapp.model.User;
import io.nology.quadra.moneyapp.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.*;

@RestController
@RequestMapping(path = SERVICE_PREFIX)
@CrossOrigin()
public class UserController {

    @Autowired
    private UserRepository repository;
    private List<User> users = new ArrayList<User>();

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findByUserID(id));
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User saved = repository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body( saved );
    }

}

