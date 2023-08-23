package code.vn.controller;

import code.vn.entity.Blog;
import code.vn.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    //    private BlogService blogService;
    @Autowired
    private BlogService blogService;

    //    private BlogController(BlogService blogService){
//        this.blogService =blogService;
//    }
    @GetMapping("/create")
    public String viewCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "/blog/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute Blog blog) {
        System.out.println("8999");
        blogService.create(blog);
        return "redirect:/blog/";
    }

    @GetMapping("/")
    public String viewList(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "/blog/list";
    }
}
