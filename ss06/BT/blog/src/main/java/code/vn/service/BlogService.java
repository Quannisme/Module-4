package code.vn.service;

import code.vn.entity.Blog;
import code.vn.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public interface BlogService {
    List<Blog> findAll();
    void create(Blog blog);
    void update(Blog blog);
    Blog findById(String id);
    void deleteBlog(String id);
}
