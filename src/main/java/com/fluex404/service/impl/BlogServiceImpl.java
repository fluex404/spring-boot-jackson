package com.fluex404.service.impl;

import com.fluex404.dto.BlogDTO;
import com.fluex404.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    private List<BlogDTO> blogs = Arrays.asList(
            new BlogDTO("title1", "content1", "{\"attr\":false}"),
            new BlogDTO("title2", "content2", "{\"attr\":true, \"attr2\": \"kuda\"}"),
            new BlogDTO("title3", "content3", "{\"attr\":false}"),
            new BlogDTO("title4", "content4", "{\"attr\":true}")
    );

    @Override
    public List<BlogDTO> getBlogs(){
        return this.blogs;
    }
}
