package net.fabcodejava.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fabcodejava.Entity.Job;
import net.fabcodejava.model.Joblist;
import net.fabcodejava.repositor.JobRepository;



@Service
public class jobServices  {
	
	@Autowired
	JobRepository jobRepo;
	
	public List<Job>listAll(){
		return jobRepo.findAll();
	}

	public Job save(Job job) {
		return jobRepo.save(job);
	}
	
	
	public Optional<Job> get(Long id) {
		// TODO Auto-generated method stub
		return jobRepo.findById(id);
	}

	public List<Job> findJob(String jobTitle) {
		// TODO Auto-generated method stub
		return jobRepo.findByJobTitle(jobTitle);
	}

	public List<Job> findA() {
		// TODO Auto-generated method stub
		return jobRepo.findAll();
	}

	public List<Job> findAll() {
		// TODO Auto-generated method stub
		return jobRepo.findAll();
	}

	

	public Object findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	public Optional<Job> findById(Long jobId) {
		// TODO Auto-generated method stub
		return jobRepo.findById(jobId);
	}

	
	
}
