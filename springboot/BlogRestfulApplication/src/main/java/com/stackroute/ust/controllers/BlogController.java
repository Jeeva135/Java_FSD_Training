package com.stackroute.ust.controllers;

import com.stackroute.ust.domain.Blog;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/blog")
public class BlogController {

    private List<Blog> blogs=new ArrayList<>(
            List.of(new Blog(1,"hfh","12.00","jjj"))
    );
    @GetMapping("")
    public List<Blog> getAll(){
        return blogs;
    }

    @PostMapping()
    public Blog create(@RequestBody Blog blog){
        blogs.add(blog);
        return blog;
    }

    @PutMapping("/{id}")
    public Blog update(@PathVariable int id,@RequestBody Blog blog){
        Blog existing=blogs.stream().
                filter(bl->bl.id()==id).
                findFirst().orElseThrow();
        blogs.remove(existing);
        blogs.add(blog);
        return blog;
    }

    @DeleteMapping("/{id}")
        public Blog delete(@PathVariable int id,@RequestBody Blog blog){
        Blog exist=blogs.stream().filter(b->b.id()==id).findFirst().orElseThrow();
        blogs.remove(exist);
        return exist;
    }


}
