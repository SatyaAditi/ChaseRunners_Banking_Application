package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="account_details")
@SequenceGenerator(name="seq",initialValue=1000)
public class Account_details {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	
	private long account_no;
    
   
	private double account_balance;
	private double amount_withdrawn;
	private double amount_deposited;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private BankUser user;
	
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	@Override
	public String toString() {
		return "Account_details [account_no=" + account_no + ", account_balance=" + account_balance
				+ ", amount_withdrawn=" + amount_withdrawn + ", amount_deposited=" + amount_deposited + "]";
	}
	public BankUser getUser() {
		return user;
	}
	public void setUser(BankUser user) {
		this.user = user;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public double getAmount_withdrawn() {
		return amount_withdrawn;
	}
	public void setAmount_withdrawn(double amount_withdrawn) {
		this.amount_withdrawn = amount_withdrawn;
	}
	public double getAmount_deposited() {
		return amount_deposited;
	}
	public void setAmount_deposited(double amount_deposited) {
		this.amount_deposited = amount_deposited;
	}
	
}
