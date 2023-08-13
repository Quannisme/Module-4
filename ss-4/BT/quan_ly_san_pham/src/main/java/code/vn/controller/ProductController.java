package code.vn.controller;

import code.vn.model.Product;
import code.vn.serivce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String viewList(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product/list";
    }

    @GetMapping("/create")
    public String viewCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("action", "create");
        return "product/create";
    }

    @PostMapping("/create")
    public String doCreateorEdit(@ModelAttribute("product") Product product, @RequestParam("action") String action) {
        if ("create".equals(action)) {
            productService.add(product);
        } else {
            productService.update(product);
        }
        return "redirect:/product/";
    }

    @GetMapping("/edit")
    public String viewUpdate(Model model, @RequestParam("id") int id) {
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("action", "edit");
        return "product/create";
    }

    @GetMapping("/detail")
    public String viewDetail(Model model, @RequestParam("id") int id) {
        model.addAttribute("product", productService.findById(id));
        return "product/detail";
    }

    @GetMapping("/delete")
    public String doDelete(@RequestParam("id") int id )
    {
        Product product;
        product=productService.findById(id);
       productService.delete(product);
        return "redirect:/product/";
    }
}
