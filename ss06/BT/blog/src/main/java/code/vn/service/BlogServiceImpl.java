package code.vn.service;

import code.vn.entity.Blog;
import code.vn.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blog;
    @Override
    public List<Blog> findAll() {
        return blog.findAll();
    }

    @Override
    public void create(Blog blog1) {
        blog.save(blog1);
    }

    @Override
    public void update(Blog blog1) {
        blog.save(blog1);
    }

    @Override
    public Blog findById(String id) {
        return blog.findById(id).orElse(null);
    }

    @Override
    public void deleteBlog(String id) {
        blog.deleteById(id);
    }
}
