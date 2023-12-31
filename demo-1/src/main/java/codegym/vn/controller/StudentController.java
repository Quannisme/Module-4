package codegym.vn.controller;

import codegym.vn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student/list")
    public String displaylist(Model model)
    {
        model.addAttribute("student",studentService.findAll());
        return "student/list";
    }
}
