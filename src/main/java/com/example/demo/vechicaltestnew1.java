package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class vechicaltestnew1 {
@Id
private int id;
private String vname;
private String desc;
private String status;
public vechicaltestnew1() {
	// TODO Auto-generated constructor stub
}

public vechicaltestnew1(int id, String Vname, String Desc, String Status) {
	this.id = id;
	this.vname = Vname;
	this.desc = Desc;
	this.status = Status;
}

	public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

	public String getVname() {
	return vname;
}

public void setVname(String vname) {
	this.vname = vname;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
