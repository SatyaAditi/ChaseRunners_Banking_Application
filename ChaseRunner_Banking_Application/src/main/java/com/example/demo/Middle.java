package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="middle")
public class Middle {
    @Id 
	
	private double account_no;
    private int id;
	public int getId() {
		return id;
	}
	public Middle(int id, double account_no) {
		super();
		this.id = id;
		this.account_no = account_no;
	}
	@Override
	public String toString() {
		return "Middle [id=" + id + ", account_no=" + account_no + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAccount_no() {
		return account_no;
	}
	public void setAccount_no(double account_no) {
		this.account_no = account_no;
	}
	
	
}
