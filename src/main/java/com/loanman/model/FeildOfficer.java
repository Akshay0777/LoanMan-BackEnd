package com.loanman.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="feild_officer")
public class FeildOfficer {
	
	//Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int officerId;
	
	private String name;
	private String password;
	private String email;
	private long phone;
	private boolean isActive;
	private int rating = 5;
	
	//Mapping with table in database
	@OneToMany(mappedBy="fieldofficer", cascade=CascadeType.ALL)
	private List<Request> requests;

	//Default Constructor
	public FeildOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public FeildOfficer(String name, String password, String email, long phone, boolean isActive,
			List<Request> requests) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.isActive = isActive;
		this.requests = requests;
	}

	//Getters and Setters
	public int getOfficerId() {
		return officerId;
	}



	public void setOfficerId(int officerId) {
		this.officerId = officerId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public List<Request> getRequests() {
		return requests;
	}



	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	
	//ToString
	@Override
	public String toString() {
		return "FeildOfficer [officerId=" + officerId + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", isActive=" + isActive + ", rating=" + rating + ", requests=" + requests + "]";
	}
	
	

}
