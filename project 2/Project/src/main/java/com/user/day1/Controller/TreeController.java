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
	
	// sort by descending order
	@GetMapping("/P/{field}")
	public List<TreesModel> sortTreesModel(@PathVariable("field") String field) {
		return tser.sortTrees(field);
	}
	
	// pagination
	@GetMapping("/p/{page}/{size}")
	public List<TreesModel> paginationTreesModel(@PathVariable("page")int page, @PathVariable("size") int size) {
		return tser.paginationTrees(page, size);
	}
	
	
}