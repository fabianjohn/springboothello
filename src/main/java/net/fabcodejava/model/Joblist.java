package net.fabcodejava.model;

import javax.servlet.http.HttpServletRequest;

import net.fabcodejava.Entity.Job;

public class Joblist {
	//private String compName;
	private String code;
	private String jobTitle;
	private String jobLocation;
	public Joblist() {
		
	}
	

	public Joblist(Job job) {
		this.code = job.getJobId();
		this.jobTitle = job.getJobTitle();
		this.jobLocation = job.getJobLocation();
	}


	public Joblist(String compName, String code, String jobTitle, String jobLocation) {
		super();
		//this.compName = compName;
		this.code = code;
		this.jobTitle = jobTitle;
		this.jobLocation = jobLocation;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public void addJob(Job jobs) {
		// TODO Auto-generated method stub
		
	}


	
	

}

