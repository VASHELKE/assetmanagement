package com.assetmanagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_mobile_number")
	private long mobileNumber;

	@Column(name = "user_address")
	private String address;

	@Column(name = "user_email_id")
	private String emailId;

	@Column(name = "user_password")
	private String password;
	
	@Column(name = "user_postion")
	private String userPostion;

	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	//@JoinColumn(name="order_id")
	private List<Order> getListOfOrders=new ArrayList<>();

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserPostion() {
		return userPostion;
	}

	public void setUserPostion(String userPostion) {
		this.userPostion = userPostion;
	}

	public List<Order> getGetListOfOrders() {
		return getListOfOrders;
	}

	public void setGetListOfOrders(List<Order> getListOfOrders) {
		this.getListOfOrders = getListOfOrders;
	}

	
	
	
	
}