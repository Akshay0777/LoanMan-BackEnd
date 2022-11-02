package com.loanman.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="customer")
public class Customer {
	
	//Customer Field
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custId;
	
	private String custName;
	private String password;
	private String email;
	private long phone;
	private String panCard;
	private long adharCard;
	private double salary;
	private String address;
	private boolean isActive;
	private int isLimitExceed = 0;
	private int cibil = 0;		
	
	//Mapping with table in database
	@OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
	List<Request> requests;

	
	//Default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Customer(int custId, String custName, String password, String email, long phone, String panCard,
			long adharCard, double salary, String address, boolean isActive,
			List<Request> requests) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.panCard = panCard;
		this.adharCard = adharCard;
		this.salary = salary;
		this.address = address;
		this.isActive = isActive;
		this.requests = requests;
	}
	
	//Getters and Setters
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@JsonManagedReference
	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
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

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public long getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(long adharCard) {
		this.adharCard = adharCard;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getIsLimitExceed() {
		return isLimitExceed;
	}

	public void setIsLimitExceed(int isLimitExceed) {
		this.isLimitExceed = isLimitExceed;
	}

	public int getRating() {
		return cibil;
	}

	public void setRating(int cibil) {
		this.cibil = cibil;
	}	
	
	
	
	
}
