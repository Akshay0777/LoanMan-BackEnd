package com.loanman.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="request")
public class Request {
	
	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reqId;
	
	private String reqMsg;

	private int status = 1;	// 0 = rejected, 1= pending, 2 = approved
	
	private int officerStatus = 1; // 0 = rejected, 1= pending, 2 = approved
	
	private LocalDate lastDate;
	
	private double amount;
	private int months;


	private int isVerified = 1; // 0 = rejected, 1= pending, 2 = verified
	
	@CreationTimestamp
	private LocalDate createdTime;
	
	
	private LocalDate approvedTime;
	
	private int custId;
	
	//Fetching customer with request table
	@JoinColumn(name="custId", insertable=false, updatable=false)
	@ManyToOne
	@JsonIgnore
	private Customer customer;
	
	//Fetching field officer with the request raised by customer and passed by the admin
	private int officerId;
	@JoinColumn(name="officerId", insertable=false, updatable=false)
	@ManyToOne
	@JsonIgnore
	private FeildOfficer fieldofficer;

	//Default constructor
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Request(String reqMsg, LocalDate lastDate, double amount, int months, Customer customer, FeildOfficer fieldofficer) {
		super();
		this.reqMsg = reqMsg;
		this.lastDate = lastDate;
		this.amount = amount;
		this.months = months;
		this.customer = customer;
		this.fieldofficer = fieldofficer;
	}

	//getters and setters
	public int getReqId() {
		return reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}

	public String getReqMsg() {
		return reqMsg;
	}

	public void setReqMsg(String reqMsg) {
		this.reqMsg = reqMsg;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDate getLastDate() {
		return lastDate;
	}

	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(int isVerified) {
		this.isVerified = isVerified;
	}

	public LocalDate getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDate createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDate getApprovedTime() {
		return approvedTime;
	}

	public void setApprovedTime(LocalDate approvedTime) {
		this.approvedTime = approvedTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public FeildOfficer getFieldofficer() {
		return fieldofficer;
	}

	public void setFieldofficer(FeildOfficer fieldofficer) {
		this.fieldofficer = fieldofficer;
	}

	public int getOfficerStatus() {
		return officerStatus;
	}

	public void setOfficerStatus(int officerStatus) {
		this.officerStatus = officerStatus;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getOfficerId() {
		return officerId;
	}

	public void setOfficerId(int officerId) {
		this.officerId = officerId;
	}
	
	//toString
	@Override
	public String toString() {
		return "Request [reqId=" + reqId + ", reqMsg=" + reqMsg + ", status=" + status + ", officerStatus="
				+ officerStatus + ", lastDate=" + lastDate + ", amount=" + amount + ", months=" + months
				+ ", isVerified=" + isVerified + ", createdTime=" + createdTime + ", approvedTime=" + approvedTime
				+ ", custId=" + custId + ", customer=" + customer + ", officerId=" + officerId + ", fieldofficer="
				+ fieldofficer + "]";
	}
	
	
}
