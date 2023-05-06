package com.user.day1.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user.day1.database.TreesModel;

import jakarta.transaction.Transactional;

@Repository
public interface TreeRepo extends JpaRepository<TreesModel, Integer> 
{
     
	


@Query(value="select * from TreesModel",nativeQuery = true)	
public List<TreesModel> getALLData();	

@Query(value="select * from TreesModel where treeid=:id",nativeQuery=true)
public List<TreesModel> byOwnerName(@Param("id") int gid);

@Query(value="select * from TreesModel where treeid between :start and :end",nativeQuery=true)
public List<TreesModel> startEnd(@Param("start") int start,@Param("end") int end);

@Modifying
@Transactional
@Query(value="delete from Treesmodel where treeid=?1 and owner_name=?2",nativeQuery = true)
Integer deleteDet(@Param("id")int gid,@Param("name") String oname);

//JPQL uses Model Names
@Query(value="select c from TreesModel c")
List<TreesModel> getAll();

@Query(value="select c from TreesModel c where c.treeid=?1")
public List<TreesModel> jpql(@Param("id") int gid);

}