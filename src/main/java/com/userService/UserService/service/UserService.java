package com.userService.UserService.service;

import com.userService.UserService.entities.User;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface UserService {

    User saveUser (User user);
    List<User> getAll ();
    User getUser (String userId);

}
