package code.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/caculator/list")
    public String showCaculator(){
        return "caculator/list";
    }
    @GetMapping("/submit")
    public String doo(@RequestParam("first") int f, @RequestParam("second") int s,@RequestParam("submit") String sub , Model model)
    {
        int cong=f+s;
        int tru=f-s;
        int nhan=f*s;
        int chia=f/s;
        int result;
        switch (sub)
        {
            case "cong":
                result=cong;
                break;
            case "tru":
                result=tru;
                break;
            case "nhan":
                result=nhan;
                break;
            default:
                result=chia;

        }
        model.addAttribute("result",result);
        return "caculator/list";
    }
}
