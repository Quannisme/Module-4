package code.vn.controller;

import code.vn.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medical")
public class MedicalController {
    private MedicalService medicalService;
    @Autowired
    public MedicalController(MedicalService medicalService){this.medicalService=medicalService;}
    @GetMapping("/")
    public String viewList(Model model)
    {
        model.addAttribute("medical",medicalService.findAll());
        return "/medical/list";
    }
}
