package com.sample2.app.shared;

import java.io.Serializable;
import java.util.List;

public class UserDto implements Serializable{

	private static final long serialVersionUID = 5803180886250686321L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVarificationToken;
	private String emailVarificationStatus;
	private List<AddressDto> addresses;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVarificationToken() {
		return emailVarificationToken;
	}
	public void setEmailVarificationToken(String emailVarificationToken) {
		this.emailVarificationToken = emailVarificationToken;
	}
	public String getEmailVarificationStatus() {
		return emailVarificationStatus;
	}
	public void setEmailVarificationStatus(String emailVarificationStatus) {
		this.emailVarificationStatus = emailVarificationStatus;
	}
	public List<AddressDto> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<AddressDto> addresses) {
		this.addresses = addresses;
	}
	
	
	
}
