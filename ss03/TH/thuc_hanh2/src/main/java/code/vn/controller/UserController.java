package code.vn.controller;

import code.vn.model.Login;
import code.vn.model.User;
import code.vn.model.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/user/create")
    public ModelAndView showForm()
    {
        return new ModelAndView("create","login",new Login());
    }
    @PostMapping("/create")
    public ModelAndView info(@ModelAttribute("login") Login login)
    {
        User user=UserDao.login(login);
        if(user==null) {
            return new ModelAndView("error");
        }else
        {
            ModelAndView modelAndView=new ModelAndView("info");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
    }
}
