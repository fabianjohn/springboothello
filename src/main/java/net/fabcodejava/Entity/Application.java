package net.fabcodejava.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application")
public class Application {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="application_id")
	
	private Long applicationId;
	private String name;
	private String email;
	
	@Column(name="phone_no")
	private String phoneNo;
	
	private String qualification;
	
	@Column(name="additional_qualification")
	private String additionalQtion;
	
	private String address;
	
	@Column(name="state_origin")
	private String stateOfResident;
	
	private String attachement;
	
	

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Application(Long id, String name, String email, String phoneNo, String qualification, String additionalQtion,
			String address, String stateOfResident, String attachement) {
		super();
		this.applicationId = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.qualification = qualification;
		this.additionalQtion = additionalQtion;
		this.address = address;
		this.stateOfResident = stateOfResident;
		this.attachement = attachement;
	}



	public Long getId() {
		return applicationId;
	}



	public void setId(Long id) {
		this.applicationId = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public String getAdditionalQtion() {
		return additionalQtion;
	}



	public void setAdditionalQtion(String additionalQtion) {
		this.additionalQtion = additionalQtion;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getStateOfResident() {
		return stateOfResident;
	}



	public void setStateOfResident(String stateOfResident) {
		this.stateOfResident = stateOfResident;
	}



	public String getAttachement() {
		return attachement;
	}



	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}



	@Override
	public String toString() {
		return "Application [id=" + applicationId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", qualification=" + qualification + ", additionalQtion=" + additionalQtion + ", address=" + address
				+ ", stateOfResident=" + stateOfResident + ", attachement=" + attachement + "]";
	}
	
	
}
