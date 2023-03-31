package net.fabcodejava.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="job_id")
	private String jobId;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="job_location")
	private String jobLocation;
	
	@Column(name="min_salary")
	private String minSalary;
	
	@Column(name="max_salary")
	private String maxSalary;
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(Long id, String jobId, String jobTitle, String jobLocation, String minSalary, String maxSalary) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobLocation = jobLocation;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
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

	public String getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(String minSalary) {
		this.minSalary = minSalary;
	}

	public String getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(String maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", jobId=" + jobId + ", jobTitle=" + jobTitle + ", jobLocation=" + jobLocation
				+ ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + "]";
	}

	

}
