/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fabcodejava.Customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.fabcodejava.Country.Country;
import net.fabcodejava.Entity.Application;
import net.fabcodejava.Entity.Employer;
import net.fabcodejava.Entity.Job;
import net.fabcodejava.model.Joblist;
import net.fabcodejava.service.ApplicationService;
import net.fabcodejava.service.EmployerService;
import net.fabcodejava.service.jobServices;




/**
 *
 * @author HP Notebook
 */
@Controller
public class CustomerController {
   @Autowired
   CustomerServices service;
    
    @Autowired
    jobServices jobservice;
    
    @Autowired
    ApplicationService applyService;
    
    @Autowired
    EmployerService empService;
    
    
    /**
     *
     * @return
     */
    
    
    @GetMapping("/register")
   public String index()
   {
	   return "login";
   }
    
    @GetMapping("/success")
    public String jobLis()
    {
 	   return "Testing";
    }
     
    
    @GetMapping("/service")
    public String service()
    {
 	   return "service";
    }
    
    @GetMapping("/jobs")
    public String jobsearch()
    {
 	   return "jobsearch";
    }
    
    @GetMapping("/list_user")
	public String viewHomePage(Model model)
	{
		List<Customers>listcustomers = service.findALL();
		model.addAttribute("listcustomers", listcustomers);
		System.out.print("Get / ");
		return "customer_profile";
	}
	
    
    
   
    @GetMapping("/registerpage")
    public String registerForm(Model model){
       model.addAttribute("customers", new Customers());
        System.out.print("Registration successful");
               return "registerpage";
    }
    
    
    @GetMapping("/addjob")
    public String jobForm(Model model){
       model.addAttribute("job", new Job());
        System.out.print("Registration successful");
               return "addjob";
    }
    
    @GetMapping("/listjob")
	public String viewJob(Model model)
	{
		List<Job>listjob = jobservice.listAll();
		model.addAttribute("listjob", listjob);
		System.out.print("Get / ");
		return "job_list";
	}
    
    
    @GetMapping("/viewjobs")
	public String viewJobs(Model model)
	{
    	List<Employer>listEmployer = empService.listAll();
		List<Job>listjob = jobservice.listAll();
		model.addAttribute("listjob", listjob);
		model.addAttribute("listEmployer", listEmployer);
		System.out.print("Get / ");
		return "jobsearch";
	}
    
    @GetMapping("/application")
    public String applicationForm(Model model){
       model.addAttribute("application", new Application());
        System.out.print("Registration successful");
               return "application";
    }
    
    @RequestMapping(value = "/saveApply", method = RequestMethod.POST)
	public String saveApplication(@ModelAttribute("application") Application apply, Model model) {
          
                model.addAttribute("message", "Register Successful");
                System.out.println("Add success");
                applyService.save(apply);
		return "reg_suc";
	}
   
    /*
    @PostMapping("/search")
    public ModelAndView getDetails(@PathVariable(name="jobTitle") String jobTile)
    { 
    ModelAndView mv = new ModelAndView("addjob");
    String job = jobservice.findById(jobTile) .toString();
    mv.addObject(job);
    return mv;
    }
   */ 
    @GetMapping("/employerform")
    public String employerForm(Model model){
       model.addAttribute("employer", new Employer());
        System.out.print("Job added successful");
               return "employer";
    }
    
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCourse(@ModelAttribute("customers") Customers user, Model model) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
                model.addAttribute("message", "Register Successful");
                System.out.println("Add success");
                service.save(user);
		return "reg_success";
	}
    
    
    @RequestMapping(value = "/saved", method = RequestMethod.POST)
	public String saveJob(@ModelAttribute("job") Job newjob, Model model) {
                model.addAttribute("message", "Register Successful");
                System.out.println("Add success");
                jobservice.save(newjob);
		return "redirect:/addjob";
	}
    
    @RequestMapping(value = "/savedEmp", method = RequestMethod.POST)
	public String saveEmp(@ModelAttribute("employer") Employer emp, Model model) {
                model.addAttribute("message", "Register Successful");
                System.out.println("Add success");
                empService.save(emp);
		return "reg_success";
	}
    
    @RequestMapping("/reg")
    public String profile(){
    return "reg_success";
    }
        
    @RequestMapping("/index")
    public String jobSearch(){
               return "index";
    }
    
     @ModelAttribute("countries")
     public List<Country>getCountries(){
    	 List<Country>list = new ArrayList<Country>();
    	 list.add(new Country("Nigeria", "Lagos"));
    	 list.add(new Country("America", "London"));
    	 list.add(new Country("Cameron", "camel"));
    	 list.add(new Country("Niger", "nig"));
    	 return list;
    	 
     }
    
   
     @PostMapping("/getjob")
     public ModelAndView findJob(@RequestParam Long jobId)
     {
     	ModelAndView mv = new ModelAndView("getjob");
     	Job job = jobservice.get(jobId).orElse(new Job()) ;
     	mv.addObject(job);
     	//mv.setViewName("getjob");
     	//System.out.print(jobservice.get(jobId));
    	 return mv;
     }
    
    
     
     @RequestMapping({"/apply"})
    	 public ModelAndView findJob(Job job) {
    	 ModelAndView mv = new ModelAndView();
    	 mv.addObject("obj", job);
    	 mv.setViewName("create_resume");
    	 
    	 return mv;
     }
     //Display object in string formate
     @RequestMapping("/job")
     @ResponseBody
     public String getJob() {
    	 
    	 return jobservice.findAll().toString();
     }
     
     // Json formate
     @RequestMapping("/jobb")
     @ResponseBody
     public List<Job> getJobs() {
    	 
    	 return (List<Job>) jobservice.findAll();
     }
     
     //Search by id
     @RequestMapping("/job/{jobId}")
     @ResponseBody
     public String getJob(@PathVariable("jobId") Long jobId) {
    	 
    	 return jobservice.findById(jobId).toString();
     }
     //search by id json formate
     @RequestMapping("/jobs/{jobId}")
     @ResponseBody
     public Optional<Job> getJobs(@PathVariable("jobId") Long jobId) {
    	 
    	 return (Optional<Job>) jobservice.findById(jobId);
     }
}

