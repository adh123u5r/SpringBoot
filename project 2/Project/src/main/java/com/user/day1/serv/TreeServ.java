package com.user.day1.serv;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.user.day1.Repository.TreeRepo;
import com.user.day1.database.TreesModel;

@Service
public class TreeServ {
	@Autowired                      
	TreeRepo tre;
	public TreesModel saveDetails(TreesModel tm)
	{
		return tre.save(tm);
	}
	public List<TreesModel> getDetails()
	{
		return tre.findAll();
	}
	public Optional<TreesModel> getDetailsById(int treeid)
	{
		return tre.findById(treeid);
	}
	public String updateDetails(TreesModel lp_model)
	{
		tre.save(lp_model);
		return "Updated!";
	}
	public String deleteByRequestParamId(int treeid)
	{
		tre.deleteById(treeid);
		return "Deleted!";
	}
	public TreeRepo getTre() {
		return tre;
	}
	public void setTre(TreeRepo tre) {
		this.tre = tre;
	}
    
	// sorting
	public List<TreesModel> sortTrees(String field) {
		return tre.findAll(Sort.by(field).ascending());
	}
	
	// Pagination
	public List<TreesModel> paginationTrees (int page, int size) {
		Page<TreesModel> p = tre.findAll(PageRequest.of(page, size));
		return p.getContent();
	}
}
	