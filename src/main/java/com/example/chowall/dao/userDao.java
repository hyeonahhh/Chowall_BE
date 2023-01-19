package com.example.chowall.dao;
import com.example.chowall.domain.UserDomain;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    int getId(UserDomain user);
    int addUser(UserDomain user);
    int updateUser(UserDomain user);
    int deleteUser(String id);
    List<UserDomain> userList();



}
