package com.huigeng.blog.dao;

import java.util.List;

import com.huigeng.blog.bean.Blog;

public interface BlogDao {
	
	public boolean addBlog(Blog blog);
	public List<Blog> getBlogs();
	public Blog findByBid(Long bid);

}
