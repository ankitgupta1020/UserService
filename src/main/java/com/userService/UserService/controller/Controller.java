package com.userService.UserService.controller;

import com.userService.UserService.entities.User;
import com.userService.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {

    @Autowired
    private UserService userService;

    // Create New User  ----------------------------------

    @PostMapping("/save")
    public ResponseEntity<User> saveUser (@RequestBody User user)
    {
        User create = this.userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(create);
    }

    // get All Users from server ------------------------

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers ()
    {
        List<User> get = this.userService.getAll();
        return ResponseEntity.ok(get);
    }

    // get User by Id -----------------------------------

    @GetMapping("/getById/{userId}")
    public ResponseEntity<User> getUserById (@PathVariable String userId)
    {
        User getById = this.userService.getUser(userId);
        return ResponseEntity.ok(getById);
    }


}
