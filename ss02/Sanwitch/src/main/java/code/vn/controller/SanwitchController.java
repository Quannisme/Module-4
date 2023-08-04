package code.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SanwitchController {

    @GetMapping("/sanwitch/input")
    public String showConvert() {
        return "sanwitch/input";
    }

    @PostMapping("/save")
    public String  save(@RequestParam("condiment") String[] condiment, Model model){
        String result = " ";
        for (String s:condiment) {
            result+=s;
        }
        model.addAttribute("result",result);
        return  "sanwitch/input";
    }
}
