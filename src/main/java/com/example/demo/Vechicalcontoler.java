package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/Vechical")
public class Vechicalcontoler {
private Vechicalserv vechService;
@Autowired
	public Vechicalcontoler(Vechicalserv vechService1) {
		vechService = vechService1;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<vechicaltestnew1> thevech = vechService.findAll();
		
		// add to the spring model
		theModel.addAttribute("vechical", thevech);
		
		return "Vechicalview";
	}
	
	@PostMapping("/Showupdateform")
	public String Showforupdate(@RequestParam("id1") int theid, Model model) {
		
		// get employees from db
		vechicaltestnew1 thevech = vechService.findById(theid);
		
		model.addAttribute("VECHICALDATA", thevech);
		
		return "Addvech";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id1") int theid, Model model) {
		
		// get employees from db
		vechService.deleteById(theid);
	
		
		return "redirect:/Vechical/list";
	}
    /*@PostConstruct
	public void save() {
    	vechService.save(theEmployee);
	}*/
    @PostMapping("/save")
    public String save(@ModelAttribute ("VECHICALDATA")  vechicaltestnew1 theEmployee) {
    	
    	vechService.save(theEmployee);
    	
    	return "redirect:/Vechical/list";
    }
	@GetMapping("/showFormForAdd")
	public String addvech(Model theModel) {
		
		// get employees from db
		vechicaltestnew1 thevech = new vechicaltestnew1();
		theModel.addAttribute("VECHICALDATA", thevech);
		
		return "Addvech";
	}
	
	@PostMapping("/vechicalput")
	public void updateEmployee(@RequestBody vechicaltestnew1 vechical) {
		
		vechService.save(vechical);
		
		//return vechical;
	}
}
