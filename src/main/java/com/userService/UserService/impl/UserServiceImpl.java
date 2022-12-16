package com.userService.UserService.impl;

import com.userService.UserService.entities.User;
import com.userService.UserService.exception.ResourceNotFoundException;
import com.userService.UserService.repositories.UserRepository;
import com.userService.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->
                new ResourceNotFoundException(" User is not found on the server with given id : "+ userId));
    }
}
