package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="bankuser")

public class BankUser {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotNull
	@Size(min=2)
	@Column(name="name")
	private String name;
	@NotNull
	@Size(min=6)
	@Column(name="password")
	private String password;
	@NotNull
	@Email
	
	@Column(name="email")
	private String email;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Account_details account_details;
	
	public Account_details getAccount_details() {
		return account_details;
	}
	public void setAccount_details(Account_details account_details) {
		this.account_details = account_details;
	}
	@Override
	public String toString() {
		return "BankUser [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
	
}
