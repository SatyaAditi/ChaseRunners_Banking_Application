package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

//import com.example.models.BankUser;

@RestController
@SessionScope
public class UserController {
  
	@Autowired
	UserRepo repo;
	
	@Autowired 
	AccountRepo arepo;
	

    int userid;
    String username;
    String password;
			
	@RequestMapping("index")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("index.jsp");
		System.out.println("hello");
		return mv;
    }
	
	@PostMapping("adduser")
	public BankUser addusers(BankUser u)
	{
		/*ModelAndView mv=new ModelAndView();
		mv.addObject("bankuser", u);*/
	   repo.save(u);
	   return u;
	}
	
	@PostMapping("signin")
	public ModelAndView userprofile(BankUser u,Account_details a)
	{
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("bu",u);
		mv.addObject("ad", a);
		String email=u.getEmail();
		String password=u.getPassword();
		userid=u.getId();
		System.out.println(u.getEmail());
		System.out.println(u.getPassword());
		LoginController l=new LoginController();
		if(l.validateUser(repo,email, password)==true )
		{
			if(l.firstTimeLogin(arepo,repo,email)==true)
			{
				mv.setViewName("AddAccount.jsp");
			}
			else
			{
				mv.setViewName("Profile.jsp");
			}
		}

		else
		{
			mv.setViewName("unsuccessful.jsp");
		}
		
		return mv;
		
	}

	
	
}
