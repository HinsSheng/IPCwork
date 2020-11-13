package com.hins.mapper;

import com.hins.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog log);

    /**
     * 根据用户名查询blog如果用户名为空则匹配标题
     * @param map
     * @return
     */
    List<Blog> queryBlogsByAuthorOrTitle(Map map);

    int updateBlog(Map map);
    List<Blog> queryBlogChoose(Map map);
    List<Blog> queryBlogForeach(Map map);
}
