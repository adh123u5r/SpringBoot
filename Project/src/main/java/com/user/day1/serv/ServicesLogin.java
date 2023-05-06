package com.user.day1.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.day1.Repository.RepoLogin;
import com.user.day1.database.ModelLogin;

@Service
public class ServicesLogin {
	@Autowired
	private RepoLogin repository;
	
	public String checkLogin(String username, String password) {
	    ModelLogin user = repository.findByusername(username);
	    if (user == null) {
	      return "User Not Found";
	    }
	    else{
	    	if(user.getPassword().equals(password)) {	    		
	    		return"Login Succesfull"; 
	    	}
	    	else {
	    		return "Login Failed";
	    	}
	    }
	}
	public ModelLogin addUser(ModelLogin game) {
		return repository.save(game);
	}
	public List<ModelLogin> getUser()
	{
		return repository.findAll();
	}
}


