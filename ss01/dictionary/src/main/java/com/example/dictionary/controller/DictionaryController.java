package com.example.dictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    public String translate(String n)
    {
        String eng[]={"hello","bye"};
        String vie[]={"xin chao","tam biet"};
        for (int i = 0; i < vie.length; i++) {
            if(n.equals(vie[i]))
            {
                return eng[i];
            }
        }
        return "Not Found";
    }
    @GetMapping("/translate/world")
    public String showConvert() {
        return "/translate/world";
    }
    @PostMapping("/change")
    public String currentConvert(@RequestParam String world, Model model)
    {
        model.addAttribute("result",translate(world));
        return "/translate/world";
    }
}
