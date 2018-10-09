package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepo extends JpaRepository<Account_details,Long>{
    
	List<Account_details> findByuser_id(int id);
	List<Account_details> findByuser(BankUser user);
}
