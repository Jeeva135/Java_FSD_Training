package com.stackroute.service;

import com.stackroute.domain.Blog;

import com.stackroute.repository.BlogRepository;
import exceptions.BlogAlreadyExistsException;
import exceptions.BlogNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/* This is ServiceImplementation Class which should implement BlogService Interface and override all the implemented methods.
 * Handle suitable exceptions for all the implemented methods*/

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Blog saveBlog(Blog blog) {
        if(blogRepository.existsById(blog.getBlogId())){
            throw new BlogAlreadyExistsException();
        }
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(int id){
        Optional<Blog>blog=blogRepository.findById(id);
        if(blog.isEmpty()){
            throw new BlogNotFoundException();
        }
        return blogRepository.findById(id).get();
    }

    @Override
    public Blog deleteBlog(int id) {
        Optional<Blog> blog = blogRepository.findById(id);
        if(blog.isEmpty()) {
            throw new BlogNotFoundException();
        }
        Blog blo = blogRepository.findById(id).get();
        blogRepository.deleteById(id);
        return blo;
    }

    @Override
    public Blog updateBlog(Blog blog) {
        if (!blogRepository.existsById(blog.getBlogId())){
            throw new BlogNotFoundException();
        }
        return blogRepository.save(blog);
    }

}
