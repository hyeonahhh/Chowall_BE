package com.example.chowall.service;

import com.example.chowall.domain.DataResponse;
import com.example.chowall.dao.userDao;
import com.example.chowall.domain.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private userDao dao;
    public boolean getId(UserDomain user) {
        int n = dao.getId(user);
        return n > 0;
    }

    public boolean addUser(UserDomain user) {
        System.out.println(user.toString());
        int n = dao.addUser(user);
        System.out.println("addUser 결과 : " + n);
        return n > 0;
    }
}
