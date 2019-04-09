package com.dziesiedzieje.dziesiedzieje.controller;

import com.dziesiedzieje.dziesiedzieje.mapper.dto.UserDto;
import com.dziesiedzieje.dziesiedzieje.repository.UserRepository;
import com.dziesiedzieje.dziesiedzieje.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<UserDto> getAllUsers() {

        userService.addDummyUser();
        return userService.findAllUsers();
    }

}