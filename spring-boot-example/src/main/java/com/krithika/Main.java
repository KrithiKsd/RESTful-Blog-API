package com.krithika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/blogs")
public class Main {

    private final BlogRepository blogRepository;

    public Main(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @GetMapping
    public List<Blog> getBlogs(){
        return blogRepository.findAll();
    }

    record NewBlogRequest(String title, String content, LocalDateTime dateTime){

    }

    @PostMapping
    public void addBlog(@RequestBody NewBlogRequest request){
        Blog blog=new Blog();
        blog.setTitle(request.title());
        blog.setContent(request.content());
        blog.setTimestamp(LocalDateTime.now());
        blogRepository.save(blog);
    }

    @DeleteMapping("{blogId}")
    public void deleteBlog(@PathVariable("blogId") Integer id){
        blogRepository.deleteById(id);
    }

    @PutMapping("{blogId}")
    public void updateBlog(@PathVariable("blogId") Integer id, @RequestBody NewBlogRequest request){
        Blog blog=new Blog();
        blog.setId(id);
        blog.setTitle(request.title());
        blog.setContent(request.content());
        blog.setTimestamp(LocalDateTime.now());
        blogRepository.save(blog);
    }
}
