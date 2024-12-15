package com.sastiudan.userservice.controllers;

import com.sastiudan.userservice.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    public User Login(){
//        check if email and password in db
//        if yes return user
//        else throw some error
        return null;
    }

    public User signUp(){
//            no need to has password for now
//         just store user as in the db
//         for now no need to have email verification either
        return null;
    }

    public ResponseEntity<Void> logOut(){
//        delete token if exists ->200
//        if doesn't exist give a  404
        return null;
    }
}
