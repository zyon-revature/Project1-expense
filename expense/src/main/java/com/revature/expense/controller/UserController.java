package com.revature.expense.controller;

import com.revature.expense.manager.UserManager;
import com.revature.expense.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserManager manager;

    @PostMapping(path = "/create" ,consumes = "application/json", produces = "application/json")
    public User create(@RequestBody User u) {
        return manager.create(u);
    }

    @PostMapping(path="/login", produces="application/json")
    public User loginUser(@RequestBody User u) throws Exception {
        String tempUsername = u.getUsername();
        String tempPassword = u.getUserpassword();
        User result = null;
        if(tempUsername != null && tempPassword != null) {
            result = manager.login(tempUsername, tempPassword);
        }
        if(result == null) {
            throw new Exception("Invalid Login");
        }
        return result;
    }

    @GetMapping(produces = "application/json")
    public List<User> findAll() {
        return manager.findAll();
    }

    @GetMapping(path="/{id}", produces = "application/json")
    public User getUser(@PathVariable int id){
        return manager.findById(id);
    }
}
