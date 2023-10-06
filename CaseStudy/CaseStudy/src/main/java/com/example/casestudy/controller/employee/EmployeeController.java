package com.example.casestudy.controller.employee;

import com.example.casestudy.entity.employee.Employee;
import com.example.casestudy.service.employee.inter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DivisionService divisionService;
    @Autowired
    private EducationDegreeService educationDegreeService;
    @Autowired
    private PositionService  positionService;
    @Autowired
    private UserService userService;
    @GetMapping("/listEmployee")
    public String viewList(Model model)
    {
        model.addAttribute("employee",employeeService.findAll());
        return "/employee/listEmployee";
    }
    @GetMapping("/createEmployee")
    public String viewCreate(Model model)
    {
     Employee employee = new Employee();
        model.addAttribute("employee",employee);
        model.addAttribute("educationDegree",educationDegreeService.findAll());
        model.addAttribute("division",divisionService.findAll());
        model.addAttribute("position",positionService.findAll());
        model.addAttribute("user",userService.findAll());
        return "/employee/createEmployee";
    }
    @PostMapping("/createEmployee")
    public String doCreate(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult)
    {
        employeeService.create(employee);
        return "redirect:/employee/listEmployee";//tren cai thang ma mapping
    }
}
