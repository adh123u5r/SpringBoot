package com.user.day1.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.user.day1.database.TreesModel;


public interface TreeRepo extends JpaRepository<TreesModel, Integer>
{


	
}