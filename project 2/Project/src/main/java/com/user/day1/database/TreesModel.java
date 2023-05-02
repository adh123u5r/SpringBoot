package com.user.day1.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TreesModel {
	
	@Id
	private int treeid;
	private String treename;
	private String treemodel;
	private String treecolour;
	private String treeheight;
	private String treeorigin;
	private String treeweight;
	private String treeleaves;
	private String treetypes;
	private String treeseeds;
	public int getTreeid() {
		return treeid;
	}
	public void setTreeid(int treeid) {
		this.treeid = treeid;
	}
	public String getTreename() {
		return treename;
	}
	public void setTreename(String treename) {
		this.treename = treename;
	}
	public String getTreemodel() {
		return treemodel;
	}
	public void setTreemodel(String treemodel) {
		this.treemodel = treemodel;
	}
	public String getTreecolour() {
		return treecolour;
	}
	public void setTreecolour(String treecolour) {
		this.treecolour = treecolour;
	}
	public String getTreeheight() {
		return treeheight;
	}
	public void setTreeheight(String treeheight) {
		this.treeheight = treeheight;
	}
	public String getTreeorigin() {
		return treeorigin;
	}
	public void setTreeorigin(String treeorigin) {
		this.treeorigin = treeorigin;
	}
	public String getTreeweight() {
		return treeweight;
	}
	public void setTreeweight(String treeweight) {
		this.treeweight = treeweight;
	}
	public String getTreeleaves() {
		return treeleaves;
	}
	public void setTreeleaves(String treeleaves) {
		this.treeleaves = treeleaves;
	}
	public String getTreetypes() {
		return treetypes;
	}
	public void setTreetypes(String treetypes) {
		this.treetypes = treetypes;
	}
	public String getTreeseeds() {
		return treeseeds;
	}
	public void setTreeseeds(String treeseeds) {
		this.treeseeds = treeseeds;
	}
	@Override
	public String toString() {
		return "TreesModel [treeid=" + treeid + ", treename=" + treename + ", treemodel=" + treemodel + ", treecolour="
				+ treecolour + ", treeheight=" + treeheight + ", treeorigin=" + treeorigin + ", treeweight="
				+ treeweight + ", treeleaves=" + treeleaves + ", treetypes=" + treetypes + ", treeseeds=" + treeseeds
				+ "]";
	}

}
	