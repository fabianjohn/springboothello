package net.fabcodejava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fabcodejava.Entity.Application;
import net.fabcodejava.repositor.ApplicationRepository;



@Service
public class ApplicationService {
	
	@Autowired
	ApplicationRepository applicationRepo;
	
	public List<Application>listAll(){
		return applicationRepo.findAll();
	}

	public Application save(Application application) {
		return applicationRepo.save(application);
	}

}
