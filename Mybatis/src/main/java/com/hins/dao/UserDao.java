package com.hins.dao;

import com.hins.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {
     List<User> listUser();
     User selectUserByUid(@Param("id") Integer id);
     Integer addUser(User user);
     Integer deleteUserByUid(@Param("id")  Integer id);
     Integer changeUnameById(Map<String,Object> message);

}
