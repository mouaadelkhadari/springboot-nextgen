package com.spproject.spproject.rest;

import com.spproject.spproject.entity.Student;
import com.spproject.spproject.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("mouaad", "elkhadari"));
        users.add(new User("brahim", "diaz"));
        users.add(new User("leo", "messi"));
        return users;
    }
}
