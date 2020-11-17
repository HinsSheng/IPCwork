package com.hins;

import com.hins.dao.StudentDao;
import com.hins.dao.UserDao;
import com.hins.pojo.Student;
import com.hins.pojo.User;
import com.hins.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlSessionCRUDTest {
    private SqlSession session = MybatisUtils.getSession();
    private UserDao mapper = session.getMapper(UserDao.class);

    //无参list
    @Test
    public void listUser() {

        List<User> users = mapper.listUser();
        users.forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void selectByUid() {

        User user = mapper.selectUserByUid(123);
        System.out.println(user);
    }

    @Test
    public void addOne() throws InterruptedException {
        User param = new User(398, "沙雕", "1566");
        Integer rst = mapper.addUser(param);


        System.out.println("返回结果  " + rst);
        User user = mapper.selectUserByUid(param.getUid());
        System.out.println(user);
    }

    @Test
    public void deletetone() {
        Integer key = mapper.deleteUserByUid(356);
        if (key > 0) {
            session.commit();
            System.out.println("删除成功");
        }
    }

    @Test
    public void updatNameById() {
        Map<String, Object> map = new HashMap<>();
        map.put("id",356);
        map.put("name","王翰");
        Integer key = mapper.changeUnameById(map);
        if (key > 0) {
            session.commit();
            System.out.println("修改成功");
        }

    }
    @Test
    public void selectStudent(){
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student = studentDao.selectone("赵雷");
        System.out.println(student);
    }
    @Test
    public void selectList(){
        StudentDao studentDao = session.getMapper(StudentDao.class);

        List<Student> list = studentDao.listStudentsLike("白");
        list.forEach(student->{
            System.out.println(student);
        });
    }
}
