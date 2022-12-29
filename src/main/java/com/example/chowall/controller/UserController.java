package com.example.chowall.controller;

import com.example.chowall.domain.DataResponse;
import com.example.chowall.service.userService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/addUser")
    public DataResponse addUser(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("email") String email) {
        DataResponse response = userService.addUser(id, name, password, email);

    }

}
