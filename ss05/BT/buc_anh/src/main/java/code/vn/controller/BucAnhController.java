package code.vn.controller;

import code.vn.entity.BucAnh;
import code.vn.service.BucAnhService;
import code.vn.service.BucAnhServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/picture")
public class BucAnhController {
    private BucAnhService bucAnh = new BucAnhServiceImpl();

    @Autowired
    public BucAnhController(BucAnhService bucAnh) {
        this.bucAnh = bucAnh;
    }

    @GetMapping("/")
    public String viewList(Model model) {
        model.addAttribute("feed", bucAnh.findAll());
        return "picture/list";
    }

    @GetMapping("/form")
    public String viewForm(Model model) {
        model.addAttribute("feedback", new BucAnh());
        return "/picture/form";
    }

    @PostMapping("/form")
    public String doForm(Model model, @ModelAttribute("feedback") BucAnh bucAnh1) {
        bucAnh.create(bucAnh1);
        return "redirect:/picture/";
    }
}
