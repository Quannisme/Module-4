package com.example.casestudy.controller.customer;

import com.example.casestudy.dto.CustomerDto;
import com.example.casestudy.entity.customer.Customer;
import com.example.casestudy.entity.customer.CustomerType;
import com.example.casestudy.service.customer.inter.CustomerService;
import com.example.casestudy.service.customer.inter.CustomerTypeService;
import com.example.casestudy.util.CustomerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerValidator customerValidator;
    @Autowired
    private CustomerService customer;
    @Autowired
    private CustomerTypeService customerType;
    @GetMapping("/listCustomer1")
    public String viewListCustomer(Model model)
    {
        model.addAttribute("customer" , customer.findAll());
        return "customer/listCustomer";
    }
    @GetMapping("/listCustomer12")
    public String viewListCustomer2(Model model)
    {
        model.addAttribute("customer" , customer.findAll());
        return "customer/listCustomerDelete";
    }

    @GetMapping("/createCustomer1")
    public String viewCreateCustomer(Model model)
    {
//        model.addAttribute("customer" , new Customer());
        model.addAttribute("customer",new CustomerDto());
        model.addAttribute("customerType" , customerType.findAll());
        return "customer/createCustomer";
    }
    @PostMapping("/createCustomer1")
    public String doCreateCustomer(@Validated @ModelAttribute("customer") CustomerDto customer1, BindingResult bindingResult,Model model){
//        customer.create(customer1);
        CustomerType customerType1=customerType.findById(customer1.getCustomerType());
        Customer customer2=convertDto(customer1,customerType1);
        customerValidator.validate(customer2,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("customerType" , customerType.findAll());
            return "customer/createCustomer";
        }else {
            customer.create(customer2);
            return "redirect:/customer/listCustomer1";//tren cai thang ma mapping
        }
    }
    @GetMapping("/delete")
    public String deleteCustomer(Model model , @RequestParam("id") int id){
        customer.delete(id);
        return "redirect:/customer/listCustomer1";
    }
    @GetMapping("/edit")
    public String viewEdit(Model model , @RequestParam("id") int id)
    {
        model.addAttribute("customerEdit", customer.findById(id));
        model.addAttribute("customerId" , customerType.findAll());
        return "customer/editCustomer";
    }
    @PostMapping("/edit")
    public String doEdit(@ModelAttribute("customerEdit")Customer customerEdit)
    {
        customer.update(customerEdit);
        return "redirect:/customer/listCustomer1";
    }
    @GetMapping("/listPagging")
    public String viewListCustomer(Model model ,
                                   @RequestParam("page")Optional<Integer>page,
                                   @RequestParam("size")Optional<Integer>size,
                                   @RequestParam("sort")Optional<String>sort)
    {
        int currentPage=page.orElse(1);
        int currentSize=size.orElse(3);
        String currentSort=sort.orElse("name");
        Pageable pageable= PageRequest.of(currentPage-1,currentSize, Sort.by(currentSort).ascending());
        Page<Customer>customers=customer.findAll(pageable);
        model.addAttribute("customer",customers);
        int totalPage = customers.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "/customer/Pagging";
    }
    public Customer convertDto(CustomerDto customerDto, CustomerType customerType){
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setCustomerType(customerType);
        customer.setName(customerDto.getName());
        customer.setBirthDay(customerDto.getBirthDay());
        customer.setGender(customerDto.getGender());
        customer.setIdCard(customerDto.getIdCard());
        customer.setPhone(customerDto.getPhone());
        customer.setEmail(customerDto.getEmail());
        customer.setAddress(customerDto.getAddress());
        return customer;
    }
}
