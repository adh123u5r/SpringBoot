package com.example.day1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day1.Service.CarService;
import com.example.day1.database.Cars;

@RestController
public class CarController {
	
	@Autowired
	public CarService cser;
	
	@PostMapping("/saveCars")
	
	public Cars addDetails(@RequestBody Cars cr)
	{
		return cser.saveInfo(cr);
	}

}
