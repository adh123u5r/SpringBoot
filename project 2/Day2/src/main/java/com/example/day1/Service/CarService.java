package com.example.day1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day1.Repository.CarRepo;
import com.example.day1.database.Cars;

@Service
public class CarService {

	@Autowired
	public CarRepo crepo;
	
	public Cars  saveInfo(Cars c)
	{
		return crepo.save(c);
	}
}
