package code.vn.controller;

import code.vn.model.HomThu;
import code.vn.serivice.HomThuServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/homThu")
public class HomThuController {
    private HomThuServiceInter homThuServiceInter;
    @Autowired
    public HomThuController(HomThuServiceInter homThuServiceInter){this.homThuServiceInter=homThuServiceInter;}
    @GetMapping("/")
    public String displayList(Model model)
    {
        model.addAttribute("homThu", homThuServiceInter.FindAll());
        return "homThu/list";
    }
    @GetMapping("/create")
    public String viewCreate(Model model)
    {
        model.addAttribute("homThu", new HomThu());
        model.addAttribute("action","create");
        model.addAttribute("language",getLanguage());
        model.addAttribute("filter",getFilter());
        model.addAttribute("size",getSize());
        return "homThu/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("homThu") HomThu homThu)
    {
        homThuServiceInter.create(homThu);
        return "redirect:/homThu/";
    }
    private List<String> getLanguage() {
        List<String> language = new ArrayList<>();
        language.add("Viet Nam");
        language.add("Nhat Ban");
        language.add("Trung quoc");
        return language;
    }
    private List<String>getSize(){
        List<String >size=new ArrayList<>();
        size.add("23");
        size.add("25");
        size.add("22");
        size.add("21");
        return size;
    }
    private List<String>getFilter(){
        List<String>filter=new ArrayList<>();
        filter.add("enable spams filter");
        return filter;
    }
}
