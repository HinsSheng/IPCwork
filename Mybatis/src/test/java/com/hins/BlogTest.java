package com.hins;

import com.hins.mapper.BlogMapper;
import com.hins.pojo.Blog;
import com.hins.util.IDUtil;
import com.hins.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

public class BlogTest {
    private SqlSession sqlSession = MybatisUtils.getSession();

    //    初始化数据
    @Ignore
    public void addBlogTest() {
        Blog blog1 = new Blog();
        blog1.setId(IDUtil.getId());
        blog1.setAuthor("沈拘");
        blog1.setCreateTime(new Date());
        blog1.setTitle("spring很简单");
        blog1.setViews(342);
        Blog blog2 = new Blog();
        blog2.setId(IDUtil.getId());
        blog2.setAuthor("hins");
        blog2.setCreateTime(new Date());
        blog2.setTitle("mybatis很简单");
        blog2.setViews(675);
        Blog blog3 = new Blog();
        blog3.setId(IDUtil.getId());
        blog3.setAuthor("沈拘");
        blog3.setCreateTime(new Date());
        blog3.setTitle("springMVC很简单");
        blog3.setViews(786);
        Blog blog4 = new Blog();
        blog4.setId(IDUtil.getId());
        blog4.setAuthor("hins");
        blog4.setCreateTime(new Date());
        blog4.setTitle("redis很简单");
        blog4.setViews(978);
        Blog blog5 = new Blog();
        blog5.setId(IDUtil.getId());
        blog5.setAuthor("沈拘");
        blog5.setCreateTime(new Date());
        blog5.setTitle("docker很简单");
        blog5.setViews(243);
        Blog blog6 = new Blog();
        blog6.setId(IDUtil.getId());
        blog6.setAuthor("hins");
        blog6.setCreateTime(new Date());
        blog6.setTitle("cloud很简单");
        blog6.setViews(987);
        Blog blog7 = new Blog();
        blog7.setId(IDUtil.getId());
        blog7.setAuthor("沈拘");
        blog7.setCreateTime(new Date());
        blog7.setTitle("dubbo很简单");
        blog7.setViews(78567);
        Blog blog8 = new Blog();
        blog8.setId(IDUtil.getId());
        blog8.setAuthor("hins");
        blog8.setCreateTime(new Date());
        blog8.setTitle("MQ很简单");
        blog8.setViews(543);

        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        ArrayList<Blog> blogs = new ArrayList<>();
        blogs.add(blog1);
        blogs.add(blog2);
        blogs.add(blog3);
        blogs.add(blog4);
        blogs.add(blog5);
        blogs.add(blog6);
        blogs.add(blog7);
        blogs.add(blog8);
        blogs.forEach(blog -> {
            System.out.println(blog);
            mapper.addBlog(blog);
        });
        session.commit();
    }

    @Test
    public void queryBlogsByAuthorOrTitleTest() {
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, String> map = new HashMap<>();
        //map.put("author","hins");
        map.put("title", "MQ很简单");
        List<Blog> blogs = mapper.queryBlogsByAuthorOrTitle(map);
        blogs.forEach(blog -> {
            System.out.println(blog);
        });


    }

    @Test
    public void updateByIDTest() {
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, String> map = new HashMap<>();
        map.put("author", "anyway");
        map.put("title", "什么都很简单");
        map.put("id", "d27b5cd031db4daa8e6db779b5bde86b");
        int i = mapper.updateBlog(map);
        if (i > 0) {
            System.out.println("修改成功");
        }
    }

    @Test
    public void queryBlogChooseTest() {
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("author", "hins");
        map.put("title", "什么都很简单");
        map.put("views", 987);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        blogs.forEach(blog -> {
            System.out.println(blog);
        });
    }
    @Test
    public void queryBlogForeachTest(){
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        map.put("ids",ids);
//        map.put("id",2);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        blogs.forEach(blog->{
            System.out.println(blog);
        });
        sqlSession.close();
    }

}
