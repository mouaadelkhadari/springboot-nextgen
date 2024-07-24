package com.spproject.spproject.rest;

import com.spproject.spproject.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    private List<User> users;

    @PostConstruct
    public void loadUsers(){
        users = new ArrayList<>();
        users.add(new User("mouaad", "elkhadari"));
        users.add(new User("brahim", "diaz"));
        users.add(new User("leo", "messi"));
        users.add(new User("Roberto", "baggio"));
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return users;
    }

    @GetMapping("/users/{userId}")
    public User getOneUser(@PathVariable int userId){
        if ( (userId >= users.size()) || userId < 0  ) {
            throw new UserNotFoundException("User not found - " +userId);
        }
        return users.get(userId);
    }
}
