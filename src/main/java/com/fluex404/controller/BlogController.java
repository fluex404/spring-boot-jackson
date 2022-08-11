package com.fluex404.controller;

import com.fluex404.dto.BlogDTO;
import com.fluex404.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blog")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<BlogDTO>> getBlogs(){
        return ResponseEntity.ok(blogService.getBlogs());
    }
}
