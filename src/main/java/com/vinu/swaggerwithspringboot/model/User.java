package com.vinu.swaggerwithspringboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This is a description of this POJO")
public class User {

	@ApiModelProperty(notes = "Here we can add the use of the variable")
	private String firstname;
	@ApiModelProperty(notes = "Here we can add the use of the variable")
	private String lastname;
	@ApiModelProperty(notes = "Here we can add the use of the variable")
	private long mobile;
	@ApiModelProperty(notes = "Here we can add the use of the variable")
	private String city;
	
	public User() {
		super();
	}
	
	public User(String firstname, String lastname, long mobile, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
		this.city = city;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
