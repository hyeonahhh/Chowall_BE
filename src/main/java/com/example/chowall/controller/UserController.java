package com.example.chowall.controller;

import com.example.chowall.domain.UserDomain;
import com.example.chowall.service.UserService;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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

    @ResponseBody
    @GetMapping("/{userIdx}")
    public UserDomain getUserByIdx(@PathVariable("userIdx") int userIdx) {
        UserDomain user = userService.getUserByIdx(userIdx);
        return user;
    }

    @ResponseBody
    @PostMapping("/login")
    public UserDomain login(@RequestBody UserDomain userDomain) {
        UserDomain user = userService.login(userDomain);
        return user;
    }

    @PostMapping("/updateUser")
    public String updateMember(UserDomain userDomain) {
        logger.info("UserController updateUser()");
        boolean b = userService.updateUser(userDomain);
        logger.info(userDomain.toString());

        if(b) { /**성공**/
            return "ok";
        }
        return "no"; /**실패**/
    }

    @PostMapping("/deleteUser")
    public String deleteMember(String id) {
        logger.info("UserController deleteMember()");
        boolean b = userService.deleteUser(id);

        if(b) { /**성공**/
            return "ok";
        }
        return "no"; /**실패**/
    }

    @GetMapping("/user")
    public String ListMember(Model model) {
        logger.info("UserController ListMember()");
        model.addAttribute("userList",userService.ListUser());
        return "user/list";
    }
}
