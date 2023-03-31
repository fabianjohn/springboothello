package net.fabcodejava.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fabcodejava.Entity.Employer;
import net.fabcodejava.Entity.EmployerRepository;

@Service
public class EmployerService {
	
	@Autowired
	EmployerRepository employerRepo;
	
	public List<Employer>listAll(){
		
		return employerRepo.findAll();
	}
			

	public Employer save(Employer emp) {
		return employerRepo.save(emp);
	}
	
	public Optional<Employer> findById(Long employerId) {
		return employerRepo.findById(employerId);
	}
}
