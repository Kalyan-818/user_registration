package com.user.registration.controller;

import com.user.registration.model.UserRequest;
import com.user.registration.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public String registerUser(@RequestBody UserRequest userRequest) {
        log.info("input request : {}", userRequest);
        return userService.registerNewUser(userRequest);
    }
}
