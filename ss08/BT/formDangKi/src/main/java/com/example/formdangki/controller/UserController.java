package com.example.formdangki.controller;

import com.example.formdangki.entity.User;
import com.example.formdangki.service.UserService;
import com.example.formdangki.utils.UserValidator;
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
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService user;
    @Autowired
    private UserValidator userValidator;
    @GetMapping("/create")
    public String viewCreate(Model model)
    {
        model.addAttribute("user" , new User());
        return "/User/create";
    }
    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("user") User user1 , BindingResult bindingResult , Model model) {
        userValidator.validate(user1, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/User/create";
        } else {
            user.create(user1);
            return "redirect:/User/result";
        }
    }
}
