package code.vn.controller;

import code.vn.modell.Medical;
import code.vn.service.MedicalService;
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
@RequestMapping("/medical")
public class MedicalController {
    private MedicalService medicalService;

    @Autowired
    public MedicalController(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @GetMapping("/")
    public String viewList(Model model) {
        model.addAttribute("medical", medicalService.findAll());
        return "/medical/list";
    }

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("medical", new Medical());
        model.addAttribute("general", getGeneral());
        model.addAttribute("national", getNational());
        model.addAttribute("information", getInformationTransport());
        return "/medical/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("medical") Medical medical) {
        medicalService.create(medical);
        return "redirect:/medical/";
    }

    private List<String> getGeneral() {
        List<String> general = new ArrayList<>();
        general.add("Nam");
        general.add("Nu");
        return general;
    }

    private List<String> getNational() {
        List<String> national = new ArrayList<>();
        national.add("Trung Quoc");
        national.add("Viet Nam");
        national.add("Han Quoc");
        national.add("Nhat Ban");
        return national;
    }

    private List<String> getInformationTransport() {
        List<String> informationTransport = new ArrayList<>();
        informationTransport.add("Tau Bay");
        informationTransport.add("Tau thuyen");
        informationTransport.add("O to");
        informationTransport.add("Khac ");
        return informationTransport;
    }
}
