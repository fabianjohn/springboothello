package net.fabcodejava.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employer")
public class Employer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="employer_id")
	private int  employerId;
	
	@Column(name="company_name")
	private String companyName;
	
	private String address;
	
	private String industry;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="job_location")
	private String jobLocation;
	
	
	private String gender;
	
	@Column(name="contact_person")
	private String contactPerson;
	
	@Column(name="phone_no")
	private String phoneNo;
	
	
	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employer(int employerId, String companyName, String address, String industry, String jobTitle,
			String jobLocation, String gender, String contactPerson, String phoneNo) {
		super();
		this.employerId = employerId;
		this.companyName = companyName;
		this.address = address;
		this.industry = industry;
		this.jobTitle = jobTitle;
		this.jobLocation = jobLocation;
		this.gender = gender;
		this.contactPerson = contactPerson;
		this.phoneNo = phoneNo;
	}
	public int getEmployerid() {
		return employerId;
	}
	public void setEmployerid(int employerId) {
		this.employerId = employerId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Employer [employerid=" + employerId + ", companyName=" + companyName + ", address=" + address
				+ ", industry=" + industry + ", jobTitle=" + jobTitle + ", jobLocation=" + jobLocation + ", gender="
				+ gender + ", contactPerson=" + contactPerson + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
	

}
