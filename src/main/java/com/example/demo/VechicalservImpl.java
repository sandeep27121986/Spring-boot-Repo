package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VechicalservImpl implements Vechicalserv{
	
	private vechicalrepo vechicalrepo1;
	@Autowired 
	public VechicalservImpl(vechicalrepo vechicalrepo) {
		// TODO Auto-generated constructor stub
	  vechicalrepo1=vechicalrepo;
	}

	@Override
	public List<vechicaltestnew1> findAll() {
		// TODO Auto-generated method stub
		return vechicalrepo1.findAll();
	}

	@Override
	public vechicaltestnew1 findById(int theId) {
		// TODO Auto-generated method stub
	Optional<vechicaltestnew1> result = vechicalrepo1.findById(theId);
		
	vechicaltestnew1 theEmployee = null;
		
		if (result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theEmployee;
	}

	@Override
	public void save(vechicaltestnew1 thevech) {
		// TODO Auto-generated method stub
		vechicalrepo1.save(thevech);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		vechicalrepo1.deleteById(theId);
		
	}

}
