package code.vn.controller;

import code.vn.modell.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @GetMapping("/employee/list")
    public String showCreate(Model model)
    {
        model.addAttribute("employee",new Employee());
        return "/employee/create";
    }
    @PostMapping("/add")
    public String list(@ModelAttribute("employee") Employee employee , Model model)
    {
        model.addAttribute("name",employee.getName());
        model.addAttribute("id",employee.getId());
        model.addAttribute("contactNumber",employee.getContractNumber());
        return "employee/info";
    }

}
