package com.example.chowall.controller;

import com.example.chowall.domain.UserDomain;
import com.example.chowall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    public final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    /**중복확인**/
    @PostMapping("/getId")
    public String getId(UserDomain userDomain) {
        logger.info("UserController getId()");
        boolean b = userService.getId(userDomain);
        if(b) {
            return "no";
        }
        return "ok";
    }

    /**회원가입**/
    @PostMapping("/addUser")
    public String addMember(@RequestBody UserDomain userDomain) {
        System.out.println(userDomain.toString());
        logger.info("UserController addMember()");
        boolean b = userService.addUser(userDomain);

        if(b) { /**성공**/
            return "ok";
        }
        return "no"; /**실패**/
    }


}
