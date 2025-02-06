package com.picpay_simple.picpaysimple.controllers;

import com.picpay_simple.picpaysimple.domain.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<User> createUser(UserDTO user){

    }


}
