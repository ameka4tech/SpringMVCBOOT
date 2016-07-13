package com.springcustomer.app.xmlcontroller;

import com.springcustomer.app.ProcessOnCustomer.CustomerService;
import com.springcustomer.app.CustomerInfo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ameya on
 */
@RequestMapping("/customer")
@Controller
public class htmlobjectsourcer {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping({"/listings", "/"})
    public String listCustomers(Model model){
        model.addAttribute("customers", customerService.listAll());
        return "customer/listings";
    }

    @RequestMapping("/display/{id}")
    public String showCustomer(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getById(id));
        return "customer/display";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getById(id));
        return "customer/formfilling";
    }

    @RequestMapping("/new")
    public String newCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "customer/formfilling";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveOrUpdate(Customer customer){
        Customer newCustomer = customerService.saveOrUpdate(customer);
        return "redirect:customer/display/" + newCustomer.getId();
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        customerService.delete(id);
        return "redirect:/customer/listings";
    }

}
