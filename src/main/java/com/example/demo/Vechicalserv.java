package com.example.demo;

import java.util.List;

public interface Vechicalserv {
	public List<vechicaltestnew1> findAll();
	
	public vechicaltestnew1 findById(int theId);
	
	public void save(vechicaltestnew1 theEmployee);
	
	public void deleteById(int theId);
	

}
