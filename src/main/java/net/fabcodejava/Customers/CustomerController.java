/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fabcodejava.Customers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP Notebook
 */
@Controller
public class CustomerController {
    @Autowired
    CustomerServices service;
    
    
    
    /**
     *
     * @return
     */
   
    
    @GetMapping("/list_user")
	public String viewHomePage(Model model)
	{
		List<Customers>listcustomers = service.findALL();
		model.addAttribute("listcustomers", listcustomers);
		System.out.print("Get / ");
		return "customer_profile";
	}
	
    
    @GetMapping("/register_form")
    public String registerForm(Model model){
       model.addAttribute("customers", new Customers());
        System.out.print("Registration success");
               return "register_form";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCourse(@ModelAttribute("customers") Customers user, Model model) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
                model.addAttribute("message", "Register Success");
                System.out.println("Add success");
                service.save(user);
		return "reg_success";
	}
    
    @RequestMapping("/lo")
    public String profile(){
    return "login_s";
    }
        
    @RequestMapping("/job-search")
    public String jobSearch(){
               return "job-search";
    }
    
     
    
    

}
