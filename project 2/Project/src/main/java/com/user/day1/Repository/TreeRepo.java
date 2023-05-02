package com.user.day1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.day1.database.TreesModel;


@Repository
public interface TreeRepo extends JpaRepository<TreesModel, Integer> 
{

	

	
}