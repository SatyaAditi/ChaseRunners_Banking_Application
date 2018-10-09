package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

@Service
@SessionAttributes
public class LoginController {


public boolean validateUser(UserRepo repo, String email,String password)
{
	List<BankUser> emaillist=repo.findByemail(email);
	for(BankUser u:emaillist)
	{
		System.out.println(u.getPassword());
		String pass=u.getPassword();
		if(password.equals(pass))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	return false;
	
}

public boolean firstTimeLogin(AccountRepo arepo,UserRepo repo, String email)
{
	
	List<BankUser> emaillist=repo.findByemail(email);
	int id;
    
	for(BankUser u:emaillist)
	{
		//id=u.getId();
		List<Account_details> userlist=arepo.findByuser(u);
		for(Account_details a:userlist)
		{
		if(a.getUser()==null)
			return true;
		else
			return false;
		}
	}
	return true;
}
}