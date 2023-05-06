package com.user.day1.Controller;


	


	import java.util.List;
	import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.user.day1.database.ModelLogin;
import com.user.day1.serv.ServicesLogin;



	@RestController
	@RequestMapping("/games")
	public class ControllerLogin {

		
			@Autowired
			private ServicesLogin service;
			
			  @PostMapping("/login")
			  public String login(@RequestBody Map<String, String> loginData) {
			    String uname = loginData.get("uname");
			    String pwd = loginData.get("pwd");
			    String result = service.checkLogin(uname, pwd);
			    return result;
			  }
			  @PostMapping("/adduser")
			  	public ModelLogin AddUser(@RequestBody ModelLogin game) 
			  {
				  return service.addUser(game);
			  }
			  @GetMapping
			  public List<ModelLogin> listAll()
			  {
				  return service.getUser();
			  }
	}

