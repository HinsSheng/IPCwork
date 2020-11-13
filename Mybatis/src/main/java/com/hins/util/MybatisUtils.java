package com.hins.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        //静态代码块初始化sqlsessionFactory 加载指定配置文件
        try {
            String resoure = "mybatis-config.xml";
            InputStream resourceAsStream = Resources.getResourceAsStream(resoure);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){

        return getSession(true);
    }
    public static SqlSession getSession(Boolean flag){
        SqlSession sqlSession = sqlSessionFactory.openSession(flag);
        return sqlSession;
    }

}
