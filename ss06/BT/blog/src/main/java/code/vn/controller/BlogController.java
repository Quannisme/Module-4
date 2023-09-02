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
        model.addAttribute("blog1", new Blog());
        return "/blog/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("blog1") Blog blog) {
        System.out.println("8999");
        blogService.create(blog);
        return "redirect:/blog/";
    }

    @GetMapping("/")
    public String viewList(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "blog/list";
    }
    @GetMapping("/detail")
    public String viewDetail(@RequestParam("id") String id, Model model)
    {
        model.addAttribute("blog",blogService.findById(id));
        return "blog/detail";
    }
    @GetMapping("/delete")
    public String doDelete(@RequestParam("id") String id,@ModelAttribute Blog blogs)
    {
        blogService.deleteBlog(id);
        return "redirect:/blog/";
    }
    @GetMapping("/update")
    public String viewUpdate(Model model,@RequestParam("id")String id)
    {
        model.addAttribute("blog",blogService.findById(id));
        return "blog/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("blog") Blog blog)
    {
        blogService.update(blog);
        return "redirect:/blog/";
    }
}
