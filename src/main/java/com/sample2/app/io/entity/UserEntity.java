package com.sample2.app.io.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name="users")
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1472618201958555270L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private String userId;
	
	@Column(nullable=false, length=50)
	private String firstName;
	
	@Column(nullable=false, length=50)
	private String lastName;
	
	@Column(nullable=false, length=150)
	private String email;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String encryptedPassword;
	private String emailVarifivcationToken;
	private Boolean emailVarificationStatus = false;
	
	@OneToMany(mappedBy = "userDetails", cascade = CascadeType.ALL)
	private List<AddressEntity> addresses;
	
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
	public String getEmailVarifivcationToken() {
		return emailVarifivcationToken;
	}
	public void setEmailVarifivcationToken(String emailVarifivcationToken) {
		this.emailVarifivcationToken = emailVarifivcationToken;
	}
	public Boolean getEmailVarificationStatus() {
		return emailVarificationStatus;
	}
	public void setEmailVarificationStatus(Boolean emailVarificationStatus) {
		this.emailVarificationStatus = emailVarificationStatus;
	}
	public List<AddressEntity> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}
	
	
}
