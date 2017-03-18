package com.bms.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -6659157012565574390L;

	private String firstName;

	private String lastName;

	private String email;

	private Integer mobileNumber;

	private Address address;

	private String avatar;

	public User() {

	}

	public User(String firstName, String lastName, String email,
			Integer mobileNumber, Address address, String avatar) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.avatar = avatar;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return String
				.format("User [firstName=%s, lastName=%s, email=%s, mobileNumber=%s, address=%s, avatar=%s]",
						firstName, lastName, email, mobileNumber, address,
						avatar);
	}

}
