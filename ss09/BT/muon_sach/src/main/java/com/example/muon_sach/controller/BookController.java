package com.example.muon_sach.controller;

import com.example.muon_sach.Service.BookService;
import com.example.muon_sach.Service.BookUserService;
import com.example.muon_sach.Service.UserService;
import com.example.muon_sach.entity.BookUser;
import com.example.muon_sach.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/bookU")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;
    @Autowired
    private BookUserService bookUserService;
    @GetMapping("/")
    public String viewLibrary(Model model , @RequestParam(value = "random", required = false) Integer random) {
        if(random==null)
        {
            model.addAttribute("book", bookService.findAll());
        }else {
            model.addAttribute("book", bookService.findAll());
            model.addAttribute("random", random);
        }
        return "bookU/library";
    }
    @GetMapping("/borrow")
    public String viewBorrow(Model model, @RequestParam("id") long id , RedirectAttributes redirectAttributes){
        BookUser bookUser=new BookUser();
        bookUser.setId(random());
        model.addAttribute("random",bookUser.getId());
        model.addAttribute("bookUser", bookUser);
        model.addAttribute("book",bookService.findById(id));
        redirectAttributes.addAttribute("radom",bookUser.getId());
//        redirectAttributes.addFlashAttribute("random","Ma so B")
        return "/bookU/borrow";
    }
    @PostMapping("/borrow")
    public String doBorrow(Model model , @ModelAttribute("bookUser") BookUser bookUser2 , RedirectAttributes redirectAttributes)
    {
        bookUserService.borrowBook(bookUser2.getUser().getIdUser(),bookUser2.getBook().getIdBook(),bookUser2.getId());
        redirectAttributes.addAttribute("random",bookUser2.getId());
        return "redirect:/bookU/" ;
    }
    @GetMapping("/return")
    public String viewReturn(Model model , @RequestParam("id") long id)
    {
        model.addAttribute("bookU",new BookUser());
        model.addAttribute("book",bookService.findById(id));
        return "/bookU/return";
    }
    @PostMapping("/return")
    public String doReturn(Model model , @ModelAttribute("bookU") BookUser bookUser)
    {
        bookUserService.returnBook(bookUser.getUser().getIdUser() , bookUser.getBook().getIdBook() , bookUser.getId());
        return "redirect:/bookU/";
    }
    private int random() {
        int code;
        while (true)
        {
             code = (int) Math.floor(((Math.random() * 89999) + 10000));
            if (userService.findById(code)==null){
                return code;
            }
        }
    }
}
// van de tra sach nhung database lai k xoa di id da tra
