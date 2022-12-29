package com.example.chowall.mapper;

import com.example.chowall.domain.UserDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public int addUser(UserDomain user);
    public int getId(@Param("id") String id);
    public UserDomain getUserById(@Param("id") String id);
    public UserDomain getUserByIdx(@Param("idx") int idx);


}
