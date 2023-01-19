package com.example.chowall.service;

import com.example.chowall.domain.DataResponse;
import com.example.chowall.dao.userDao;
import com.example.chowall.domain.UserDomain;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private userDao dao;
    public boolean getId(UserDomain user) {
        int n = dao.getId(user);
        return n > 0;
    }

    public boolean addUser(UserDomain user) {
        int n = dao.addUser(user);
        return n > 0;
    }

    public boolean deleteUser(String id) {
        int n = dao.deleteUser(id);
        return n > 0;
    }

    public boolean updateUser(UserDomain user) {
        int n = dao.updateUser(user);
        return n > 0;
    }

    public List<UserDomain> ListUser(){
        return dao.userList();
    }




}
