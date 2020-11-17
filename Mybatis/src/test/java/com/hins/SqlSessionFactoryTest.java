package com.hins;

import com.hins.dao.UserDao;
import com.hins.pojo.User;
import com.hins.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SqlSessionFactoryTest {
    @Test
    public void factoryTest(){
        SqlSession session = MybatisUtils.getSession();
        System.out.println(session);
    }
    @Test
    public void listUserTest(){
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        List<User> users = mapper.listUser();
        users.forEach(user ->{
            System.out.println(user);
        });
    }
}
