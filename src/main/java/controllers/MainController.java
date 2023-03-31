package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.fabcodejava.Entity.Job;
import net.fabcodejava.service.jobServices;

@Controller
public class MainController {

	@Autowired
	jobServices jobService;	
	@GetMapping("/testing")
	public String Testing() {
		
		return "Testing";
	}
	
	
	
}
