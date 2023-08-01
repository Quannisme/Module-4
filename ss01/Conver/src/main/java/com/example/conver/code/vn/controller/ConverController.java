package com.example.conver.code.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ConverController {
    public double converter(double moneyUSD,double rate) {
        return moneyUSD * rate;
    }
    @GetMapping("/conver/money")
    public String showConvert() {
        return "conver/money";
    }
    @PostMapping("/swap")
    public String currentConvert(@RequestParam double moneyUSD , @RequestParam double rate , Model model)
    {
        model.addAttribute("result",converter(moneyUSD ,rate));
        return "conver/money";
    }
}
