package com.example.day1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day1.database.Cars;

public interface CarRepo extends JpaRepository<Cars, Integer> {

}
