package com.user.day1.Controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.day1.Repository.TreeRepo;
import com.user.day1.database.TreesModel;
import com.user.day1.serv.TreeServ;

@RestController
@RequestMapping("/saveTrees")
public class TreeController {
	
	@Autowired
	public TreeServ tser;
	@PostMapping(" ")
	public TreesModel addDetails(@RequestBody TreesModel tr)
	{
		return tser.saveDetails(tr);
	}
	@GetMapping(" ")
	public List<TreesModel> read()
	{
		return tser.getDetails();
	}
	@GetMapping("/{treeid}")
	public Optional<TreesModel> readById(@PathVariable int treeid)
	{
		return tser.getDetailsById(treeid);
	}
	@PutMapping("/Update")
	public String update(@RequestBody TreesModel lp_model)
	{
		return tser.updateDetails(lp_model);
	}
	@DeleteMapping("/Delete")
	public String delete(@RequestParam ("tid") int treeid)
	{
		return tser.deleteByRequestParamId(treeid);
	}
	
	@GetMapping("/sortAsc/{treename}")
	public List<TreesModel> sortAscend(@PathVariable("treename") String treename)
	{
		return tser.sortAsc(treename);
	}
	@GetMapping("/sortDesc/{treename}")
	public List<TreesModel> sortDesc(@PathVariable("treename") String treename)
	{
		return tser.sortDesc(treename);
	}
	
	@GetMapping("/pagination/{pageNo}/{pageSize}")
	public List<TreesModel> paginationData(@PathVariable("pageNo")int pnu,@PathVariable("pageSize") int psize)
	{
		return tser.paginationData(pnu,psize);
	}
	
	@GetMapping("/pagiantionAndSorting/{pageNo}/{pageSize}/{treename}")
	public List<TreesModel> paginationAndSorting(@PathVariable("pageNo") int pnu,@PathVariable("pageSize") int psize,@PathVariable("treename") String treename)
	{
		return tser.paginationAndSorting(pnu, psize, treename);
	}
	
	@Autowired
	public TreeRepo tre; 
	
	@GetMapping("getG")
	public List<TreesModel> getD()
	{
		return tre.getALLData();
	}
	
	@GetMapping("byOwnerName/{id}")
	public List<TreesModel> getName(@PathVariable("id") int gid)	{
		return tre.byOwnerName(gid);
	}
	
	@GetMapping("startend/{start}/{end}")
	public List<TreesModel> startEnd(@PathVariable("start") int start,@PathVariable("end") int end)	{
		return tre.startEnd(start,end);
	}
	
	@DeleteMapping("delete/{id}/{name}")
	public String deleteGarage(@PathVariable("id") int id,@PathVariable("name") String oname)
	{
		tre.deleteDet(id, oname);
		return "Deleted";
	}
	
	@GetMapping("jpql")
	public List<TreesModel> getJp()
	{
		return tre.getAll();
	}
	
	@GetMapping("jp/{id}")
	public List<TreesModel> getjpql(@PathVariable("id")int gid)
	{
		return tre.jpql(gid);
	}
}
	