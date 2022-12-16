package com.userService.UserService.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException()
    {
        super(" !! This id is not found on server !!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
